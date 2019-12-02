package movies;

public class Movie {
    private String names;
    private String category;

    public Movie(String name, String cat) {
        names = name;
        category = cat;
    }

    public String movieName() {
        return names;
    }

    public String movieCat() {
        return category;
    }

}
