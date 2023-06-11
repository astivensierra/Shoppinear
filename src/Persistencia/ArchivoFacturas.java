/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Modelo.Clientes;
import Modelo.Facturas;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ArchivoFacturas {
    
     
      public  static String guardarListaFacturas (ArrayList<Facturas> lista) {
        FileWriter archivo = null;
        PrintWriter escritor = null;
        try{
            archivo = new FileWriter("Facturas.txt",true);
            escritor = new PrintWriter(archivo);
            for(Facturas f: lista){
                 escritor.println(f.getNombrefactura()+";"+f.getIdfactura()+";"+f.getCategoriadelafactura()+";"+f.getCantidaddelafactura()+";"+f.getValorcantidadfactura()+";"+f.getDescuentodelafactura()+";"+f.getValortotaldelafactura());
            }
            
            
            return "guardado bien";
        }catch(Exception error){
            System.out.println(error.getMessage());
            return "Error: "+error.getMessage();
        }finally{
            if (escritor!=null){
                escritor.close();
            }
        }
    }
    
    public static ArrayList<Facturas> leerArchivo(){
       File file;
       FileReader reader = null;
       BufferedReader comodo;
       ArrayList<Facturas> lista = new ArrayList<>();
       
       try{
          file = new File("Facturas.txt");
          reader = new FileReader(file);
          comodo = new BufferedReader(reader);
          
          String linea, valores [];
          Facturas f;
          while((linea=comodo.readLine())!=null){
              valores = linea.split(";");
              f = new Facturas();
              f.setNombrefactura(valores[0]);
              f.setIdfactura(valores[1]);
              f.setCategoriadelafactura(valores[2]);
              f.setCantidaddelafactura(valores[3]);
              f.setValorcantidadfactura(valores[4]);
              f.setDescuentodelafactura(valores[5]);
              f.setValortotaldelafactura(valores[6]);
              System.out.println(linea);
              lista.add(f);
          }
          
       }catch(IOException err){}finally{
          if(reader!=null){
              try{
                  reader.close();
              }catch(Exception err){}
          }
       }
       return lista;
   }
    
 
}
