import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.statistics.HistogramDataset;
import org.jfree.chart.ui.ApplicationFrame;
import java.util.ArrayList;

public class GraficoDistribuicaoProbabilidade extends ApplicationFrame {

    public GraficoDistribuicaoProbabilidade(String titulo, ArrayList<Double> dadosArray) {
        super(titulo);

        // Transformar o array em um vetor
        double[] dadosVetor = dadosArray.stream().mapToDouble(Double::doubleValue).toArray();

        // Criar o dataset com os dados do vetor
        HistogramDataset dataset = new HistogramDataset();
        int bins = 10;
        dataset.addSeries(titulo, dadosVetor, bins);

        // Criar o gráfico do histograma
        String tituloGrafico = "Gráfico de " + titulo;
        String rotuloX = "Valor";
        String rotuloY = "Frequência/Probabilidade";
        JFreeChart grafico = createHistogramChart(
                tituloGrafico,
                rotuloX,
                rotuloY,
                dataset,
                PlotOrientation.VERTICAL,
                true,
                false,
                false // URLs
        );

        // Crier um painel de gráfico para exibir o gráfico
        ChartPanel chartPanel = new ChartPanel(grafico);
        chartPanel.setPreferredSize(new java.awt.Dimension(800, 600));
        setContentPane(chartPanel);
    } // ProbabilityDistributionChart

    private JFreeChart createHistogramChart(String title, String xAxisLabel, String yAxisLabel,
                                            HistogramDataset dataset, PlotOrientation orientation, boolean legend, boolean tooltips, boolean urls) {
        JFreeChart chart = ChartFactory.createHistogram(
                title,
                xAxisLabel,
                yAxisLabel,
                dataset,
                orientation,
                legend,
                tooltips,
                urls
        );
        return chart;
    } // createHistogramChart
} // GraficoDistribuicaoProbabilidade