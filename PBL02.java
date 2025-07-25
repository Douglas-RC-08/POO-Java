
class Banco {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Jandira Silva", 2500.00);
        Cliente c2 = new Cliente("Sandra Rodrigues", 1800.00);
        Cliente c3 = new Cliente("Luciana Teixeira", 5000.00);

        c1.mostrar_dados();
        c2.mostrar_dados();
        c3.mostrar_dados();

        System.out.println("Retirando saldo da conta de Jandira Silva...");
        c1.retirar(1000.00);
        c1.mostrar_dados();

        System.out.println("Retirando saldo da conta de Sandra Rodrigues...");
        c2.retirar(2000.00);
        c2.mostrar_dados();

        System.out.println("Depositando saldo na conta de Sandra Rodrigues...");
        c2.depositar(500.00);
        c2.mostrar_dados();

        System.out.println("Retirando saldo da conta de Sandra Rodrigues...");
        c2.retirar(2000.00);
        c2.mostrar_dados();

        System.out.println("Depositando saldo na conta de Luciana Teixeira...");
        c3.depositar(1000.00);
        c3.mostrar_dados();

        System.out.println("RESULTADO FINAL DOS DADOS BANCARIOS");
        c1.mostrar_dados();
        c2.mostrar_dados();
        c3.mostrar_dados();
    }
}

class Cliente {
    String nome;
    double saldo_corrente;

    public Cliente(String nome, double saldo_corrente) {
        this.nome = nome;
        this.saldo_corrente = saldo_corrente;
    }

    public void mostrar_dados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Saldo: R$" + this.saldo_corrente);
        System.out.println();
    }
    public void retirar(double valor){
        if (valor < this.saldo_corrente){
            this.saldo_corrente -= valor;
        }else{
            System.out.println("O valor de saque foi maior que o valor disponivel!!!");
            System.out.println();
        }
    }
    public void depositar(double valor){
        this.saldo_corrente += valor;
    }
}