package com.projects.SpringbootInPractice.service;

import com.projects.SpringbootInPractice.config.AppProperties;
import org.springframework.stereotype.Service;

@Service
public class AppService {

    private final AppProperties apProperties;

    public AppService(AppProperties appProperties){
        this.apProperties = appProperties;
    }

    public AppProperties getApProperties() {
        return apProperties;
    }
}
