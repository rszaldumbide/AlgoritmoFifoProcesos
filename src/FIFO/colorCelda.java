/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FIFO;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Ricardo
 */
public class colorCelda extends DefaultTableCellRenderer{

    Color colorRojo=new Color(224, 102, 102);
    Color colorVerde=new Color(52, 168, 83);
    Color colorTomate=new Color(249, 203, 156);
    Color colorAmarillo=new Color(244, 244, 69);
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean bln, boolean bln1, int i, int j) {
        
        JLabel lblResultado=(JLabel)super.getTableCellRendererComponent(table, value, bln, bln1, i, j); 
        
        if(value instanceof Integer){
            int dato=(int) value;
            if(dato==1){
                lblResultado.setBackground(colorVerde);
                lblResultado.setForeground(Color.black);
            }else{
                lblResultado.setBackground(colorRojo);
                lblResultado.setForeground(Color.white);
            }
        }else{
            lblResultado.setBackground(Color.white);
            lblResultado.setForeground(Color.black); 
        }
        
        return lblResultado;
    }
   
}
