
package Persistencia;

import java.io.*;
import java.util.ArrayList;
import Modelo.Clientes;
import Presentacion.RegistroClientes;


public class ArchivoClientes {
    
     public static String guardarPersona(Clientes clientes)  {
        FileWriter archivo = null;
        PrintWriter escritor = null;
        try{
            archivo = new FileWriter("Clientes.txt");
            escritor = new PrintWriter(archivo);
            escritor.print(clientes.getNombre()+";");
            escritor.print(clientes.getIdentificacion()+";");
            escritor.print(clientes.getTipoCliente()+";");
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
     
      public  static String guardarListaPersona(ArrayList<Clientes> lista) {
        FileWriter archivo = null;
        PrintWriter escritor = null;
        try{
            archivo = new FileWriter("Clientes.txt");
            escritor = new PrintWriter(archivo);
            for(Clientes clientes: lista){
               escritor.print(clientes.getNombre()+";");
               escritor.print(clientes.getIdentificacion()+";");
               escritor.print(clientes.getTipoCliente()+";");
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
    
    public static ArrayList<Clientes> leerArchivo(){
       File file;
       FileReader reader = null;
       BufferedReader comodo;
       ArrayList<Clientes> lista = new ArrayList<>();
       
       try{
          file = new File("Clientes.txt");
          reader = new FileReader(file);
          comodo = new BufferedReader(reader);
          
          String linea, valores [];
          Clientes c;
          while((linea=comodo.readLine())!=null){
              valores = linea.split(";");
              c = new Clientes();
              c.setNombre(valores[0]);
              c.setIdentificacion(valores[1]);
              c.setTipoCliente(valores[2]);
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
