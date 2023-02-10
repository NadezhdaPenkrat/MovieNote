package com.movienote.service;

import com.movienote.dto.MovieDto;

import java.util.List;

public interface FetchSortedUserMoviesService {

    List<MovieDto> fetchSortedMovieByTitle(MovieDto dto);

    List<MovieDto> fetchSortedMovieRating(MovieDto dto);

    List<MovieDto> fetchSortedMovieStatus(MovieDto dto);

    MovieDto fetchSortedMovieCreated(MovieDto dto);
}
