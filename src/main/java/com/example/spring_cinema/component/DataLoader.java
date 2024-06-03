package com.example.spring_cinema.component;

import com.example.spring_cinema.services.MovieServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


    @Component
    public class DataLoader implements ApplicationRunner {

        @Autowired
        MovieServices movieService;

        @Override
        public void run(ApplicationArguments args) throws Exception {
        }
    }
