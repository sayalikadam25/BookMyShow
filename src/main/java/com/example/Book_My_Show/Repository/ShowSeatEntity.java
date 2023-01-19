package com.example.Book_My_Show.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowSeatEntity extends JpaRepository<ShowSeatEntity,Integer> {
}
