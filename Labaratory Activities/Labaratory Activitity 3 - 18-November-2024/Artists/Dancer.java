package Artists;

public class Dancer extends Artist {
    private String danceStyle;

    public Dancer(String name, int age, String danceStyle) {
        super(name, age, "Dance");
        this.danceStyle = danceStyle;
    }

    @Override
    public String displayDetails() {
        return displayBaseDetails() + "\nDance Style: " + danceStyle;
    }
}
