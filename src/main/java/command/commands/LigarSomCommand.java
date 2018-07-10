package command.commands;

import command.Command;
import command.external.implementations.SomController;
import command.external.interfaces.SomInterface;

import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;

public class LigarSomCommand implements Command {

    private SomInterface somInterface;
    private LocalDate date;

    public LigarSomCommand(LocalDate date) {
        somInterface = new SomController();
        this.date = date;
    }

    @Override
    public void execute() {
        somInterface.Ligar(
                Date.from(
                        date
                                .atStartOfDay(ZoneId.systemDefault())
                                .toInstant()
                )
        );
    }
}
