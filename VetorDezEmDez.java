public class VetorDezEmDez {
    public static void main(String[] args) {
        int[] numeros = new int[11]; // de 0 até 100 (11 números)

        // preencher o vetor de 0 a 100 com passo 10
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i * 10;
        }

        // exibir os números
        System.out.println("Números no vetor:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}
