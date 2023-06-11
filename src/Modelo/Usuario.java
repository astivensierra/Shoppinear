
package Modelo;


public class Usuario {
    
      private String name, clave;

    public Usuario() {
        this.name = "shoppinear";
        this.clave = "12345";
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the clave
     */
    public String getClave() {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(String clave) {
        this.clave = clave;
    }
    
    public int validarUsuario(String n, String c){
        if(this.getName().equals(n)){
            if(this.getClave().equals(c)){
                return 0;
            }
            else{
                return 2;
            }
        }
        else{
            return 1;
        }
    }
    
    
}
