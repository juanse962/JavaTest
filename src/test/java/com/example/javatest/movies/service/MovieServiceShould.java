package com.example.javatest.movies.service;

import com.example.javatest.movies.data.MovieRepository;
import com.example.javatest.movies.model.Genre;
import com.example.javatest.movies.model.Movie;
import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.listeners.MockitoListener;
import org.omg.CORBA.RepositoryIdHelper;
import sun.font.CoreMetrics;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static com.example.javatest.movies.model.Genre.*;
import static org.junit.Assert.*;

public class MovieServiceShould {

    @Test
    public void return_movies_by_gnre()
    {
        MovieRepository movieRepository = Mockito.mock(MovieRepository.class);
        Mockito.when(movieRepository.findAll()).thenReturn(Arrays.asList(
                new Movie(1, "Dark Knight", 152, ACTION),
                new Movie(2, "Memento", 113, THRILLER),
                new Movie(3, "There's Something About Mary", 119, COMEDY),
                new Movie(4, "Super 8", 112, THRILLER),
                new Movie(5, "Scream", 111, HORROR),
                new Movie(6, "Home Alone", 103, COMEDY),
                new Movie(7, "Matrix", 136, ACTION)
        ));

        MovieService movieService = new MovieService(movieRepository);
        Collection<Movie> movies = movieService.findMovieByGenre(ACTION);
        List<Integer> moviesId = movies.stream().map(movie -> movie.getId()).collect(Collectors.toList());

        assertThat(moviesId, CoreMatchers.is(Arrays.asList(1,7)));
    }
}