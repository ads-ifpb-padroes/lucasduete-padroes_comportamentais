package command.commands;

import command.Command;
import command.external.implementations.CentralArController;
import command.external.interfaces.CentralArInterface;

public class LigarCentralArCommand implements Command {

    private CentralArInterface centralArInterface;
    private int temperatura;

    public LigarCentralArCommand(int temperatura) {
        this.centralArInterface = new CentralArController();
        this.temperatura = temperatura;
    }

    @Override
    public void execute() {
        centralArInterface.Ligar(this.temperatura);
    }
}
