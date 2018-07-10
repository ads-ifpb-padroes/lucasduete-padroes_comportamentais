package state;

public class SemaforoPanic implements Semaforo {

    @Override
    public Semaforo on() {
        return new SemaforoVermelho();
    }

    @Override
    public Semaforo off() {
        return this;
    }

    @Override
    public Semaforo tick() {
        return this;
    }

    @Override
    public Semaforo panic() {
        return this;
    }

    @Override
    public String status() {
        return "Vermelho - Panic";
    }
}
