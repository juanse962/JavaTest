package com.example.javatest.movies.data;

import com.example.javatest.movies.model.Genre;
import com.example.javatest.movies.model.Movie;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import java.util.Collection;

public class MovieRepositoryJdbc implements MovieRepository {

   private final JdbcTemplate jdbcTemplate;

  public MovieRepositoryJdbc(JdbcTemplate jdbcTemplate)
  {
    this.jdbcTemplate = jdbcTemplate;
  }

     @Override
    public Movie findById(long id)
  {
    Object[] args = { id };
        return jdbcTemplate.queryForObject("SELECT * FROM movies WHERE id = ?", args,movieMapper);
  }

    @Override
    public Collection<Movie> findAll()
    {
      return jdbcTemplate.query("SELECT * FROM movies", movieMapper);
    }
    @Override
    public void saveOrUpdate(Movie movie)
    {
      jdbcTemplate.update("INSERT INTO movies (name,minutes,genre) values(?,?,?)"
              ,movie.getName(),movie.getMinutes(),movie.getGenre().toString());

    }
      private static final RowMapper<Movie> movieMapper = (resultSet, i) ->
              new Movie(
              resultSet.getInt("id"),
              resultSet.getString("name"),
              resultSet.getInt("minutes"),
              Genre.valueOf(resultSet.getString("genre")));
}


