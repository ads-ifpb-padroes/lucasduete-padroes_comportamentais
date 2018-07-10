package state;

public class Controller {

    private Semaforo semaforo;

    public Controller() {
        semaforo = new SemaforoOff();
    }

    public void on() {
        semaforo = semaforo.on();
    }

    public void off() {
        semaforo = semaforo.off();
    }

    public void tick() {
        semaforo = semaforo.tick();
    }

    public void panic() {
        semaforo = semaforo.panic();
    }

    public String status() {
        return semaforo.status();
    }

}
