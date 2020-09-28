
package condicionescompetencias;

/**
 *
 * @author Edgar Meza Duarte 
 */

//Esta clase nos sirve para llevar el control de si alguien esta 
//usando el recurso compartido
public class interrupcion {
    private boolean inter = false;
    
    interrupcion(){
        inter = false; 
    }
    
    public boolean getInter() {
        return inter;
    }
    public void setDatoInter(boolean inter) {
        this.inter = inter;
    }
}
