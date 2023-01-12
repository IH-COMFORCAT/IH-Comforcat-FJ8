import java.util.*;

public class IOSPlayer implements Playable {
    private final int MAX_VOLUME = 1;
    private double volume;

    public IOSPlayer(double volume) {
        setVolume(volume);
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        if (volume > MAX_VOLUME) {
            this.volume = MAX_VOLUME;
        } else if (volume < 0) {
            this.volume = 0;
        } else {
            this.volume = volume;
        }
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
        setVolume(this.volume+volume);
    }
}
