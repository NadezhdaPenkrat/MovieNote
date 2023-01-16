package com.movienote.service;

import com.movienote.model.User;

import java.util.List;



public interface UserService {


    List<User> getAll();

    User getByName(String username);

    void save(User user);

    User update(User user);

    void delete (Long id);

}
