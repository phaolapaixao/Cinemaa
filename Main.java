import classescinema.Sala;
import classescinema.Filme;
import classescinema.Cliente;
import classescinema.Ingresso;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;


public class Main {
    public static List<Filme> filmes = new ArrayList<>();
    public static List<Cliente> clientes = new ArrayList<>();
    public static List<Ingresso> ingressos = new ArrayList<>();
    public static List<Sala> salas = new ArrayList<>();

    public static void main(String[] args) {
        Scanner ler = new Scanner(in);

        while (true) {
            System.out.println("(-------------> Escolha uma Opção <----------------)");
            System.out.println("0 - Sair ");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Cadastrar Filme");
            System.out.println("3 - Cadastrar Sala");
            System.out.println("4 - Vender Ingresso");
            System.out.println("5 - Listar Filmes");
            System.out.println("6 - Listar Ingressos\n");
            System.out.println("(--------------------------------------------------)");
            System.out.println("digite uma opcao: ");
            int opcao = ler.nextInt();
            switch (opcao) {
                case 0:
                    System.exit(0);
                case 1:
                    cadastroCliente();
                    break;
                case 2:
                    cadastroFilme();
                    break;
                case 3:
                    cadastroIngressoSala();
                    break;
                case 4:
                    venderIngresso();
                    break;
                case 5:
                    listarFilmes();
                    break;
                case 6:
                    listarIngressos();
                    break;
                default:
                    System.out.println("Opção invalida>");
                    break;
            }
        }

    }
    public static void cadastroFilme(){
        Scanner ler = new Scanner(in);
            Filme filme= new Filme();
            System.out.println("|-----------|--> Cadastrar Filme <--|-------------|");
            System.out.println("Digite o titulo do filme: ");
            filme.setTitulo(ler.nextLine());
            System.out.println("Qual é o gênero: ");
            filme.setGenero(ler.nextLine());
            System.out.println("Qual a duração do filme: formato 00:00");
            filme.setDuracao(ler.nextLine());
            System.out.println("Qual o código do filme: ");
            filme.setCodFilme(ler.nextLine());
            System.out.println("|----------------->~~~~~~~~~~~~<--|---------------|");
            System.out.println("Cadastro realizado com sucesso!");
            filmes.add(filme);

    }
    public static void cadastroCliente(){
        Scanner ler = new Scanner(in);
        Cliente cliente = new Cliente();
            System.out.println("|-----------|--> Cadastrar Cliente <--|-------------|");
            System.out.println("Digite o nome do cliente: ");
            cliente.setNome(ler.nextLine());
            System.out.println("Digite o cpf do cliente: ");
            cliente.setCpf(ler.nextLine());
            System.out.println("Digite o endereço do cliente: ");
            cliente.setEndereco(ler.nextLine());
            System.out.println("|------------------>~~~~~~~~~~~~<--|-----------------|");
            System.out.println("Cadastro realizado com sucesso!");

            clientes.add(cliente);
    }
    public static void venderIngresso(){
        Scanner ler = new Scanner(in);
        Ingresso ingresso = new Ingresso();
        Filme filme= new Filme();
        System.out.println("|-----------|--> Vender Ingresso <--|-------------|");
            System.out.println("Digite o nome do cliente: ");
                for (Cliente c : clientes) {
                    System.out.println("Nomes: " + c.getNome());
                }
            String nomeCliente = ler.nextLine();
            boolean clienteEncontrado = false;
                for (Cliente c : clientes) {
                    if(nomeCliente.equals(c.getNome())){
                        clienteEncontrado = true;
                        break;
                    }
                }
                if(!clienteEncontrado){
                    System.out.println("Cliente não encontrado.");
                }
            System.out.println("Digite o tipo do ingresso: ");
            ingresso.setTipoDeingresso(ler.nextLine());
            System.out.println("Digite a localização do assento: ");
            ingresso.setlocalisacaoDoAssento(ler.nextLine());
            System.out.print("Digite o código do filme:\n");
            for(Filme f : filmes ){
                System.out.println("Código- " + f.getCodFilme() + " Gênero: " + f.getGenero());
            }
            String codigo = ler.nextLine();
            boolean encontrarGenero = false;
            for(Filme f : filmes){
                if(codigo.equals(f.getCodFilme())){
                    encontrarGenero = true;
                    break;
                }
            }
            if(!encontrarGenero){
                System.out.println("código invalido");
            }
            filmes.add(filme);
            System.out.println("Informe a sala: ");
            for (Sala s : salas) {
                System.out.println("Número das salas: " +s.getNumero());
            }
            String salaEscolhida = ler.nextLine();
            boolean salaEncontrada = false;

            for (Sala s : salas) {
                if(salaEscolhida.equals(s.getNumero())){
                    salaEncontrada = true;
                    break;
                }
            }
            if(salaEncontrada){
                System.out.println("Essa sala não existe.");
            }
            System.out.println("Escolha um filme: ");
            for (Filme f : filmes) {
                System.out.println("Filmes: " + f.getTitulo());
            }
            String nomeFilme = ler.nextLine();
            boolean filmeEncontrado = false;

            for (Filme f : filmes) {
                if(nomeFilme.equals(f.getTitulo())){
                    filmeEncontrado = true;
                    break;
                }
            }
            if(!filmeEncontrado){
                System.out.println("Filme indisponivel.");
            }
            System.out.println("Cadastro realizado com sucesso!");
            System.out.println("|------------------>~~~~~~~~~~~~<--|----------------|");
            ingressos.add(ingresso);
    }
    public static void cadastroIngressoSala(){
        Scanner ler = new Scanner(in);
        Sala sala = new Sala();
        System.out.println("|-----------|--> Cadastrar Sala <--|-------------|");
            System.out.println("Digite o número da sala: ");
            sala.setNumero(ler.nextLine());
            System.out.println("Qual a capacidade de clientes: ");
            sala.setCapacidadeDeclientes(ler.nextInt());
            System.out.println("|------------|-->~~~~~~~~~~~~<--|------------|");
            System.out.println("Cadastro realizado com sucesso!");

    }
    public static void listarFilmes(){
        for (Filme f : filmes) {
            System.out.println("|-----------|--> Lista de Filmes <--|-------------|");
            System.out.println("Titulo: " + f.getTitulo());
            System.out.println("Genero: " + f.getGenero());
            System.out.println("Duracao: " + f.getDuracao());
            System.out.println("|------------------>~~~~~~~~~~~~<--|----------------|");
            break;
        }
        }
    public static void listarIngressos(){
        for (Ingresso i : ingressos) {
            System.out.println("|-----------|--> Cadastrar de Ingressos <--|-------------|");
            System.out.println("Código: " + i.getFilme().getCodFilme());
            System.out.println("Tipo de ingresso: " + i.getTipoDeingresso());
            System.out.println("Assento: " + i.getlocalisacaoDoAssento());
            System.out.print("Dono do ingresso: " + i.getCliente().getNome());
            System.out.print("Sala: " + i.getSala().getNumero());
            System.out.println("Filme: " + i.getFilme().getTitulo());
            System.out.println("Assento: " + i.getCliente().getNome());
            System.out.println("|------------------>~~~~~~~~~~~~<--|----------------|");
            break;
        }
    }
}