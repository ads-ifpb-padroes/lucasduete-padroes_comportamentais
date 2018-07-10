package command.external.implementations;

import command.external.interfaces.TvInterface;

public class TvController implements TvInterface {

    @Override
    public void LigarTV() {
        System.out.println("Ligou a TV.");
    }

    @Override
    public void DesligarTV() {
        System.out.println("Desligou a TV.");
    }
}
