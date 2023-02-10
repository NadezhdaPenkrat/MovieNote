package com.movienote.controller;

import com.movienote.dto.DTO;
import com.movienote.dto.GenreDto;
import com.movienote.service.AbstractService;
import com.movienote.service.TmdbUriBuildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

import java.net.URISyntaxException;
import java.util.*;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/search")
public class TmdbSearchController {

    private final TmdbUriBuildService uriBuildService;
    private final AbstractService abstractService;


    @Autowired
    public TmdbSearchController(TmdbUriBuildService uriBuildService,
                                @Qualifier("GenreService") AbstractService abstractService) {
        this.uriBuildService = uriBuildService;
        this.abstractService = abstractService;
    }

    WebClient webClient = WebClient.create();

    @GetMapping("/genres")
    public Flux<DTO> getAllGenreTmdb() throws URISyntaxException {
        Flux<DTO> genreflux = webClient
                .get()
                .uri(uriBuildService.createGenreSearchUrlBuilder())
                .retrieve()
                .bodyToFlux(DTO.class);
        List<DTO> collectGenres = genreflux.toStream().collect(Collectors.toList());// оформить в коллекцию
        DTO firstGenres = collectGenres.iterator().next();// достать из массива

        for (GenreDto genres : firstGenres.getGenres()) { // перебор массива
            abstractService.save(genres.toGenre()); // каждый сохранить в базе
        }
        return genreflux;
    }

}
