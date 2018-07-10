package state;

public class Main {

    public static void main(String[] args) {

        Controller controller = new Controller();

        System.out.println(controller.status());

        controller.on();
        System.out.println(controller.status());

        controller.tick();
        System.out.println(controller.status());


        controller.tick();
        System.out.println(controller.status());

        controller.off();
        System.out.println(controller.status());


        controller.on();
        controller.tick();
        controller.panic();
        System.out.println(controller.status());

        controller.on();
        System.out.println(controller.status());

    }
}
