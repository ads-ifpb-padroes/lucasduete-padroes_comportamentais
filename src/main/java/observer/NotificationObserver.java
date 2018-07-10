package observer;

public class NotificationObserver implements Observer {

    @Override
    public void notificar() {
        System.out.println("Enviou uma notificação no meio da noite e acordou os mlk tudo.");
    }
}
