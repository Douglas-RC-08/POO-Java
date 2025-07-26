import java.util.ArrayList;

class arraylist{
    public static void main(String[] args) {
        ArrayList <Filme> filmes = new ArrayList<>();
        Filme f1 = new Filme("Minecraft", 2025);
        Filme f2 = new Filme("Lucifer", 2017);
        Filme f3 = new Filme("Shark Boy", 2007);
        Filme f4 = new Filme("AMEN", 2000);
        Filme f5 = new Filme("Conclave", 2024);

        filmes.add(f1);
        filmes.add(f2);
        filmes.add(f3);
        filmes.add(f4);
        filmes.add(f5);

        f1.mostrar();
        f2.mostrar();
        f3.mostrar();
        f4.mostrar();
        f5.mostrar();
    }
}


class Filme {
    String titulo;
    int ano;

    public Filme (String titulo, int ano){
        this.titulo = titulo;
        this.ano = ano;
    }

    public void mostrar(){
        System.out.println("Titulo: " + titulo + " Ano: " + ano);
    }

}