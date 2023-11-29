package com.example.spring.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;

@Component
public class RestUtil {
    @Value("${movie.api}")
    private String movieApi;
    @Value("${movie.key}")
    private String movieApiKey;

    //https://omdbapi.com/?s=Spiderman&apikey=5b9b7798
    private Logger logger = LoggerFactory.getLogger(RestUtil.class);

    @Autowired
    private RestTemplate restTemplate;

    public Map getMovieByName(String name) {
        logger.info(movieApi);
        String url = movieApi + "?s=" + name + "&apikey=" + movieApiKey;
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<Map> requestEntity = new HttpEntity<>(httpHeaders);
        requestEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, Map.class);
        return requestEntity.getBody();
    }
}
