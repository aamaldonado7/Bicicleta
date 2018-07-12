/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3.bicicleta;

/**
 *
 * @author aamaldonado
 */
public class Bicicleta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int cadenciaInicial = 0; 
     int velocidadInicial = 0; 
     int engranajeInicial = 0;   
            
        Bicicleta1 bicicleta = new Bicicleta1(cadenciaInicial, velocidadInicial, engranajeInicial);
        bicicleta.Acelerar(15);
        //test
    }
    
}
