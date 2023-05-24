/*
Двигатель — сердце автомобиля
*/

public class Car {
    //напишите тут ваш код
    Engine engine = new Engine();
    public class Engine {
        private boolean isRunning;
        public void start() {
            isRunning = true;
        }

        public void stop() {
            isRunning = false;
        }

    }
}
