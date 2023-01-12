public class AndroidPlayer implements Playable{
    private final int MAX_VOLUME = 100;
    private double volume;

    public AndroidPlayer(double volume) {
        this.volume = volume;
    }

    public int getMAX_VOLUME() {
        return MAX_VOLUME;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public void playSong() {

    }

    @Override
    public void playSong(String song) {

    }

    @Override
    public void pause() {

    }

    @Override
    public String showCurrentSong() {
        return null;
    }

    @Override
    public void forward() {

    }

    @Override
    public void back() {

    }

    @Override
    public void increaseVolume(double volume) {

    }
}
