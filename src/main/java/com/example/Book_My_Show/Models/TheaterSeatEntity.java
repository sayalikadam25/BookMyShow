package com.example.Book_My_Show.Models;

import com.example.Book_My_Show.Enums.SeatType;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="theaterSeat")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TheaterSeatEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String seatNo;
    @Enumerated(value=EnumType.STRING)
    private SeatType seatType;
    private int rate;

    public TheaterSeatEntity(String seatNo, SeatType seatType, int rate) {
        this.seatNo = seatNo;
        this.seatType = seatType;
        this.rate = rate;
    }

    @ManyToOne
    @JoinColumn
    private TheaterEntity theater;



}
