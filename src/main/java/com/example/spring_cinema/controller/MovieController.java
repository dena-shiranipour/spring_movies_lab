package com.example.spring_cinema.controller;
import com.example.spring_cinema.model.Movie;
import com.example.spring_cinema.services.MovieServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(value = "/movies")
public class MovieController {

    @Autowired
    MovieServices moviesServices;

//    @GetMapping(value = "/{id}")
//    public ResponseEntity<Movie> getMovie(@PathVariable long id) {
//        Optional<Movie> movies = moviesServices.getMovieById(id) ;
//
//            if (movies.isEmpty()) {
//                return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
//            } else return new ResponseEntity<>(movies.get(), HttpStatus.OK);
//
//    }
//
//    @GetMapping
//    public ResponseEntity<List<Movie>> getMovieList() {
//        List<Movie> movies = moviesServices.retrieveList();
//        return new ResponseEntity<>(movies, HttpStatus.CREATED);
//    }


    @PostMapping
    public ResponseEntity<Movie> newMovie(@RequestBody Movie newMovie) {
        Movie movie = moviesServices.addNewMovie(newMovie);
        return new ResponseEntity<>(movie, HttpStatus.CREATED);
    }

    @PatchMapping
    public ResponseEntity<Movie>updateAMovie(@RequestBody Movie movie, @PathVariable long id){
        Movie existingMovie = moviesServices.addNewMovie(newMovie());
                return new ResponseEntity<>(movie, HttpStatus.OK);
    }
//


}



//
//A MovieController with the following routes:
//GET /movies
//GET /movies/{id}
//POST /movies