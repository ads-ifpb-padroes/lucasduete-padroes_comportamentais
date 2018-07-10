package command.commands;

import command.Command;
import command.external.implementations.SomController;
import command.external.interfaces.SomInterface;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class DesligarSomCommand implements Command {

    private SomInterface somInterface;
    private LocalDate date;

    public DesligarSomCommand(LocalDate date) {
        somInterface = new SomController();
        this.date = date;
    }

    @Override
    public void execute() {
        somInterface.desligar(
                Date.from(
                        date
                                .atStartOfDay(ZoneId.systemDefault())
                                .toInstant()
                )
        );
    }
}
