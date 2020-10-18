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
public class Rama extends Thread{
    private int nHilo;
    public Rama(String nomb,int HiloP){
        super(nomb);
        nHilo=HiloP;
    }
    public int getnHilo(){
        return nHilo;
    }
    @Override
    public void run(){
        Rama child=null;
        int newHilo=nHilo+1;
        if(nHilo < 4){
            System.out.println("Nombre: " + getName() + " mi id: " + getnHilo());
            child= new Rama("Hijo de: " + nHilo, newHilo);
            child.start();
            try{
                child.join();
            }catch(Exception e){
                System.out.println("error al esperar por el hilo");
            }
        }
        int rand=100+(int)(Math.random()*600);
        System.out.println(" Nombre: " + getName() + " Sleep: " + rand);
        for(int i=0;i<10; i++){
            System.out.println(" nombre: " +getName() + "; i=" + i);
            try{
                sleep(rand);
            }catch(InterruptedException e){
                System.out.println("Proceso terminado");
            }
        }
        System.out.println("El hilo " + getName() + " Ha terminado");
    }
}
