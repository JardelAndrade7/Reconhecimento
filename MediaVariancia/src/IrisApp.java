public class IrisApp {
    public static void main(String[] args) {

        // Importar a Íris
        String caminhoArquivo = "Iris.csv";
        Iris iris = new Iris(caminhoArquivo);

        // Calcular a média dos valores de um atributo
        double media = iris.calcularMedia(iris.getAtributo(0));

        // Calcular a variância dos valores de um atributo
        double variancia = iris.calcularVariancia(iris.getAtributo(0));

        // Imprimir a média e a variância
        System.out.printf("Média: %.2f\t", media);
        System.out.println();
        System.out.printf("Variância: %.2f\t", variancia);
        
    } // main
} // IrisApp