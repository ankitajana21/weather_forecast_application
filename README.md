# Weather Forecast Application

A simple **Java console application** that fetches weather forecast data using the **OpenWeatherMap API** and displays temperature, humidity, and weather descriptions.

## Features

* Fetches weather forecast data from OpenWeatherMap
* Displays temperature in Celsius
* Displays humidity and weather conditions
* Parses JSON API responses
* Uses city-based weather forecasting

## Technologies

* Java
* OpenWeatherMap API
* `HttpURLConnection`
* `org.json`

## Project Structure

```text
weather_forecast_application
├── WeatherApp.java
├── WeatherAPI.java
└── WeatherResponseParser.java
```

## Setup

1. Get an API key from OpenWeatherMap.
2. Add your API key in `WeatherAPI.java`:

```java
private static final String API_KEY = "YOUR_API_KEY";
```

3. Make sure the `org.json` library is available in your project.

4. Run `WeatherApp.java`.

## How It Works

`WeatherApp` takes a city input and requests forecast data through `WeatherAPI`. The JSON response is then processed by `WeatherResponseParser`, which extracts the date, temperature, humidity, and weather description.
