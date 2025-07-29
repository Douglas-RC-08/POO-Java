import java.util.Scanner;
import java.util.ArrayList;

class Ma{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        System.out.println("Digite o titulo de uma musica: ");
        String titulo = teclado.nextLine();
        System.out.println("Digite o tempo da musica: ");
        int tempo = teclado.nextInt();
        System.out.println();
        Musica mu1 = new Musica(titulo, tempo);

        Album album1 = new Album("rock", 1997, "Rosas", "Metalica");
        album1.musicas.add(mu1);

        album1.mostrar();
        mu1.mostrarmu();

    }
}

class Album {
    String genero;
    int ano;
    String nome;
    String artista;
    ArrayList<Musica> musicas;

    public Album (String genero, int ano, String nome, String artista){
        this.genero = genero;
        this.ano = ano;
        this.nome = nome;
        this. artista = artista;
        this.musicas = new ArrayList<Musica>();
    }

    public void mostrar(){
        System.out.println("Genero: " + genero + "\nAno: " + ano + "\nNome: " + nome + "\nArtista: " + artista);
    }
}

class Musica {
    String titulo;
    int duracao;

    public Musica (String titulo, int duracao){
        this.titulo = titulo;
        this.duracao = duracao;
    }
    public void mostrarmu(){
        System.out.println("Musicas: Titulo: " + titulo + " Duracao: " + duracao);
    }
}