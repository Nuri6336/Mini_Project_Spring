package com.nuri.librarymanagementsystem.service;

import com.nuri.librarymanagementsystem.entity.BorrowedBookEntity;
import com.nuri.librarymanagementsystem.exception.CustomException;
import com.nuri.librarymanagementsystem.model.UserDto;

import java.util.List;

public interface UserService {

    UserDto createUser(UserDto user) throws Exception;
    UserDto getUser(String email);
    UserDto getUserByUserId(String userid) throws CustomException;

    List<BorrowedBookEntity> getBorrowedBook(Integer userId) throws CustomException;
    List<BorrowedBookEntity> getCurrentBorrowedBook(Integer userId) throws CustomException;

    void borrowedBookById(Integer bookId) throws CustomException;
    void returnBook(Integer bookId) throws CustomException;

    List<BorrowedBookEntity> getUserHistory();

}
