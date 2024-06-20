import javax.swing.JFrame;

public class ProbabilidadeApp {
    public static void main(String[] args) {
        String caminhoArquivo = "src/Iris.csv";
        Iris iris = new Iris(caminhoArquivo);

        // Criar e exibir o gráfico da sepalLength
        String tituloSepalLength = "Distribuição de Probabilidade da sepalLength";
        GraficoDistribuicaoProbabilidade graficoSepalLength = new GraficoDistribuicaoProbabilidade(tituloSepalLength, iris.getAtributo(0));
        graficoSepalLength.pack();
        graficoSepalLength.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        graficoSepalLength.setLocationRelativeTo(null); // Centraliza a janela na tela
        graficoSepalLength.setLocation(400, 0);
        graficoSepalLength.setVisible(true);

        // Criar e exibir o gráfico da sepalWidth
        String tituloSepalWidth = "Distribuição de Probabilidade da sepalWidth";
        GraficoDistribuicaoProbabilidade graficoSepalWidth = new GraficoDistribuicaoProbabilidade(tituloSepalWidth, iris.getAtributo(1));
        graficoSepalWidth.pack();
        graficoSepalWidth.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        graficoSepalWidth.setLocationRelativeTo(null);
        graficoSepalWidth.setLocation(0, 0);
        graficoSepalWidth.setVisible(true);

        // Criar e exibir o gráfico da petalLength
        String tituloPetalLength = "Distribuição de Probabilidade da petalLength";
        GraficoDistribuicaoProbabilidade graficoPetalLength = new GraficoDistribuicaoProbabilidade(tituloPetalLength, iris.getAtributo(2));
        graficoPetalLength.pack();
        graficoPetalLength.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        graficoPetalLength.setLocationRelativeTo(null);
        graficoPetalLength.setLocation(0, 300);
        graficoPetalLength.setVisible(true);

        // Criar e exibir o gráfico da petalWidth
        String tituloPetalWidth = "Distribuição de Probabilidade da petalWidth";
        GraficoDistribuicaoProbabilidade graficoPetalWidth = new GraficoDistribuicaoProbabilidade(tituloPetalWidth, iris.getAtributo(3));
        graficoPetalWidth.pack();
        graficoPetalWidth.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        graficoPetalWidth.setLocationRelativeTo(null);
        graficoPetalWidth.setLocation(400, 300);
        graficoPetalWidth.setVisible(true);
    } // main
} // ProbabilityApp