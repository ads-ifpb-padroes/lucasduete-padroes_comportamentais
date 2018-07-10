package observer;

public class SMSObserver implements Observer {

    @Override
    public void notificar() {
        System.out.println("Enviou um SMS boladaun!!11!");
    }
}
