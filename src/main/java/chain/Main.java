package chain;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws CoinNaoAceita, DinheiroInsuficienteException {

        Slot slotChain = new Slot1Real();
        slotChain.setProximo(new Slot50());

         int produto = -1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o código do produto:");
        System.out.println("1 : Refrigerante(R$3,50)");
        System.out.println("2 : Salgadinho (R$2,00)");
        System.out.println("3 : Chocolate (R$1,00)");

        produto = scanner.nextInt();

        System.out.println("Insira as moedas (Aceitas: 1,0 e 0,50; Coloque 0,0 para sair)");

        Double moeda = scanner.nextDouble();
        while (moeda != 0.0) {

            slotChain.capturarCoin(moeda);

            System.out.println("Insira outra moeda (0,0 para sair)");
            moeda = scanner.nextDouble();
        }

        switch (produto) {
            case 1:
                slotChain.pagar(3.5);
                break;
            case 2:
                slotChain.pagar(2.0);
                break;
            case 3:
                slotChain.pagar(1.0);
                break;
        }


    }

}
