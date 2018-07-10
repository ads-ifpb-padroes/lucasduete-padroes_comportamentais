package command;

import command.commands.*;

import java.time.LocalDate;

public class Controller {

    public void ligarTv() {
        Command command = new LigarTVCommand();
        command.execute();
    }

    public void desligarTv() {
        Command command = new DesligarTVCommand();
        command.execute();
    }

    public void ligarCentralAr(int temperatura) {
        Command command = new LigarCentralArCommand(temperatura);
        command.execute();
    }

    public void desligarCentralAr() {
        Command command = new DesligarCentralArCommand();
        command.execute();
    }

    public void ligarSom(LocalDate date) {
        Command command = new LigarSomCommand(date);
        command.execute();
    }

    public void desligarSom(LocalDate date) {
        Command command = new DesligarSomCommand(date);
        command.execute();
    }
}
