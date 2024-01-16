package com.test.object;

import java.util.Scanner;

public class Movie {
    public static void main(String[] args) {
        MovieClass[] movies = new MovieClass[4];
        movies[0] = new MovieClass(1, "shui", 39.1, 9.9, "xk", "wj", "12wr");
        movies[1] = new MovieClass(2, "sh22ui", 39.1, 9.9, "xk", "wj", "12wr");
        movies[2] = new MovieClass(3, "sh33ui", 39.1, 9.9, "xk", "wj", "12wr");
        movies[3] = new MovieClass(4, "sh44ui", 39.1, 9.9, "xk", "wj", "12wr");
        MovieOperator operator = new MovieOperator(movies);
//        operator.printALLMovies();
//        operator.searchMovieById(3);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("in1||in2");

            int command = sc.nextInt();
            switch (command) {
                case 1:
                    operator.printALLMovies();
                    break;
                case 2:
                    System.out.println("in id?");
                    int id = sc.nextInt();
                    operator.searchMovieById(id);
                    break;
                default:
                    System.out.println("???");
            }
        }
    }
}
