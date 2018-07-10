package state;

public class SemaforoAmarelo implements Semaforo {

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
        return new SemaforoVermelho();
    }

    @Override
    public Semaforo panic() {
        return new SemaforoPanic();
    }

    @Override
    public String status() {
        return "Amarelo";
    }
}
