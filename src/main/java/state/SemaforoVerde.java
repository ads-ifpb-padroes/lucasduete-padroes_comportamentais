package state;

public class SemaforoVerde implements  Semaforo {

    @Override
    public Semaforo on() {
        return this;
    }

    @Override
    public Semaforo off() {
        return new SemaforoOff();
    }

    @Override
    public Semaforo tick() {
        return new SemaforoAmarelo();
    }

    @Override
    public Semaforo panic() {
        return new SemaforoPanic();
    }

    @Override
    public String status() {
        return "Verde";
    }
}
