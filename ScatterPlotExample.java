/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentmanegment;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import javax.swing.JFrame;

public class ScatterPlotExample extends JFrame {

    public ScatterPlotExample(String title) {
        super(title);

        // Dataset creation
        XYSeriesCollection dataset = createDataset();

        // Chart creation
        JFreeChart scatterPlot = ChartFactory.createScatterPlot(
                "RBC vs PRBC Scatter Plot", // Chart title
                "RBC Count", // X-axis Label
                "PRBC Count", // Y-axis Label
                dataset, // Dataset
                PlotOrientation.VERTICAL,
                true, // Include legend
                true, // Tooltips
                false // URLs
        );

        // Panel for displaying chart
        ChartPanel chartPanel = new ChartPanel(scatterPlot);
        chartPanel.setPreferredSize(new java.awt.Dimension(800, 600));
        setContentPane(chartPanel);
    }

    private XYSeriesCollection createDataset() {
        XYSeries series = new XYSeries("Blood Components");

        // Adding data points (RBC count, PRBC count)
        series.add(8, 5);
        series.add(10, 7);
        series.add(6, 4);
        series.add(12, 9);
        series.add(7, 6);
        series.add(11, 8);
        
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series);

        return dataset;
    }

    public static void main(String[] args) {
        ScatterPlotExample example = new ScatterPlotExample("Scatter Plot Example");
        example.setSize(800, 600);
        example.setLocationRelativeTo(null);
        example.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        example.setVisible(true);
    }
}

