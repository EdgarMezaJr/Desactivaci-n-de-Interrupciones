/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionescompetencias;

public class RCompartido {
    private String datoCompartido;
    private interrupcion[] inter;
    
    RCompartido(){
        inter = new interrupcion[2]; //tiene minimo dos interrupciones
        for(int i =0; i<inter.length; i++)
            inter[i] = new interrupcion();
        datoCompartido="";
    }
    /*Función: obtener el largo de nuestro arreglo de interrupciones
        Recibe: Nada
        retorna: Largo del arreglo
    */
    public int largo(){
        return inter.length;
    }
    
    /*Función: Tiene la finalidad de comprobar si esta usando el recurso compartido
                otro hilo
        Recibe: La posición de nuestro arreglo
        retorna: Si se esta o no ocupando el RC
    */
    
    public boolean comprobarInter(int i){
        return inter[i].getInter();
    }
    
     /*Función: Tiene la finalidad de actualizar que estamos usando el RC
        Recibe: La posición de nuestro arreglo y el estado a que se desea actualizar
        retorna: Nada
    */
    
    public void estadoInter(int i, boolean estado){
       inter[i].setDatoInter(estado);
    }
    

     public String getDatoCompartido() {
        return datoCompartido;
    }
    public void setDatoCompartido(String datoCompartido) {
        this.datoCompartido = datoCompartido;
    }
}
