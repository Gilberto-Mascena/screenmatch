package br.com.mascenadev.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DataSeasons(@JsonAlias("Season") Integer temporada,
                          @JsonAlias("Episodes") List<DataEpisodes> episodios) {
}
