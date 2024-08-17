package random;

import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu Nome Completo: ");
        String nome = scanner.next();
        String sobrenome = scanner.next();
        System.out.println(nome.concat(sobrenome));

        System.out.println("Digite seu Endereco: ");
        String endereco = scanner.nextLine();

        System.out.print("Digite seu Depósito Inicial: ");
        double deposito = scanner.nextDouble();

        if (!nome.isEmpty() && !endereco.isEmpty() && deposito > 0) {
            System.out.println("Conta Criada Com Sucesso!!!");
        }    

        System.out.print("Digite seu saldo: ");
        double saldo = scanner.nextDouble();
        
        System.out.print("Digite o valor do saque desejado: ");
        double valorSolicitado = scanner.nextDouble();

        if (saldo >= valorSolicitado) {
            saldo -= valorSolicitado;
        } else {
            System.out.println("Saldo insuficiente");
        }
        System.out.println("Saldo atual: " + saldo);

        scanner.close();  
    }

}