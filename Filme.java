package classescinema;
//O filme representa o conteúdo exibido na sala de cinema. Cada filme tem
//um título, um gênero e uma duração, que são atributos essenciais para o
//controle dos filmes.

public class Filme {
    private String titulo;
    private String genero;
    private String duracao;
    private String codFilme;

    public Filme() {

    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getCodFilme() {
        return codFilme;
    }

    public void setCodFilme(String codFilme) {
        this.codFilme = codFilme;
    }
}


