import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       Scanner scanner =new Scanner(System.in);
       System.out.println("olá, por favor digite seu nome");
       String nome = scanner.next();
       System.out.println("por favor, digite sua agencia");
       int agencia = scanner.nextInt();
       System.out.println("por favor, digite sua seu numero");
       int numero = scanner.nextInt();    
       System.out.println("por favor digite seu saldo");
       float saldo = scanner.nextFloat();
       System.out.printf("Olá %s, obrigado por criar um conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque", nome, agencia, numero, saldo);

    }
}
