package command.commands;

import command.Command;
import command.external.implementations.TvController;
import command.external.interfaces.TvInterface;

public class LigarTVCommand implements Command {

    private TvInterface tvInterface;

    public LigarTVCommand() {
        tvInterface = new TvController();
    }

    @Override
    public void execute() {
        tvInterface.LigarTV();
    }
}
