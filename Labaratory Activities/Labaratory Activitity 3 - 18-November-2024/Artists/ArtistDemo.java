package Artists;

public class ArtistDemo {
    public static void main(String[] args) {
        // Create an instance of Artist (for demonstration)
        Artist artist = new Singer("Ed Sheeran", 35, "Music");

        // Display base details of Artist (this will work for any derived class)
        System.out.println(artist.displayBaseDetails());
        System.out.println();

        // Create instances of each artist type (specific artists)
        Singer singer = new Singer("Charlie Puth", 32, "POP");
        Dancer dancer = new Dancer("Misty Copeland", 40, "Ballet");
        Painter painter = new Painter("Vincent Van Gogh", 37, "Oil");
        Writer writer = new Writer("Shakespeare", 52, "Drama");

        // Display details for each artist
        System.out.println("Singer's Info:");
        System.out.println(singer.displayDetails());
        System.out.println();

        System.out.println("Dancer's Info:");
        System.out.println(dancer.displayDetails());
        System.out.println();

        System.out.println("Painter's Info:");
        System.out.println(painter.displayDetails());
        System.out.println();

        System.out.println("Writer's Info:");
        System.out.println(writer.displayDetails());
    }
}

