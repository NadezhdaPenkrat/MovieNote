package com.movienote.controller;

import com.movienote.model.Genre;
import com.movienote.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/genre")
public class GenreController {

    private final GenreService genreService;
    @Autowired
    public GenreController(GenreService genreService) {
        this.genreService = genreService;
    }

    @GetMapping()
    public List<Genre> getAllGenres() {

        return genreService.getAll();
    }

    @GetMapping("/{name}")
    public Genre getGenre(@PathVariable("name") String name) {

        return genreService.getByName(name);
    }

  @PostMapping()
    public void saveGenre(@RequestBody Genre genre ){

        genreService.save(genre);
    }

    @PutMapping()
    public Genre updateGenre(@RequestBody Genre genre ) {

        return genreService.change(genre);
    }

    @DeleteMapping("/{id}")
    public void deleteGenre(@PathVariable("id") Long id) {

        genreService.delete(id);

    }
}



