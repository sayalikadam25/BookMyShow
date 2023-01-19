package com.example.Book_My_Show.Controller;

import com.example.Book_My_Show.Dtos.MovieRequestDto;
import com.example.Book_My_Show.ServiceLayer.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movie")
public class MovieController {
    @Autowired
    private MovieService movieService;

    @PostMapping("/add-movie")
    public String addMovie(@RequestBody MovieRequestDto movieRequestDto){
        return movieService.addMovie(movieRequestDto);
    }


}
