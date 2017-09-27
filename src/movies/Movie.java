package movies;

public class Movie {
    private String name;

    private String category;

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

//constructor/Method for the movie class
    public Movie(String movieName, String movieCategory) {
        this.name = movieName;
        this.category = movieCategory;
    }


}