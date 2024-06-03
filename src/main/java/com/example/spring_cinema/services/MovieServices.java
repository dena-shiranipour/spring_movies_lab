package com.example.spring_cinema.services;

import com.example.spring_cinema.model.Movie;
import com.example.spring_cinema.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieServices {
    @Autowired
    MovieRepository movieRepository;


    public MovieServices(){
    }

    public Optional<Movie> getMovieById(long id){
        return movieRepository.findById(id);
    }

    public List<Movie> retrieveList(){ //to return a movie list:
        return movieRepository.findAll();
    }

    public Movie addNewMovie(Movie movie){
    movieRepository.save(movie);
    return movie;
    }






}
