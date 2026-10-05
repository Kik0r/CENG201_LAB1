/**
 * Track.java
 * Represents a single music track in a streaming playlist.
 *
 * Name:        Yakup Bartu Başkaya
 * Student ID:  240444051
 * Date:        05/10/2026
 * Exercise 1
 */
public class Track {
    // Fields for the track
    private String title;
    private String artist;
    private int durationSeconds;
    private boolean isExplicit;

    // Full constructor for a track
    public Track(String title, String artist, int durationSeconds, boolean isExplicit) {
        this.title = title;
        this.artist = artist;

        if (durationSeconds < 0) {
            System.out.println("Warning: Invalid duration. Setting to 0.");
            this.durationSeconds = 0;
        } else {
            this.durationSeconds = durationSeconds;
        }

        this.isExplicit = isExplicit;
    }

    // Constructor for title + artist
    public Track(String title, String artist) {
        this(title, artist, 0, false);
    }

    // Constructor for title only
    public Track(String title) {
        this(title, "Unknown Artist", 0, false);
    }

    // Default track values
    public Track() {
        this("Unknown Title", "Unknown Artist", 0, false);
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getDurationSeconds() {
        return durationSeconds;
    }

    public boolean isExplicit() {
        return isExplicit;
    }

    // Show duration as minutes:seconds
    public String getDurationFormatted() {
        int minutes = durationSeconds / 60;
        int seconds = durationSeconds % 60;
        return String.format("%d:%02d", minutes, seconds);
    }

    // Easy-to-read track summary
    @Override
    public String toString() {
        String summary = "\"" + title + "\" by " + artist + " [" + getDurationFormatted() + "]";
        if (isExplicit) {
            summary += " [EXPLICIT]";
        }
        return summary;
    }
}