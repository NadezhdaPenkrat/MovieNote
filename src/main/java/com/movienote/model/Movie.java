package com.movienote.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "movies")
@Getter
@Setter
@NoArgsConstructor
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "adult")
    private boolean adult;

    @Column(name = "backdrop_path")
    private String poster;

    @Column(name = "language")
    private String language;

    @Column(name = "title")
    private String title;

    @Column(name = "overview")
    private String overview;

    @Column(name = "external_id")
    private Long externalId;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "movie_genres", joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "genre_id"))
    private Set<Genre> genres;

    @OneToMany (mappedBy="movie", cascade = CascadeType.DETACH)
    private Set<UserMovies> userMovie;

}
