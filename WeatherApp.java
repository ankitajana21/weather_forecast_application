package com.ankitajana21.weather;

import java.io.IOException;
import java.util.Scanner;

public class WeatherApp {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        WeatherAPI api = new WeatherAPI();
        String forecastString = api.getForecast("Kolkata");

        System.out.println(forecastString);
    }
}