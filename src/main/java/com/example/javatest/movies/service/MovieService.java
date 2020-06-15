package com.example.javatest.movies.service;

import com.example.javatest.movies.data.MovieRepository;
import com.example.javatest.movies.model.Genre;
import com.example.javatest.movies.model.Movie;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class MovieService {

    private MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Collection<Movie> findMovieByGenre(Genre genre)
    {
        return movieRepository.findAll().stream()
                .filter(movie -> movie.getGenre() == genre).collect(Collectors.toList());
    }

    public Collection<Movie> findMovieByLength(int length)
    {
        return movieRepository.findAll().stream()
                .filter(movie -> movie.getMinutes() <= length).collect(Collectors.toList());

    }
    

}
