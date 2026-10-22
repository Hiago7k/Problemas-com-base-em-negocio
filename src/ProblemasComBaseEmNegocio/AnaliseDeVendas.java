package ProblemasComBaseEmNegocio;

public class AnaliseDeVendas {
    static void main() {
        float[] valores = {1300, 2500, 900, 4000, 1800, 2100, 2650};

        float totalVendido = 0;
        float mediaDiaria = 0;

        final float meta = 500;
        final float metaSemanal = 3000;
        int qtdDiasAcimaDaMeta = 0;
        String totalTexto = "";

        for (int i = 0; i < valores.length; i++) {
            totalVendido += valores[i];

            if (valores[i] >= 500) {
                qtdDiasAcimaDaMeta++;
            }
        }
        mediaDiaria = totalVendido / valores.length;

        System.out.printf("Total vendido %.2f%n", totalVendido);
        System.out.printf("Média diária %.2f%n", mediaDiaria);
        System.out.printf("Dias acima de %.2f %d%n", meta, qtdDiasAcimaDaMeta);

        if (totalVendido > metaSemanal) {
            System.out.printf("Meta semanal  de %.2f  batida %n", metaSemanal);
        } else {
            System.out.printf("Meta semanal  de %,2f não batida%n", metaSemanal);
        }


        if (totalVendido < 1500) {
            totalTexto = "baixo";
        } else if (totalVendido < 3000) {
            totalTexto = "regular";
        } else {
            totalTexto = "satisfatório";
        }

        System.out.printf("Classificação %s%n", totalTexto);
    }
}
