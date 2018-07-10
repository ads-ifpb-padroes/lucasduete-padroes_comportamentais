package command.commands;

import command.Command;
import command.external.implementations.TvController;
import command.external.interfaces.TvInterface;

public class DesligarTVCommand implements Command {

    private TvInterface tvInterface;

    public DesligarTVCommand() {
        tvInterface = new TvController();
    }

    @Override
    public void execute() {
        tvInterface.DesligarTV();
    }
}
