public class Song {
    String title;
    String artist;
    int durationInSeconds;

    public Song(){
        this.title = title;
        this.artist = artist;
        this.durationInSeconds = durationInSeconds;
    }

    public void displaySongInfo(String title, String artist, int durationInSeconds){
        System.out.println("The title of the song is " + title + " and the artist, who has sung this song is " + artist + " the duration is " + durationInSeconds + " minutes");
    }

    public static void main(String[] args) {
        Song songInfo = new Song();

        songInfo.displaySongInfo("Aura", "Shubh", 3);
    }
}
