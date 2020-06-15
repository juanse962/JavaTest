package com.example.javatest.movies.service;

import com.example.javatest.movies.data.MovieRepository;
import com.example.javatest.movies.model.Genre;
import com.example.javatest.movies.model.Movie;
import org.hamcrest.CoreMatchers;
import org.junit.Before;
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
    private MovieRepository movieRepository;
    private MovieService movieService;

    @Before
    public void setUp() {
        movieRepository = Mockito.mock(MovieRepository.class);
        Mockito.when(movieRepository.findAll()).thenReturn(Arrays.asList(
                new Movie(1, "Dark Knight", 152, ACTION),
                new Movie(2, "Memento", 113, THRILLER),
                new Movie(3, "There's Something About Mary", 119, COMEDY),
                new Movie(4, "Super 8", 112, THRILLER),
                new Movie(5, "Scream", 111, HORROR),
                new Movie(6, "Home Alone", 103, COMEDY),
                new Movie(7, "Matrix", 136, ACTION)
        ));

        movieService = new MovieService(movieRepository);
    }

    private List<Integer> getMoviesId(Collection<Movie> movies) {
        return movies.stream().map(Movie::getId).collect(Collectors.toList());
    }

    @Test
    public void return_movies_by_gnre()
    {
        Collection<Movie> movies = movieService.findMovieByGenre(ACTION);

        assertThat(getMoviesId(movies), CoreMatchers.is(Arrays.asList(1, 7)));
    }

    @Test
    public void return_movies_by_duration()
    {
        Collection<Movie> movies = movieService.findMovieByLength(119);

        assertThat(getMoviesId(movies), CoreMatchers.is(Arrays.asList(2,3,4,5,6)));
    }

}