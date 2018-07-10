package observer;

public class Main {

    public static void main(String[] args) {

        Topico topico1 = new Topico("Java", "Vocês concordam que Java 10 tá uma merda?");
        topico1.addObserver(new SMSObserver());
        topico1.addObserver(new EmailObserver());
        topico1.addObserver(new NotificationObserver());

        topico1.publicar();

        System.out.printf("\n\n");

        Topico topico2 = new Topico("XML", "Pq nego ainda usa XML??? PQP");
        topico2.addObserver(new EmailObserver());
        topico2.addObserver(() -> System.out.println("Lambda Observer <3 :P"));

        topico2.publicar();
    }
}
