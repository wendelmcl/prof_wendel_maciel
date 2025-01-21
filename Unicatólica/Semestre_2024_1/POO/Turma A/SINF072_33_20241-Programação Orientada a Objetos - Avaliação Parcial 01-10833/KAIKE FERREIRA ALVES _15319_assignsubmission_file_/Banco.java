package 4
import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {

        Conta c1 = new Conta();
        Saldo s1 = new Saldo();
        Criar a1 = new Criar();
        Deposito d1 = new Deposito();
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Criar conta: ");
        a1.setConta(sc.nextLine());
        System.out.print("Saldo na conta: ");
        c1.setConta(sc.nextLine());
        System.out.print("Saldo depositado: ");
        d1.setDeposito(sc.nextInt());
        System.out.print("Verificar saldo: ");
        s1.setDeposito(sc.nextInt());

        System.out.println("------------ ------------");
        System.out println("Conta: " + c1.getConta());
        System.out.println("Criar conta: " + a1.getCriar());
        System.out.println("Deposito: " + d1.getDeposito());
        System.out.println("Verificar Saldo: " + s1.getSaldo());
        System.out.println("---------------------------------");


    }
}
