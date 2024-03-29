package repository.webApp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import repository.webApp.models.Movie;
import repository.webApp.repositories.MovieRepository;

import java.util.Optional;

@RestController
@RequestMapping(path = "/apis/movie")
public class MovieController {

    @Autowired
    private MovieRepository movieRepository;

    @PostMapping
    public Movie addMovie(@RequestBody @Validated Movie movie){
        movieRepository.save(movie);
        return movie;
    }

    @GetMapping
    public Iterable<Movie> getMovie(){
        return movieRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public Optional<Movie> getMovie(@PathVariable int id){
        return movieRepository.findById(id);
    }

    @DeleteMapping
    public Movie removeMovie(@RequestBody Movie movie){
        movieRepository.delete(movie);
        return movie;
    }

    @DeleteMapping(path = "/{id}")
    public void removeMovie(@PathVariable int id){
        movieRepository.deleteById(id);
    }
}
