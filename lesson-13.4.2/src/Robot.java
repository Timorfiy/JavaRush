import java.util.List;

public class Robot {

    private final List<Core> cores;

    public Robot(List<Core> cores) {
        this.cores = cores;
    }

    public List<Core> getCores() {
        return cores;
    }
}