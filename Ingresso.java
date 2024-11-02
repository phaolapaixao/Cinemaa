package classescinema;

public class Ingresso {
    private String tipoDeingresso;
    private String localisacaoDoAssento;
    private Filme filme;
    private Cliente cliente;
    private Sala sala;


    public Ingresso(){

    }

    public String getTipoDeingresso() {
        return tipoDeingresso;
    }

    public void setTipoDeingresso(String tipoDeingresso) {
        this.tipoDeingresso = tipoDeingresso;
    }

    public String getlocalisacaoDoAssento() {
        return localisacaoDoAssento;
    }

    public void setlocalisacaoDoAssento(String localisacaoDoAssento) {
        localisacaoDoAssento = localisacaoDoAssento;
    }

    public String getLocalisacaoDoAssento() {
        return localisacaoDoAssento;
    }

    public void setLocalisacaoDoAssento(String localisacaoDoAssento) {
        this.localisacaoDoAssento = localisacaoDoAssento;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }
}
