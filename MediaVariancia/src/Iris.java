import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Iris {
    private ArrayList<Double> sepalLength = new ArrayList<>();
    private ArrayList<Double> sepalWidth = new ArrayList<>();
    private ArrayList<Double> petalLength = new ArrayList<>();
    private ArrayList<Double> petalWidth = new ArrayList<>();

    public Iris(String caminhoArquivo) {
        // É conveniente importar os dados do arquivo Iris.csv para as estruturas de dados do Projeto Java, a fim de facilitar a manipulação.
        importar(caminhoArquivo);
    }

    // Ler o arquivo e armazenar os dados nos ArrayLists
    public void importar(String caminhoArquivo) {
        try {
            File arquivo = new File(caminhoArquivo);
            Scanner scanner = new Scanner(arquivo);
            boolean primeiraLinha = true; // Flag para identificar a primeira linha como cabeçalho
            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                if (primeiraLinha) {
                    primeiraLinha = false;

                    // Pular para a próxima iteração do loop sem processar o cabeçalho
                    continue;
                }

                // Um vetor vai armazenar cada valor de cada atributo de cada instância da Íris.
                String[] valores = linha.split(",");

                // Os dados da Iris estão na ordem: sepalLength, sepalWidth, petalLength, petalWidth
                adicionarDados(Double.parseDouble(valores[0]), Double.parseDouble(valores[1]),
                                Double.parseDouble(valores[2]), Double.parseDouble(valores[3]));
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: " + e.getMessage());
        }
    } // importar

    private void adicionarDados(double sepalLength, double sepalWidth, double petalLength, double petalWidth) {
        this.sepalLength.add(sepalLength);
        this.sepalWidth.add(sepalWidth);
        this.petalLength.add(petalLength);
        this.petalWidth.add(petalWidth);
    } // adicionarDados

    public ArrayList<Double> getAtributo(int indice) {
        switch (indice) {
            case 0:
                return sepalLength;
            case 1:
                return sepalWidth;
            case 2:
                return petalLength;
            case 3:
                return petalWidth;
            default:
                throw new IllegalArgumentException("Índice de atributo inválido");
        }
    } // getAtributo

    public double calcularVariancia(ArrayList<Double> valores) {

        int tamanho = valores.size();
        double somaQuadrado = 0.0;
        double media = calcularMedia(valores);

        // Calcular a soma dos quadrados das diferenças
        for (double valor : valores) {
            somaQuadrado += Math.pow(valor - media, 2);
        }

        // Calcular a variância
        double variancia = somaQuadrado / tamanho;

        return variancia;
    } // calcularVariancia

    public double calcularMedia(ArrayList<Double> valores) {

        double somaValores = 0.0;
        int tamanho = valores.size();

        // Calcular a soma dos valores
        for (double valor : valores) {
            somaValores += valor;
        }

        // Calcular a média
        double media = somaValores / tamanho;

        return media;
    } // calcularMedia
} // Iris