public interface Playable {


    void playSong();
    void playSong(String song);
    void pause();
    String showCurrentSong();
    void forward();
    void back();
    void increaseVolume(double volume);
}
