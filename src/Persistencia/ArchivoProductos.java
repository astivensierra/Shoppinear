
package Persistencia;

import Modelo.Clientes;
import Modelo.Compras;
import Modelo.Insumos;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


public class ArchivoProductos {
     public  static String guardarListaProducto(ArrayList<Insumos> lista) {
        FileWriter archivo = null;
        PrintWriter escritor = null;
        try{
            archivo = new FileWriter("Productos.txt");
            escritor = new PrintWriter(archivo);
            for(Insumos e1: lista){
                escritor.print(e1.getCodigo()+";");
                escritor.print(e1.getNombreInsumo()+";");
                escritor.print(e1.getCategoria()+";");
                escritor.print(e1.getPrecioInsumo()+";");
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

      public static ArrayList<Insumos> leerArchivo(){
       File file;
       FileReader reader = null;
       BufferedReader comodo;
       ArrayList<Insumos> lista = new ArrayList<>();
       
       try{
          file = new File("Productos.txt");
          reader = new FileReader(file);
          comodo = new BufferedReader(reader);
          
          String linea, valores [];
          Insumos h;
          while((linea=comodo.readLine())!=null){
              valores = linea.split(";");
              h = new Insumos();
              h.setCodigo(valores[0]);
              h.setNombreInsumo(valores[1]);
              h.setCategoria(valores[2]);
              h.setPrecioInsumo(valores[3]);
              System.out.println(linea);
              lista.add(h);
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
        public static Insumos Buscar(String cod){
          ArrayList<Insumos> Lista = leerArchivo();
          for (Insumos insumos : Lista) {
              if(insumos.getCodigo().equals(cod))
                  return insumos;
          }return null;
      }

}
