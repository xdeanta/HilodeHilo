/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilodehilo;

/**
 *
 * @author dam2a
 */
public class HilodeHilo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rama r=new Rama("Primer hilo", 0);
        System.out.println("Programa Principal");
        r.start();
        try{
            r.join();
        }catch(Exception e){
            System.out.println("Programa interrumpido");
        }
        System.out.println("Principal terminado");
    }
    
}
