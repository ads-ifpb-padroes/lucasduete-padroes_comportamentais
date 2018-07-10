package command.external.implementations;

import command.external.interfaces.SomInterface;

import java.time.LocalDate;
import java.util.Date;

public class SomController implements SomInterface {

    @Override
    public void Ligar(Date date) {
        System.out.println(String.format("Ligou o Som na data: %s", date.toString()));
    }

    @Override
    public void desligar(Date date) {
        System.out.println(String.format("O Som irá desligar na data: %s", date.toString()));
    }
}
