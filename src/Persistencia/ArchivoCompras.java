
package Persistencia;


import Modelo.Compras;
import Persistencia.ArchivoProductos;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


public class ArchivoCompras {
    
    
      public static String guardarPersona(Compras compras)  {
        FileWriter archivo = null;
        PrintWriter escritor = null;
        try{
            archivo = new FileWriter("Compras.txt");
            escritor = new PrintWriter(archivo);
            escritor.print(compras.getIdentificacion()+";");
            escritor.print(compras.getInsumoTipo()+";");
            escritor.print(compras.getInsumo()+";");
            escritor.print(compras.getPrecioInsumo()+";");
            escritor.print(compras.getCantidad()+";");
             escritor.println();
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


    public  static String guardarListaPersona(ArrayList<Compras> lista) {
        FileWriter archivo = null;
        PrintWriter escritor = null;
        try{
            archivo = new FileWriter("Compras.txt",true);
            escritor = new PrintWriter(archivo);
            for(Compras compras: lista){
                escritor.print(compras.getIdentificacion()+";");
                escritor.print(compras.getInsumoTipo()+";");
                escritor.print(compras.getInsumo()+";");
                escritor.print(compras.getPrecioInsumo()+";");
                escritor.print(compras.getCantidad()+";");
                
                escritor.println();
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

    
    public static ArrayList<Compras> leerArchivo(){
       File file;
       FileReader reader = null;
       BufferedReader comodo;
       ArrayList<Compras> lista = new ArrayList<>();
       
       try{
          file = new File("Compras.txt");
          reader = new FileReader(file);
          comodo = new BufferedReader(reader);
          
          String linea, valores [];
          Compras c;
          while((linea=comodo.readLine())!=null){
              valores = linea.split(";");
              c = new Compras();
              c.setIdentificacion(valores[0]);             
              c.setInsumoTipo(valores[1]);
              c.setInsumo(valores[2]);
              c.setPrecioInsumo(valores[3]);
              c.setCantidad(valores[4]);
            
              
              System.out.println(linea);
              lista.add(c);
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
