public class TransportShip {
    public Integer speed;
    public Integer acceleration;
    public Passenger[] passengers;
    public OnBoardSystem onBoardSystem = new OnBoardSystem();

    public class OnBoardSystem {
        public Integer calculateJumpTime(Integer distance) {
            //напишите тут ваш код
            double time = (-speed + Math.sqrt(speed * speed + 2 * acceleration * distance))/acceleration;
            return (int) time;
        }
    }
}