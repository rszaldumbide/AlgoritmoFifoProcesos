/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FIFO;

import java.util.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rszaldumbide
 */
public class metodos {

    private String[] matrizString;
    private String[][] matrizInt;
    private int cont;
    
    public metodos() {
    }
    
    public String[] MatrizProcesos(int tamaño) {
                
        matrizString = new String[tamaño];
        cont=1;                                                                                                             
        
        for(int fila=0; fila<tamaño; fila++){
            matrizString[fila]="-> Proceso: "+cont;
            cont++;
            }

        return matrizString;   
    }
    
    
    public void imprimirMatriz(String[] matriz, int filas, JTable nombre) {

        DefaultTableModel modelo = (DefaultTableModel) nombre.getModel();

        modelo.setRowCount(filas);
        int col=0;
        for (int fila = 0; fila < filas; fila++) {
            nombre.setValueAt(matriz[fila], fila, col);
        }   
    }
    
    public String[] Matrizrafaga(int tamaño) {
                
        matrizString = new String[tamaño];                                                                                                           
        
        for(int fila=0; fila<tamaño; fila++){
            matrizString[fila]="";
            }

        return matrizString;   
    }
    
    
    public void imprimirMatrizRafaga(String[] matriz, int filas, int rafagas, JTable nombre) {

        DefaultTableModel modelo = (DefaultTableModel) nombre.getModel();

        modelo.setRowCount(filas);
        
        String vector[]=new String[rafagas];
        cont=0;
        for(int i=0; i<rafagas; i++){
            if(i==0){
                vector[i]="procesos/rafaga";
            }else{
                vector[i]=""+cont;
                cont++;
            }
        }
        modelo.setColumnIdentifiers(vector);
        
        int col=0;
        cont=1;
        for (int fila = 0; fila < filas; fila++) {
            if(col==0){
                nombre.setValueAt("->Proceso: "+cont, fila, col);
                cont++;
            }else{
                nombre.setValueAt(matriz[fila], fila, col);
            }
        }   
    }

}
