public class Repeater {
    private String trajectory = "parabolic";
    private int frequency = 30;

    //напишите тут ваш код

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public String getTrajectory() {
        return trajectory;
    }

    public void setTrajectory(String trajectory) {
        this.trajectory = trajectory;
    }

    @Override
    public String toString() {
        return String.format("Repeater trajectory is %s, with a %dGHz communication frequency.", trajectory, frequency);
    }
}