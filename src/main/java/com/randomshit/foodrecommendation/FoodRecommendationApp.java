package com.randomshit.foodrecommendation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableHystrix
public class FoodRecommendationApp {
    public static void main(String[] args) {
        SpringApplication.run(FoodRecommendationApp.class);
    }
}
