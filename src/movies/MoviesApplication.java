package movies;

import util.Input;
import java.util.Arrays;

public class MoviesApplication {
    public static Input userIn = new Input();
    public static Movie[] allMovies = MoviesArray.findAll();

    public static void main(String[] args) {
        movieApp();
    }

    private static void movieApp(){

        int menuPrompt = userIn.getInt("What would you like to do?\n" +
                "\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n" +
                "6 - Add a movie\n"+
                "\n" +
                "Enter your choice: ", 0,6);
        System.out.println();
        System.out.println("*----*----*----*----*----*----*----*----*----*");
        switch (menuPrompt){
            case 0:
                System.exit(0);
                break;
            case 1:
//                Movie[] allMovies = MoviesArray.findAll();
                for (Movie movieArray : allMovies) {
                    printMovie(movieArray.movieName(),movieArray.movieCat());
                }
                System.out.println("*----*----*----*----*----*----*----*----*----*");


                movieApp();
                break;
            case 2:
                Movie[] animatedMovie = filterMovies("animated");
                for (Movie movieArray : animatedMovie) {
                    printMovie(movieArray.movieName(),movieArray.movieCat());
                }
                System.out.println("*----*----*----*----*----*----*----*----*----*");

                movieApp();
                break;
            case 3:
                Movie[] dramaMovie = filterMovies("drama");
                for (Movie movieArray : dramaMovie) {
                    printMovie(movieArray.movieName(),movieArray.movieCat());
                }
                System.out.println("*----*----*----*----*----*----*----*----*----*");

                movieApp();
                break;
            case 4:
                Movie[] horrorMovie = filterMovies("horror");
                for (Movie movieArray : horrorMovie) {
                    printMovie(movieArray.movieName(),movieArray.movieCat());
                }
                System.out.println("*----*----*----*----*----*----*----*----*----*");

                movieApp();
                break;
            case 5:
                Movie[] scifiMovie = filterMovies("scifi");
                for (Movie movieArray : scifiMovie) {
                    printMovie(movieArray.movieName(),movieArray.movieCat());
                }
                System.out.println("*----*----*----*----*----*----*----*----*----*");

                movieApp();
                break;
            case 6:
                allMovies = addMovie(allMovies);
                movieApp();
                break;
            default:
                System.out.println();
                movieApp();
                break;
        }
    }

    private static void printMovie(String title,String cat){
        System.out.println(title + " -- "+ cat);
    }

    private static Movie[] filterMovies(String cat){
        int arrayLength = countCat(allMovies,cat);
        Movie[] filteredMovies = new Movie[arrayLength];
        int index = 0;
        for (Movie movie: allMovies) {
            if (movie.movieCat().equalsIgnoreCase(cat)){
                filteredMovies[index] = movie;
                index++;
            }
        }
        return filteredMovies;
    }

    private static int countCat(Movie[] movies, String cat){
        int returnNum = 0;
        for (Movie movie: movies) {
            if(cat.equalsIgnoreCase(movie.movieCat())){
                returnNum++;
            }
        }
        return returnNum;
    }

//  Bonus
    private static Movie[] addMovie(Movie[] moviesList){
        int newLength = moviesList.length+1;
        Movie[] newList = new Movie[newLength];
        System.arraycopy(moviesList, 0, newList, 0, moviesList.length);
        userIn.cleanLines();
        String titlePrompt = userIn.getString("Enter the Movie Title: ");
        String catPrompt = userIn.getString("Enter the movie category: ");
        newList[newLength-1] = new Movie(titlePrompt,catPrompt);
        return newList;
    }



}
