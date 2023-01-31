package entidades;

public class No {
    private Produto prod;
    private No proximo;

    public No(Produto p) {
        this.prod = p;
        this.proximo = null;
    }

    public Produto getProd() {
        return prod;
    }

    public void setProd(Produto prod) {
        this.prod = prod;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }   
}
