package ProblemasComBaseEmNegocio;

public class RecursividadePontosDeFidelidade {
    static void main() {
        int[] valores = {10, 5, 20, 15};
        int result = somaValores(valores, 0);
        System.out.println(result);
    }

    public static int somaValores(int[] valores, int indice) {

        int soma = 0;
        if (indice == valores.length) {
            return 0;
        }

        return soma += valores[indice] + somaValores(valores, indice + 1);
    }
}
