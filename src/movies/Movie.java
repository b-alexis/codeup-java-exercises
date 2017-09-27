package movies;

//constructors/ variable assigning
public class Movie {
    private String name;

    private String category;

    //getters
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