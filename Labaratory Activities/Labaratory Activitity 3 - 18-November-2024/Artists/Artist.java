
package Artists;

public abstract class Artist {
    private String name;
    private int age;
    private String specialty;

    public Artist(String name, int age, String specialty) {
        this.name = name;
        this.age = age;
        this.specialty = specialty;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSpecialty() {
        return specialty;
    }

    // Method to display basic artist details
    public String displayBaseDetails() {
        return "Artist Name: " + name + "\nAge: " + age + "\nSpecialty: " + specialty;
    }

    // Abstract method to be overridden in the derived classes
    public abstract String displayDetails();
}
