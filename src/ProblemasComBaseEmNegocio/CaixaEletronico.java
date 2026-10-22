package ProblemasComBaseEmNegocio;

import java.util.Scanner;

public class CaixaEletronico {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        float saldo = 2000;
        float opcao = -1;
        int qtdSaquesValidos = 0;
        float totalSacado = 0;

        do {
            System.out.printf("Saldo do caixa %.2f%n", saldo);
            System.out.println("Digite o valor que deseja sacar:");
            float valorSaque = teclado.nextFloat();

            if (valorSaque == 0) {
                opcao = 0;
            }

            if (valorSaque < 0) {
                System.out.println("Erro não pode sacar negativo");
            } else {

                if (valorSaque > saldo) {
                    System.out.println("Erro saldo menor que o valor do saque");
                } else {

                    if (valorSaque % 10 != 0) {
                        System.out.println("Valor não é multiplo de 10");
                    } else {
                        System.out.println("Saque realizado com sucesso!");
                        saldo -= valorSaque;
                        totalSacado += valorSaque;
                        if (valorSaque <= 0) {
                            continue;
                        }
                        qtdSaquesValidos++;
                    }
                }
            }


        } while (opcao != 0);
        System.out.printf("Saldo R$: %.2f%n", saldo);
        System.out.printf("Saques realizados: %d%n", qtdSaquesValidos);
        System.out.printf("Total Sacado: R$ %.2f%n", totalSacado);
    }
}
