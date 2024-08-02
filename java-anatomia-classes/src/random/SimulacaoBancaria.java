package random;

// //-----------------------------------------------

// import java.util.Scanner;

// // public class SimulacaoBancaria {

//     //public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         double saldo = 0.0;
//         boolean continuar = true;

//         while (continuar) {
          
//             int opcao = scanner.nextInt();

//             switch (opcao) {
//                 case 1:
//                     double valorDeposito = scanner.nextDouble();
//                     saldo = saldo + valorDeposito;
//                     System.out.println("Saldo atual: " + saldo);
//                     break;
//                 case 2:
//                     double valorSolicitado = scanner.nextDouble();
//                     if(valorSolicitado < saldo)
//                     saldo = saldo - valorSolicitado;
//                     System.out.println("Saldo atual: " + saldo);
//                     break;
//                 case 3:
//                     System.out.println("Saldo atual: " + saldo);
//                     break;
//                 case 0:
//                     System.out.println("Programa encerrado.");
//                     continuar = false;
//                     break;
//                 default:
//                     System.out.println("Opção inválida. Tente novamente.");
//             }
//         }
//         scanner.close();
//     }
// }


// //------------------------------------------------

// //v2

// import java.util.Scanner;

// //* public class SimulacaoBancaria {

//     //public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         double saldo = 0;
//         boolean continuar = true;

//         while (continuar) {
          
//             int opcao = scanner.nextInt();

//             switch (opcao) {
//                 case 1:
//                     double valorDeposito = scanner.nextDouble();
//                     saldo = saldo + valorDeposito;
//                     System.out.println("Saldo atual: " + saldo);
//                     break;
//                 case 2:
//                     double valorSolicitado = scanner.nextDouble();
//                     saldo = saldo - valorSolicitado;
//                     // String saldoAtual = saldo >= valorSolicitado ? "saldo" : "Saldo insuficiente.";
//                     // System.out.println("Saldo atual: " + saldoAtual);
//                     if(valorSolicitado <= saldo)
//                       System.out.println("Saldo atual: " + saldo);
//                     if(valorSolicitado > saldo)
//                       System.out.println("Saldo insuficiente.");
//                     break;
//                 case 3:
//                     System.out.println("Saldo atual: " + saldo);
//                     break;
//                 case 0:
//                     System.out.println("Programa encerrado.");
//                     continuar = false;
//                     break;
//                 default:
//                     System.out.println("Opção inválida. Tente novamente.");
//             }
//         }
//         scanner.close();
//     }
// }

//---------------------------------------------------------

// V3

// import java.util.Scanner;

//  public class SimulacaoBancaria {

//      public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         double saldo = 0.0;
//         boolean continuar = true;

//         while (continuar) {
          
//             int opcao = scanner.nextInt();

//             switch (opcao) {
//                 case 1:
//                     double valorDeposito = scanner.nextDouble();
//                     saldo = saldo + valorDeposito;
//                     System.out.println("Saldo atual: " + saldo);
//                     break;
//                 case 2:
//                     double valorSolicitado = scanner.nextDouble();
//                     // saldo = saldo - valorSolicitado;
//                     if(valorSolicitado < saldo)
//                       System.out.println("Saldo atual: " + saldo);
//                     if(valorSolicitado > saldo);
//                       System.out.println("Saldo insuficiente.");
//                     break;
//                 case 3:
//                     System.out.println("Saldo atual: " + saldo);
//                     break;
//                 case 0:
//                     System.out.println("Programa encerrado.");
//                     continuar = false;
//                     break;
//                 default:
//                     System.out.println("Opção inválida. Tente novamente.");
//             }
//         }
//         scanner.close();
//     }
// }

// ---------------------------------------------------

// V4 - Passou todos os testes

import java.util.Scanner;
import java.text.DecimalFormat;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0.0;
        boolean continuar = true;
        DecimalFormat df = new DecimalFormat("0.0");

        while (continuar) {
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    double valorDeposito = scanner.nextDouble();
                    saldo += valorDeposito;
                    System.out.println("Saldo atual: " + df.format(saldo));
                    break;
                case 2:
                    double valorSolicitado = scanner.nextDouble();
                    if (valorSolicitado <= saldo) {
                        saldo -= valorSolicitado;
                        System.out.println("Saldo atual: " + df.format(saldo));
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                case 3:
                    System.out.println("Saldo atual: " + df.format(saldo));
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}
