package com.learnwiremock.service;

import com.learnwiremock.contants.MoviesAppConstants;
import com.learnwiremock.dto.Movie;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

public class MoviesRestClient {

    private WebClient webClient;

    public MoviesRestClient(WebClient webClient) {
        this.webClient = webClient;
    }

    public List<Movie> retrieveAllMovies() {

        webClient.get().uri(MoviesAppConstants.GET_ALL_MOVIES_V1)
            .retrieve()
            .bodyToFlux(Movie.class)
            .blockFirst();

        return retrieveAllMovies();
    }

}
