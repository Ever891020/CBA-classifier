/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.correlacion;

/**
 *
 * @author ever
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File_read read=new File_read();
        read.Read_File("grupos_CTBS_frecuencia.txt");
    }
    
}
