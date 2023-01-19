package com.example.Book_My_Show.ServiceLayer;

import com.example.Book_My_Show.Dtos.UserRequestDto;
import com.example.Book_My_Show.Models.UserEntity;
import com.example.Book_My_Show.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public String createUser(UserRequestDto userRequestDto){
        UserEntity userEntity=UserEntity.builder().name(userRequestDto.getName()).mobile(userRequestDto.getMobile()).build();
        try{
            userRepository.save(userEntity);

        } catch (Exception e){
            return "User cannot be added";
        }
        return "User added successfully";
    }

}
