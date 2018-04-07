/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.correlacion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ever
 */
public class File_read {
    public void Read_File(String file)
    {
        try(BufferedReader br=new BufferedReader(new FileReader(file));)
        {
            String linea="";
            while(br.ready())
            {
                linea=br.readLine();
                Read_Control("generos_control_frecuencia.txt",linea);
            }
        }catch(IOException e)
        {
            System.out.println("Error "+ e);
        }
    }
    
    public int Read_Control(String file,String genero)
    {
        try(BufferedReader br=new BufferedReader(new FileReader(file));)
        {
            String linea="",genero_control="";
            String genero_id=genero.substring(genero.indexOf(" ")+1);
            while(br.ready())
            {
                linea=br.readLine();
                genero_control=linea.substring(linea.indexOf(" ")+1);
                if(genero_id.compareTo(genero_control)==0)
                {
                    System.out.println(genero_id+"\t"+genero.substring(0,genero.indexOf(" "))+"\t"+linea.substring(0, linea.indexOf(" ")));
                    return 0;
                }
            }
        }catch(IOException e)
        {
            System.out.println("Error "+ e);
        }
        return 0;
    }
}
