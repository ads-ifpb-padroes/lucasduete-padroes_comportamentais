package chain;

public abstract class Slot {

    private Slot proximo;
    private Double valor;
    private Double totalCapturado;

    public Slot(Double valor) {
        this.valor = valor;
        this.proximo = null;
    }

    public Slot(Double valor, Slot proximo) {
        this.valor = valor;
        this.proximo = proximo;
    }

    public void capturarCoin(Double valor) throws CoinNaoAceita {
        if (this.valor == valor) {
            totalCapturado += valor;
            return;
        } else {
            if (proximo == null) throw new CoinNaoAceita();
            proximo.capturarCoin(valor);
        }
    }

    public void setProximo(Slot proximo) {
        this.proximo = proximo;
    }

    public Double getTotalCapturado() {
        return totalCapturado;
    }
}
