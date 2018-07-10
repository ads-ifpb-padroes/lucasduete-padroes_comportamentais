package command;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Controller controller = new Controller();

        controller.ligarTv();
        controller.ligarCentralAr(20);
        controller.ligarSom(LocalDate.now());

        controller.desligarTv();
        controller.desligarCentralAr();
        controller.desligarSom(LocalDate.now().plusDays(2));
    }
}
