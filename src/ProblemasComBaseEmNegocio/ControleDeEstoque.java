package ProblemasComBaseEmNegocio;

public class ControleDeEstoque {
    static void main() {
        int[] produtos = {10, 0, 3, 8, 2, 0, 15, 4};

        int produtosZerados = 0;
        int produtosAbaixoDeCinco = 0;
        int total = 0;
        for (int i = 0; i < produtos.length; i++) {

            if (produtos[i] == 0) {
                produtosZerados++;
            }

            if (produtos[i] < 5) {
                produtosAbaixoDeCinco++;
            }
            total += produtos[i];
        }

        System.out.printf("Sem estoque %d%n", produtosZerados);
        System.out.printf("Abaixo de cinco %d%n", produtosAbaixoDeCinco);
        System.out.printf("Total %d%n", total);
    }
}
