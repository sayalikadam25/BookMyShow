package com.example.Book_My_Show.Controller;

import com.example.Book_My_Show.Dtos.TheaterRequestDto;
import com.example.Book_My_Show.Models.TheaterEntity;
import com.example.Book_My_Show.ServiceLayer.TheaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/theater")
public class TheaterController {
    @Autowired
    private TheaterService theaterService;

    @PostMapping("/add-theater")
    public String addTheater(@RequestBody TheaterRequestDto theaterRequestDto){
        return theaterService.addTheater(theaterRequestDto);
    }
}
