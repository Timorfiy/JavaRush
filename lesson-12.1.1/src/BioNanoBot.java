import java.lang.reflect.InvocationTargetException;
import java.util.Random;

public class BioNanoBot {
    private Class[] playlist;

    public BioNanoBot(Class[] playlist) {
        this.playlist = playlist;
        try {
            ((Music) this.playlist[new Random().nextInt(playlist.length)].getDeclaredConstructor().newInstance()).play();
        } catch (ReflectiveOperationException e) {
            e.printStackTrace();
        }
    }
}