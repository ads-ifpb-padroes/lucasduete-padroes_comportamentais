package chain;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws CoinNaoAceita {

        Slot slotChain = new Slot1Real();
        slotChain.setProximo(new Slot50());

         int produto = -1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o código do produto:");
        System.out.println("1 : Refrigerante(R$3,50)");
        System.out.println("2 : Salgadinho (R$2,00)");
        System.out.println("3 : Chocolate (R$1,00)");

        produto = scanner.nextInt();

        System.out.println("Insira as moedas (Aceitas: 1.0 e 0.50, 0 para sair)");

        Double moeda = -1.0;
        do {

            System.out.println("Insira uma moeda, 0 para sair");
            moeda = scanner.nextDouble();

            slotChain.capturarCoin(moeda);

        } while (moeda != 0);

        Double total = slotChain.getTotalCapturado();

        switch (produto) {
            case 1:
                if (total != 3.50) System.out.println("Valor insuficiente");
                else System.out.println("Pegue sua bebida");
                break;
            case 2:
                if (total != 2.00) System.out.println("Valor insuficiente");
                else System.out.println("Pegue seu Salgadinho");
                break;
            case 3:
                if (total != 1.00) System.out.println("Valor insuficiente");
                else System.out.println("Pegue seu Chocolate");
                break;
        }


    }

}
