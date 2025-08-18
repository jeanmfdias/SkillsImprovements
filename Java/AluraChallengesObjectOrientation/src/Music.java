public class Music {
    private String title;
    private String artist;
    private int launchYear;
    private double rating;
    private int totalRating;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getLaunchYear() {
        return launchYear;
    }

    public void setLaunchYear(int launchYear) {
        this.launchYear = launchYear;
    }

    public double getRating() {
        return rating;
    }

    public int getTotalRating() {
        return totalRating;
    }

    public void details() {
        String message = """
                Title: %s
                Artist: %s
                Launch year: %d
                Rating: %.2f
                """.formatted(this.title, this.artist, this.launchYear, this.rating);
        System.out.println(message);
    }

    public void rate(double rate) {
        this.rating += rate;
        this.totalRating++;
    }

    public double getMediaRating() {
        return this.rating / this.totalRating;
    }
}
