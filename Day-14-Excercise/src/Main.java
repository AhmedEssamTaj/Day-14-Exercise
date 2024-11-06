/*
Author: Ahmed Essam Taj
Date: 6, November
Day 14 - Exercise - Q1

 */

public class Main {
    public static void main(String[] args) {

        Movie movie = new Movie("Mirror 1", 30, "Nolan chris");
        Book book = new Book("java Basics", 375, "Ahmed Taj");

        System.out.println("Movie Name: " + movie.getName());
        System.out.println("Movie director: " + movie.getDirector());
        System.out.println("Movie Price: " + movie.getPrice() + " SAR");
        System.out.println("===================================");
        System.out.println("Book Name: " + book.getName());
        System.out.println("Book Author: " + book.getAuthor());
        System.out.println("Book Price: " + book.getPrice() + " SAR");
        System.out.println();
        System.out.println("-----------------------------------");

        double moviePriceAfterDiscount = movie.getDiscount();
        System.out.println("Movie Price after discount " + moviePriceAfterDiscount + " SAR");
        double bookPriceAfterDiscount = book.getDiscount();
        System.out.println("Book Price after discount " + bookPriceAfterDiscount + " SAR");

    }
}