package com.company.task3;

public class Movie {

    private String genre;
    private double ticketPrice;

    public Movie(String genre, double ticketPrice) {
        this.genre = genre;
        this.ticketPrice = ticketPrice;
    }

    public String getGenre() {
        return genre;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "genre='" + genre + '\'' +
                ", ticketPrice=" + ticketPrice +
                '}';
    }
}
