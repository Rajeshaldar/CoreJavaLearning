package party;

public class Main {
    public static void main(String[] args) {
        Song myFavoriteSong = new Song();
        User.listen(myFavoriteSong); // User listens to the song
        DJ.mix(myFavoriteSong);      // DJ mixes the same song
    }
}
