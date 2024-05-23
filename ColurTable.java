
package com.mycompany.parabitnbbms;

import static com.mycompany.parabitnbbms.BPreserve.Column1;
import static com.mycompany.parabitnbbms.BPreserve.did1;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;


public class ColurTable {
    
        static void rcb(int row, JTable jt2){
         
             DefaultTableCellRenderer customRenderer = new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int  column) {
                Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                if (column == 6   &&  row == row) {
                    c.setBackground(Color.YELLOW);
                    c.setForeground(Color.MAGENTA);
                   
                } else {
                    c.setBackground(Color.WHITE);
                }
                return c;
            }
        };

             System.out.println("Hellow ");
       
       jt2.getColumnModel().getColumn(6).setCellRenderer(customRenderer);
       System.out.println(" Colur hu mai chal raha hu ");
        
    }

        
        static  public void pz(int row , JTable  jt2 ){
          
          
     
       
       
         DefaultTableCellRenderer customRenderer = new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                if (column == 11   &&  row == row) {
                    c.setBackground(Color.YELLOW);
                    c.setForeground(Color.MAGENTA);
                   
                   
                } else {
                    c.setBackground(Color.WHITE);
                }
                return c;
            }
        };
         jt2.getColumnModel().getColumn(11).setCellRenderer(customRenderer);
 
    }

    static void pl(int row, JTable jt2) {
        
       
        System.out.println(Column1);
         System.out.print(did1);
       
      
         DefaultTableCellRenderer customRenderer = new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                if (column == 9  &&  row == row) {
                    c.setBackground(Color.green);
                    c.setForeground(Color.MAGENTA);
                   
                } else {
                    c.setBackground(Color.WHITE);
                }
                return c;
            }
        };
         jt2.getColumnModel().getColumn(9).setCellRenderer(customRenderer);
 
   
       
          
      }
        
          }
       
        
        

