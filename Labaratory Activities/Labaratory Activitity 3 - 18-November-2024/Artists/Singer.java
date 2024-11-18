public class Singer extends Artist {
    private String genre;

    public Singer(String name, int age, String genre) {
        super(name, age, "Music");
        this.genre = genre;
    }

    @Override
    public String displayDetails() {
        return displayBaseDetails() + "\nGenre: " + genre;
    }
}
