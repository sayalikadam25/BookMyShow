package com.example.Book_My_Show.ServiceLayer;

import com.example.Book_My_Show.Dtos.TheaterRequestDto;
import com.example.Book_My_Show.Enums.SeatType;
import com.example.Book_My_Show.Models.TheaterEntity;
import com.example.Book_My_Show.Models.TheaterSeatEntity;
import com.example.Book_My_Show.Repository.TheaterRepository;
import com.example.Book_My_Show.Repository.TheaterSeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TheaterService {
    @Autowired
    private TheaterRepository theaterRepository;
    @Autowired
    private TheaterSeatRepository theaterSeatRepository;

    public String addTheater(TheaterRequestDto theaterRequestDto){
        TheaterEntity theater=TheaterEntity.builder().name(theaterRequestDto.getName()).city(theaterRequestDto.getCity()).address(theaterRequestDto.getAddress()).build();
        List<TheaterSeatEntity> theaterSeats = createTheaterSeat();

        theater.setListOfTheaterSeats(theaterSeats);
        for(TheaterSeatEntity theaterSeat: theaterSeats){
            theaterSeat.setTheater(theater);
        }
        theaterRepository.save(theater);
        return "Theater added successfully";
    }
    private List<TheaterSeatEntity> createTheaterSeat(){
        List<TheaterSeatEntity> seatList=new ArrayList<>();
        TheaterSeatEntity theaterSeat1=new TheaterSeatEntity("1A", SeatType.CLASSIC,100);
        TheaterSeatEntity theaterSeat2=new TheaterSeatEntity("1B", SeatType.CLASSIC,100);
        TheaterSeatEntity theaterSeat3=new TheaterSeatEntity("1C", SeatType.CLASSIC,100);
        TheaterSeatEntity theaterSeat4=new TheaterSeatEntity("1D", SeatType.CLASSIC,100);
        TheaterSeatEntity theaterSeat5=new TheaterSeatEntity("1E", SeatType.CLASSIC,100);
        TheaterSeatEntity theaterSeat6=new TheaterSeatEntity("2A", SeatType.PLATINUM,200);
        TheaterSeatEntity theaterSeat7=new TheaterSeatEntity("2A", SeatType.PLATINUM,200);
        TheaterSeatEntity theaterSeat8=new TheaterSeatEntity("2A", SeatType.PLATINUM,200);
        TheaterSeatEntity theaterSeat9=new TheaterSeatEntity("2A", SeatType.PLATINUM,200);
        TheaterSeatEntity theaterSeat10=new TheaterSeatEntity("2A", SeatType.PLATINUM,200);

        seatList.add(theaterSeat1);
        seatList.add(theaterSeat2);
        seatList.add(theaterSeat3);
        seatList.add(theaterSeat4);
        seatList.add(theaterSeat5);
        seatList.add(theaterSeat6);
        seatList.add(theaterSeat7);
        seatList.add(theaterSeat8);
        seatList.add(theaterSeat9);
        seatList.add(theaterSeat10);
        theaterSeatRepository.saveAll(seatList);
        return seatList;
    }
}
