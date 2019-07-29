package com.company.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListOfMovie {

    public ListOfMovie() {
    }

    public static void filtredByMovie(){

        List<Movie> movies1 = createListOfMovie();
        List<Movie> movies2 = createListOfMovies();

        Map<String, Double> groupByGenre;
        groupByGenre = Stream.concat(movies1.stream(),movies2.stream())
                        .collect(Collectors
                        .groupingBy(Movie::getGenre,Collectors.averagingDouble(Movie::getTicketPrice)));

        Map<String, Long> countGenre = Stream.concat(movies1.stream(),movies2.stream())
                                             .collect(Collectors.groupingBy(Movie::getGenre,Collectors.counting()));

        System.out.println("Average ticket price by genre : \n" + groupByGenre + "\n");
        System.out.println("Number of movies by genre : \n" + countGenre + "\n");
    }

    public static List<Movie> createListOfMovie(){

        List<Movie> movies1 = new ArrayList<>();

        movies1.add(new Movie("Comedy",15.20));
        movies1.add(new Movie("Detective",18.60));
        movies1.add(new Movie("Drama",13.80));
        movies1.add(new Movie("Comedy",16.60));
        movies1.add(new Movie("Drama",12.80));

        return movies1;
    }
    public static List<Movie> createListOfMovies() {

        List<Movie> movies2 = new ArrayList<>();
        movies2.add(new Movie("Detective", 10.40));
        movies2.add(new Movie("Drama", 20.20));
        movies2.add(new Movie("Comedy", 25.80));
return movies2;

    }
}
