package movies;

import util.Input;


public class MoviesApplication {
    public static Input userIn = new Input();
    public static Movie[] allMovies = MoviesArray.findAll();
    public static Boolean searchError = false;

    public static void main(String[] args) {
        movieApp();
    }

    private static void movieApp() {

        int menuPrompt = userIn.getInt("What would you like to do?\n" +
                "\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n" +
                "6 - Bonus:\n" +
                "6 - Add a movie\n" +
                "7 - Search for movies by custom category\n" +
                "8 - Search for movies by title\n" +
                "9 - Remove movie by title\n" +
                "10- Remove movies by category\n" +
                "\n" +
                "Enter your choice: ", 0, 10);
        System.out.println();
        System.out.println("*----*----*----*----*----*----*----*----*----*");
        switch (menuPrompt) {
            case 0:
                System.exit(0);
                break;
            case 1:
                for (Movie movieArray : allMovies) {
                    printMovie(movieArray.movieName(), movieArray.movieCat());
                }
                System.out.println("*----*----*----*----*----*----*----*----*----*");
                movieApp();
                break;
            case 2:
                Movie[] animatedMovie = filterMovies("animated");
                if (!searchError) {
                    for (Movie movieArray : animatedMovie) {
                        printMovie(movieArray.movieName(), movieArray.movieCat());
                    }
                }
                System.out.println("*----*----*----*----*----*----*----*----*----*");

                movieApp();
                break;
            case 3:
                Movie[] dramaMovie = filterMovies("drama");
                if (!searchError) {
                    for (Movie movieArray : dramaMovie) {
                        printMovie(movieArray.movieName(), movieArray.movieCat());
                    }
                }
                System.out.println("*----*----*----*----*----*----*----*----*----*");

                movieApp();
                break;
            case 4:
                Movie[] horrorMovie = filterMovies("horror");
                if (!searchError) {
                    for (Movie movieArray : horrorMovie) {
                        printMovie(movieArray.movieName(), movieArray.movieCat());
                    }
                }
                System.out.println("*----*----*----*----*----*----*----*----*----*");

                movieApp();
                break;
            case 5:
                Movie[] scifiMovie = filterMovies("scifi");
                if (!searchError) {
                    for (Movie movieArray : scifiMovie) {
                        printMovie(movieArray.movieName(), movieArray.movieCat());
                    }
                }
                System.out.println("*----*----*----*----*----*----*----*----*----*");

                movieApp();
                break;
            case 6:
                allMovies = addMovie(allMovies);
                movieApp();
                break;
            case 7:
                customCategory();
                movieApp();
                break;
            case 8:
                searchTitle();
                movieApp();
                break;
            case 9:
                allMovies = removeMovieByTitle();
//                for (Movie movieArray : allMovies) {
//                    printMovie(movieArray.movieName(), movieArray.movieCat());
//                }
                if (!searchError){
                    System.out.println("Movie Removed\n");
                }else {
                    System.out.println("Error: movie not found!\n");
                }
                System.out.println("*----*----*----*----*----*----*----*----*----*");
                movieApp();
                break;
            case 10:
                allMovies = removeMovieByCat();
                if (!searchError){
                    System.out.println("Movies Removed\n");
                }else {
                    System.out.println("Error: category not found!\n");
                }
                System.out.println("*----*----*----*----*----*----*----*----*----*");
                movieApp();
                break;
            default:
                System.out.println();
                movieApp();
                break;
        }
    }

    private static void printMovie(String title, String cat) {
        System.out.println(title + " -- " + cat);
    }

    private static Movie[] filterMovies(String cat) {
        searchError = false;
        int arrayLength = countCat(allMovies, cat);
        if (arrayLength == 0) {
            System.out.println("Error: no movies fit that category");
            searchError = true;
            return allMovies;
        }
        Movie[] filteredMovies = new Movie[arrayLength];
        int index = 0;
        for (Movie movie : allMovies) {
            if (movie.movieCat().equalsIgnoreCase(cat)) {
                filteredMovies[index] = movie;
                index++;
            }
        }
        return filteredMovies;
    }

    private static int countCat(Movie[] movies, String cat) {
        int returnNum = 0;
        for (Movie movie : movies) {
            if (cat.equalsIgnoreCase(movie.movieCat())) {
                returnNum++;
            }
        }
        return returnNum;
    }

    //  Bonus
    private static Movie[] addMovie(Movie[] moviesList) {
        int newLength = moviesList.length + 1;
        Movie[] newList = new Movie[newLength];
        System.arraycopy(moviesList, 0, newList, 0, moviesList.length);
        userIn.cleanLines();
        String titlePrompt = userIn.getString("Enter the Movie Title: ");
        String catPrompt = userIn.getString("Enter the movie category: ");
        newList[newLength - 1] = new Movie(titlePrompt, catPrompt);
        return newList;
    }

    private static void customCategory() {
        userIn.cleanLines();
        String catPrompt = userIn.getString("Enter a movie Category: ");
        Movie[] customList = filterMovies(catPrompt);
        if (!searchError) {
            for (Movie movieArray : customList) {
                printMovie(movieArray.movieName(), movieArray.movieCat());
            }
        }
        System.out.println("*----*----*----*----*----*----*----*----*----*");
    }

    private static void searchTitle() {
        userIn.cleanLines();
        String titlePrompt = userIn.getString("Enter a movie Title: ");
        Movie[] customList = filterMoviesByName(titlePrompt);
        if (!searchError) {
            for (Movie movieArray : customList) {
                printMovie(movieArray.movieName(), movieArray.movieCat());
            }
        }
        System.out.println("*----*----*----*----*----*----*----*----*----*");
    }

    private static int countTitle(Movie[] movies, String name) {
        int returnNum = 0;
        for (Movie movie : movies) {
            if (name.equalsIgnoreCase(movie.movieName())) {
                returnNum++;
            }
        }
        return returnNum;
    }

    private static Movie[] filterMoviesByName(String name) {
        searchError = false;
        int arrayLength = countTitle(allMovies, name);
        if (arrayLength == 0) {
            System.out.println("Error: no movies fit that Title");
            searchError = true;
            return allMovies;
        }
        Movie[] filteredMovies = new Movie[arrayLength];
        int index = 0;
        for (Movie movie : allMovies) {
            if (movie.movieName().equalsIgnoreCase(name)) {
                filteredMovies[index] = movie;
                index++;
            }
        }
        return filteredMovies;
    }

    private static Movie[] removeMovieByTitle() {
        userIn.cleanLines();
        String titlePrompt = userIn.getString("Enter a movie Title: ");
        Movie[] customList = filterMoviesByName(titlePrompt);
        Movie[] newList = new Movie[allMovies.length - 1];
        int index = 0;
        if (!searchError) {
            for (Movie allMovie : allMovies) {
                if (!customList[0].movieName().equalsIgnoreCase(allMovie.movieName())) {
                    newList[index] = allMovie;
                    index++;
                }
            }
            return newList;
        } else {
            return allMovies;
        }

    }

    private static Movie[] removeMovieByCat() {
        userIn.cleanLines();
        String catPrompt = userIn.getString("Enter a movie category: ");
        Movie[] customList = filterMovies(catPrompt);
        Movie[] newList = new Movie[allMovies.length - customList.length];
        int index = 0;
        if (!searchError) {
            for (Movie allMovie : allMovies) {
                if (!catPrompt.equalsIgnoreCase(allMovie.movieCat())) {
                    newList[index] = allMovie;
                    index++;
                }
            }
            return newList;
        } else {
            return allMovies;
        }

    }


}
