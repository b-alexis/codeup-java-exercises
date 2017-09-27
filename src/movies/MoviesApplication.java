package movies;

import util.Input;


public class MoviesApplication {
    public static void main(String[] args) {
        Input input = new Input();

        System.out.println("What would you like to do?\n" + "\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n");
        System.out.println("Enter a number");


        int option = input.getInt();
        System.out.println(option);
        if (option == 0) {
            System.out.println("Be that way");
        } else if (option == 1) {
            Movie[] allMovie = MoviesArray.findAll();
            for (Movie movie : allMovie) {
                System.out.println(movie.getName());
            }

        }

    }


}

