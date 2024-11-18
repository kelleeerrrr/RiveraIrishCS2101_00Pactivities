package Artists;

public class Painter extends Artist {
    private String medium;

    public Painter(String name, int age, String medium) {
        super(name, age, "Visual Arts");
        this.medium = medium;
    }

    @Override
    public String displayDetails() {
        return displayBaseDetails() + "\nMedium: " + medium;
    }
}
