package com.example.Book_My_Show.ServiceLayer;

import com.example.Book_My_Show.Dtos.MovieRequestDto;
import com.example.Book_My_Show.Models.MovieEntity;
import com.example.Book_My_Show.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    public String addMovie(MovieRequestDto movieRequestDto){
        //Converting movieDto to movie entity to save it to database
        MovieEntity movie=MovieEntity.builder().movieName(movieRequestDto.getMovieName()).releaseDate(movieRequestDto.getReleaseDate()).build();
        movieRepository.save(movie);
        return "Movie added successfully";
    }
}
