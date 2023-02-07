package com.movienote.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Setter
@Getter
public class GenreDtoUpdate {

    private Long id;
    private String name;

    public GenreDtoUpdate toGenre(GenreDto genreDto) {
        GenreDtoUpdate genre = new GenreDtoUpdate();
        genre.setId(id);
        genre.setName(name);
        return genre;
    }

    public GenreDtoUpdate fromGenre(GenreDtoUpdate genre) {
        GenreDtoUpdate genreDto = new GenreDtoUpdate();
        genreDto.setId(genre.getId());
        genreDto.setName(genre.getName());
        return genreDto;
    }
}
