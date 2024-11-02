package classescinema;
//O cliente é a pessoa que compra um ingresso para assistir a um filme.
//Cada cliente possui apenas um ingresso e deve conter as seguintes
//informações: nome do cliente, CPF e endereço.

public class Cliente {
    private String nome;
    private String cpf;
    private String endereco;

    public Cliente(){

    }
    public String getNome(){
        return nome;
    }
    public String getCpf(){
        return cpf;
    }
    public String getEndereco(){
        return endereco;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
}
