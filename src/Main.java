import java.util.Scanner;

// Projeto conta de banco usando o básico da linguagem Java, na trilha Java básico
// da plataforma da DIO.

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        String agencia, nomeCliente;
        double saldo;

        System.out.print("Olá, por favor insira seu nome: ");
        nomeCliente = sc.nextLine();
        System.out.print("Por favor insira sua agencia: ");
        agencia = sc.nextLine();
        System.out.print("Agora o número da conta: ");
        numero = sc.nextInt();
        System.out.print("Insira o saldo que deseja depositar: ");
        saldo = sc.nextDouble();

        System.out.print("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua Agência é: " + agencia +
                ", conta: " + numero + " e seu saldo " + saldo + " já está disponível apra saque.");


        sc.close();
    }
}
