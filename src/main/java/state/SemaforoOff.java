package state;

public class SemaforoOff implements Semaforo {

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
        return new SemaforoPanic();
    }

    @Override
    public String status() {
        return "Amarelo - OFF";
    }
}
