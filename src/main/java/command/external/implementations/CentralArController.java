package command.external.implementations;

import command.external.interfaces.CentralArInterface;

public class CentralArController implements CentralArInterface {

    @Override
    public void Ligar(int temperatura) {
        System.out.println(String.format("Ligou a Central de Ar na temperatura: %d", temperatura));
    }

    @Override
    public void desligar() {
        System.out.println("Desligou a Central de Ar.");
    }
}
