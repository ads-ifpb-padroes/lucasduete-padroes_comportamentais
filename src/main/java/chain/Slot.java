package chain;

public abstract class Slot {

    private Slot proximo;
    private Double valor;
    private Double totalCapturado;

    {
        totalCapturado = 0.0;
    }

    public Slot(Double valor) {
        this.valor = valor;
        this.proximo = null;
    }

    public Slot(Double valor, Slot proximo) {
        this.valor = valor;
        this.proximo = proximo;
    }

    public void capturarCoin(Double valor) throws CoinNaoAceita {
        if (this.valor.equals(valor)) {
            totalCapturado += valor;
            return;
        } else {
            if (proximo == null) throw new CoinNaoAceita();
            proximo.capturarCoin(valor);
        }
    }

    public void pagar(Double valor) throws DinheiroInsuficienteException {
        valor -= totalCapturado;
        if (valor <= 0) {
            System.out.println("Pagou");
        } else {
            if (proximo == null) {
                System.out.println("Dinheiro Insuficiente");
                throw new DinheiroInsuficienteException();
            } else
                proximo.pagar(valor);
        }
    }

    public void setProximo(Slot proximo) {
        this.proximo = proximo;
    }

}
