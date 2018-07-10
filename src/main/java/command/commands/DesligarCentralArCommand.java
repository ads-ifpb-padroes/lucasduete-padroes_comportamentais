package command.commands;

import command.Command;
import command.external.implementations.CentralArController;
import command.external.interfaces.CentralArInterface;

public class DesligarCentralArCommand implements Command {

    private CentralArInterface centralArInterface;

    public DesligarCentralArCommand() {
        centralArInterface = new CentralArController();
    }

    @Override
    public void execute() {
        centralArInterface.desligar();
    }
}
