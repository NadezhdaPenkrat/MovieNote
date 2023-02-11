package com.movienote.service;

import com.movienote.dto.GenreDto;
import com.movienote.model.Genre;
import com.movienote.repository.GenreJpaRepository;
import com.movienote.service.impl.GenreServiceImplementation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Optional;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
public class GenreServiceTest {
    @Mock
    private GenreJpaRepository genreJpaRepository;
    @InjectMocks
    private GenreServiceImplementation genreServiceImplementation;

    public GenreServiceTest() {
        genre = null;
    }

    @Test
    public void testGetAllListGenre() {

        final String genreName = "Thriller";
        Genre genre = new Genre();
        genre.setName(genreName);
        genreJpaRepository.save(genre);

        List<Genre> found = (List<Genre>) genreJpaRepository.findByName(genreName);
        Assertions.assertEquals(1, found.size());
        Assertions.assertEquals(genre, found.get(0));

    }


    @Test
    public void testGetGenreByName() {

        final String genreName = "Thriller";
        Genre genre = new Genre();
        genre.setName(genreName);
        genreJpaRepository.save(genre);

        List<Genre> found = (List<Genre>) genreJpaRepository.findByName(genreName);
        Assertions.assertEquals(1, found.size());
        Assertions.assertEquals(genre, found.get(0));

    }

    @Test
    public void testSaveGenre() {

        final String genreName = "Thriller";
        Genre genre = new Genre();
        genre.setName(genreName);
        genreJpaRepository.save(genre);

        List<Genre> found = (List<Genre>) genreJpaRepository.findByName(genreName);
        Assertions.assertEquals(1, found.size());
        Assertions.assertEquals(genre, found.get(0));

    }

    @Test
    public void testUpdateGenre() {
        when(genreJpaRepository.findById(genre.getId())).thenReturn(Optional.of(genre));
        when(genreDto.fromGenre(any()).toGenre(genreDto));

        genreServiceImplementation.change(genre);
        verify(genreJpaRepository);

        final String genreName = "Thriller";
        Genre genre = new Genre();
        genre.setName(genreName);
        genreJpaRepository.save(genre);

        List<Genre> found = (List<Genre>) genreJpaRepository.findByName(genreName);
        Assertions.assertEquals(1, found.size());
        Assertions.assertEquals(genre, found.get(0));

    }

    private Genre genre;
    private GenreDto genreDto;

    @Test
    public void testDeleteGenreById() {

        genreServiceImplementation.delete(genre.getId());
        verify(genreJpaRepository);

    }

    private void verify(GenreJpaRepository genreJpaRepository) {
    }

}
