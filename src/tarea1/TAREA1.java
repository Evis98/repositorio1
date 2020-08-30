/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1;

/**
 *
 * @author PC
 */


    /**
     * @param args the command line arguments
     */
   import java.io.*;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.ChartFactory; 
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.JFreeChart; 
import org.jfree.chart.ChartUtilities; 
public class TAREA1 {  
      public static void main(String[] args){
         try {
                
             java.text.DecimalFormat df=new java.text.DecimalFormat("0.0");
             double iinf=0; 
             double isup=2; 
             int pts=20;
             double x=iinf;
             double fx;
             double dx= 0.1;
             DefaultCategoryDataset line_chart_dataset=new DefaultCategoryDataset();
             for(int i=0;i<pts;i++){
                 fx=(x-1)*(x-1);
                 line_chart_dataset.addValue(fx, "f(x)=(x-1)^2", df.format(x));
                 x=x+dx;
             }
                /* Step -2:Define the JFreeChart object to create line chart */
                JFreeChart lineChartObject=ChartFactory.createLineChart(
				  "´Parabola","x","f(x)",
				  line_chart_dataset,PlotOrientation.VERTICAL,true,true,false);                
                          
                /* Step -3 : Write line chart to a file */               
                 int width=640; /* Width of the image */
                 int height=480; /* Height of the image */                
                 File lineChart=new File("line_Chart_example.png");              
                 ChartUtilities.saveChartAsPNG(lineChart,lineChartObject,width,height); 
         }
         catch (Exception i)
         {
             System.out.println(i);
         }
     }
 }

    

