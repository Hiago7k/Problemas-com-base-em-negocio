package ProblemasComBaseEmNegocio;

public class AuditoriaArmarios {
    static void main() {
        int[][] matriz = {
                {1, 0, 0, 0, 1},
                {1, 1, 1, 1, 1},
                {0, 0, 1, 0, 0},
                {1, 0, 0, 1, 1},
                {1, 1, 1, 0, 0}
        };


        int totalArmariosLivres = 0;
        int qtdLinhasTotalmenteOcupadas = 0;
        int maiorGrupo = 0;

        for (int i = 0; i < matriz.length; i++) {
            int totalOcupadosPorLinha = 0;
            int gruposDeArmariosLivrePorLinha = 0;
            int maiorSeq = 0;

            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == 0) {
                    totalArmariosLivres++;
                }

                if (matriz[i][j] == 1) {
                    totalOcupadosPorLinha++;
                }

                if (matriz[i][j] == 0){
                    gruposDeArmariosLivrePorLinha++;
                }else {
                    maiorSeq = gruposDeArmariosLivrePorLinha;
                    gruposDeArmariosLivrePorLinha = 0;
                }
            }
            if (totalOcupadosPorLinha == 5){
                qtdLinhasTotalmenteOcupadas++;
            }

            if (gruposDeArmariosLivrePorLinha > maiorGrupo){
                maiorGrupo = gruposDeArmariosLivrePorLinha;
                maiorSeq = maiorGrupo;
            }
        }

        System.out.printf("Total armários livres %d%n", totalArmariosLivres);
        System.out.printf("Linhas totalmente ocupadas %d%n", qtdLinhasTotalmenteOcupadas);
        System.out.printf("Maior grupo de armários livres: %d%n", maiorGrupo);
    }
}
