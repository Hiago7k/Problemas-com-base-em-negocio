package ProblemasComBaseEmNegocio;

public class ConsumoDeEnergia {
    static void main() {
        int[] consumo = {10, 20, 30, 40};

        int result = calcularConsumoTotal(consumo);
        int result2 = contarDiasAcimaDaMedia(consumo);
        System.out.println(result);
        System.out.println(result2);

    }

    public static int calcularConsumoTotal(int[] consumo) {
        int somaTotal = 0;
        for (int i = 0; i < consumo.length; i++) {
            somaTotal += consumo[i];
        }

        return somaTotal;
    }

    public static int contarDiasAcimaDaMedia(int[] consumo){
        int media = 0;
        int diasAcimaDaMedia = 0;
        for (int i = 0; i < consumo.length; i++){
            media += consumo[i];
        }

        media /= consumo.length;

        for (int i = 0; i < consumo.length; i++){
            if (consumo[i] > media){
                diasAcimaDaMedia++;
            }
        }

        System.out.println(media);
        return diasAcimaDaMedia;
    }
}
