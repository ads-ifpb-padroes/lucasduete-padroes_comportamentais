package state;

public interface Semaforo {

    public Semaforo on();
    public Semaforo off();
    public Semaforo tick();
    public Semaforo panic();
    public String status();
}
