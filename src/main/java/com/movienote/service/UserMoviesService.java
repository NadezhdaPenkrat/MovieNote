package com.movienote.service;


import com.movienote.model.UserMovies;

import java.util.List;



public interface UserMoviesService {


    List<UserMovies> getListByUserId(Long id);

    UserMovies getById(Long id);

    UserMovies save(UserMovies userMovies);

    UserMovies change(UserMovies userMovies);

    void delete(Long id);
}
