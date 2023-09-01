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
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author rszaldumbide
 */
public class ColorColumnas extends JTable{

    Color colorRojo=new Color(224, 102, 102);
    Color colorVerde=new Color(52, 168, 83);
    Color colorTomate=new Color(249, 203, 156);
    Color colorAmarillo=new Color(244, 244, 69);
    
    @Override
    public Component prepareRenderer(TableCellRenderer renderer, int rowIndex, int columIndex) {
        Component componente = super.prepareRenderer(renderer, rowIndex, columIndex);

        //defecto
        componente.setBackground(Color.WHITE);
        componente.setForeground(Color.BLACK);

        if((Integer.class.equals(this.getColumnClass(columIndex))) && (getValueAt(rowIndex, columIndex) != null)) {
            switch (columIndex) {
                case 1:
                    componente.setBackground(colorRojo);
                    componente.setForeground(Color.BLACK);
                    break;
                case 2:
                    componente.setBackground(colorVerde);
                    componente.setForeground(Color.BLACK);
                    break;
                case 3:
                    componente.setBackground(colorTomate);
                    componente.setForeground(Color.BLACK);
                default:
                    break;
            }
        }else{
            switch (columIndex) {
                case 0:
                    componente.setBackground(colorAmarillo);
                    componente.setForeground(Color.BLACK);
                    break;
                case 1:
                    componente.setBackground(colorRojo);
                    componente.setForeground(Color.BLACK);
                    break;
                case 2:
                    componente.setBackground(colorVerde);
                    componente.setForeground(Color.BLACK);
                    break;
                case 3:
                    componente.setBackground(colorTomate);
                    componente.setForeground(Color.BLACK);
                default:
                    break;
            }
        }
        return componente;
    
    }
}
