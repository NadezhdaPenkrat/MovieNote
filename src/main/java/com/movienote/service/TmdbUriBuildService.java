package com.movienote.service;

import lombok.extern.slf4j.Slf4j;
import org.apache.http.client.utils.URIBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.net.URISyntaxException;


public interface TmdbUriBuildService {

    public String createGenreSearchUrlBuilder() ;
    public String createMoviesSearchByTitleUrlBuilder(String title) ;
}
