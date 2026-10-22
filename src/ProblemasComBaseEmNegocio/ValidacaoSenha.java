package ProblemasComBaseEmNegocio;

import java.util.Scanner;

public class ValidacaoSenha {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        final int senha = 2468;

        int qtdTentivas = 3;
        boolean acertou = false;

        do {
            System.out.printf("Quantidade de tentativas %d%n", qtdTentivas);
            System.out.printf("Digite a senha! ");
            int senhaDigitada = teclado.nextInt();

            if (senhaDigitada == senha) {
                System.out.println("Logado com sucesso!");
                acertou = true;

                if (qtdTentivas == 3){
                    System.out.println("Acertou de primeira");
                }
            return;
            } else {
                System.out.println("Senha errada!");
                qtdTentivas--;
            }

        } while (qtdTentivas != 0 || acertou == true);

        System.out.println("Acesso bloqueado por falta de tentativas");}
}
