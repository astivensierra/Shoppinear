package Presentacion;

import static Persistencia.ArchivoClientes.leerArchivo;


public class Principal {
 
     public static void main(String[] args) {
        
        Login vista = new Login ();
        vista.setTitle("Control de acceso");
        vista.setResizable(false);
        vista.setVisible(true);
        
    }
    
    

}
