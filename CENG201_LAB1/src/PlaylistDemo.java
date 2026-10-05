/**
 * PlaylistDemo.java
 * Driver program to test the Track class.
 *
 * Name:        Yakup Bartu Başkaya
 * Student ID:  240444051
 * Date:        05/10/2026
 * Exercise 1
 */
public class PlaylistDemo {
    public static void main(String[] args) {
        System.out.println("=== Playlist Track Demo ===\n");

        // Default track
        Track defaultTrack = new Track();
        System.out.println("Default Track:");
        System.out.println(defaultTrack);

        // Track with a title only
        Track titleOnlyTrack = new Track("Neon Lights");
        System.out.println("\nTitle-only track:");
        System.out.println(titleOnlyTrack);

        // Track with title + artist
        Track titleArtistTrack = new Track("Ocean Drive", "Midnight Pulse");
        System.out.println("\nTitle + Artist Track:");
        System.out.println(titleArtistTrack);

        // Full track details
        Track fullTrack = new Track("Raindrop Waltz", "Clara Voss", 210, false);
        System.out.println("\nFull Track (non-explicit):");
        System.out.println(fullTrack);

        // Negative duration test
        System.out.println("\nInvalid Duration Test:");
        Track invalidTrack = new Track("Broken Clock", "Static Noise", -12, false);
        System.out.println(invalidTrack);

        // Getter checks
        Track getterTrack = new Track("Stardust", "Stellar Echo", 242, true);
        System.out.println("\nGetter Test:");
        System.out.println("Title:     " + getterTrack.getTitle());
        System.out.println("Artist:    " + getterTrack.getArtist());
        System.out.println("Duration:  " + getterTrack.getDurationFormatted());
        System.out.println("Explicit:  " + getterTrack.isExplicit());

        // Verify duration getter
        if (getterTrack.getDurationSeconds() != 242) {
            throw new AssertionError("Duration getter returned an incorrect value.");
        }
    }
}