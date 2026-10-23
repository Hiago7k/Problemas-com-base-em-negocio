package ProblemasComBaseEmNegocio;

public class RecursividadeContagemDeProdutos {
    static void main() {
        int[] estoque = {0, 0, 0, 0, 0, 6};

        int result = estoqueZerados(estoque, 0);
        System.out.println(result);
    }

    public static int estoqueZerados(int[] estoque, int indice) {
        int quantia = 0;

        if (indice == estoque.length) {
            return  0;
        }

        if (estoque[indice] == 0){
            quantia++;
            return quantia += estoqueZerados(estoque, indice+1);
        }

        return quantia += estoqueZerados(estoque, indice + 1);
    }
}
