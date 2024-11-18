package Artists;

public class Writer extends Artist {
    private String writingStyle;

    public Writer(String name, int age, String writingStyle) {
        super(name, age, "Writing");
        this.writingStyle = writingStyle;
    }

    @Override
    public String displayDetails() {
        return displayBaseDetails() + "\nWriting Style: " + writingStyle;
    }
}
