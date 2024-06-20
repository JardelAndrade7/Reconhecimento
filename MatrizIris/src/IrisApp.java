public class IrisApp {
    public static void main(String[] args) {
        // Importar a Íris
        String caminhoArquivo = "Iris.csv";
        Iris iris = new Iris(caminhoArquivo);

        // Calcular a matriz de correlação
        double[][] matrizCorrelacao = iris.calcularMatrizCorrelacao();

        // Imprimir a matriz de correlação
        if (matrizCorrelacao != null) {
            System.out.println("Matriz de Correlação:");
            for (int i = 0; i < matrizCorrelacao.length; i++) {
                for (int j = 0; j < matrizCorrelacao[i].length; j++) {
                    System.out.printf("%.2f\t", matrizCorrelacao[i][j]);
                }
                System.out.println();
            }
        }
    }
}