public class Human {
    private BioNanoBot[] bioNanoBots = new BioNanoBot[30];

    public void load(Class[] playlist) {
        for (int i = 0; i < bioNanoBots.length; i++) {
            bioNanoBots[i] = new BioNanoBot(playlist.clone());
        }
    }
}
