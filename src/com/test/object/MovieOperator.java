package com.test.object;

public class MovieOperator {
    private MovieClass[] movies;

    public MovieOperator(MovieClass[] movies) {
        this.movies = movies;
    }

    public void printALLMovies() {
        System.out.println("---allmovie---");
        for (int i = 0; i < movies.length; i++) {
            MovieClass m = movies[i];
            System.out.println("id" + m.getId());
            System.out.println("name" + m.getName());
            System.out.println("price" + m.getPrice());
            System.out.println("--------------");
        }

    }

    public void searchMovieById(int id) {
        for (int i = 0; i < movies.length; i++) {
            MovieClass m = movies[i];
            if (m.getId() == id) {
                System.out.println("id" + m.getId());
                System.out.println("name" + m.getName());
                System.out.println("price" + m.getPrice());
                System.out.println("score" + m.getScore());
                System.out.println("Diretor" + m.getDiretor());
                System.out.println("Actor" + m.getActor());
                System.out.println("info" + m.getInfo());
                System.out.println("--------------");
                return;
            }
        }
        System.out.println("no");
    }
}
