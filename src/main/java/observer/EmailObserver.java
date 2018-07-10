package observer;

public class EmailObserver implements Observer {

    @Override
    public void notificar() {
        System.out.println("Enviou Email LIKE SPAM xD");
    }
}
