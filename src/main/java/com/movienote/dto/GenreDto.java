package com.movienote.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.movienote.model.Genre;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class GenreDto {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("name")
    private String name;

    public Genre toGenre() {
        Genre genre = new Genre();
        genre.setExternalId(id);
        genre.setName(name);
        return genre;
    }

    public GenreDtoUpdate fromGenre(Genre genre) {
        GenreDtoUpdate genreDto = new GenreDtoUpdate();
        genreDto.setId(genre.getExternalId());
        genreDto.setName(genre.getName());
        return genreDto;
    }
}


