package ProblemasComBaseEmNegocio;

public class EstacionamentoDoShopping {
    static void main() {
        int[][] matriz = {
                {1, 0, 1, 2, 0},
                {1, 1, 0, 0, 0},
                {2, 1, 1, 0, 1},
                {0, 0, 1, 1, 2}
        };

        int vagasLivres = 0;
        int vagasOcupadas = 0;
        int vagasInterditadas = 0;
        int linhaComMaisVagasOcupadas = 0;
        int indiceDaLinhaComMaisVagasOcupadas = 0;

        for (int i = 0; i < matriz.length; i++) {
            int somaPorLinha = 0;

            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] == 0) {
                    vagasLivres++;
                }

                if (matriz[i][j] == 1) {
                    vagasOcupadas++;
                }

                if (matriz[i][j] == 2) {
                    vagasInterditadas++;
                }

                if (matriz[i][j] == 1) {
                    somaPorLinha++;
                }

            }


            if (somaPorLinha > linhaComMaisVagasOcupadas) {
                linhaComMaisVagasOcupadas = somaPorLinha;
                indiceDaLinhaComMaisVagasOcupadas = i;
            }

            System.out.println();
        }

        int totalDeVagas = vagasLivres + vagasOcupadas;
        float porcentagemOcupacoa = (float) (vagasOcupadas / (float) totalDeVagas) * 100f;

        System.out.printf("**** Relatório ****%n");
        System.out.printf("Vagas ocupadas %d%n", vagasOcupadas);
        System.out.printf("Vagas livres %d%n", vagasLivres);
        System.out.printf("Vagas interditadas %d%n", vagasInterditadas);
        System.out.printf("Porcetagem de ocupação %.2f%n", porcentagemOcupacoa);
        System.out.printf("Linha com %d mais vagas ocupadas total de %d vagas ocupadas %n", indiceDaLinhaComMaisVagasOcupadas + 1, linhaComMaisVagasOcupadas);
    }
}
