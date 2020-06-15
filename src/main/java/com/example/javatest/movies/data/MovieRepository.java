package com.example.javatest.movies.data;

import com.example.javatest.movies.model.Movie;

import java.util.Collection;

public interface MovieRepository
{
    Movie findById(long id);
    Collection<Movie> findAll();
    void saveOrUpdate(Movie movie);
}
