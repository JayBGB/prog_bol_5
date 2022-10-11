
package bol5;

public class Bol5 {

    public static void main(String[] args) {
        
        Consumo objConsume = new Consumo ();
        objConsume.setLitros(50);
        objConsume.setPgas(1.57);
        
        Consumo objConsumo = new Consumo(200, 60, 75, 1.87);
        
        System.out.println("Consumo medio: "+objConsumo.consumoMedio());
        System.out.println("Valor litros consumidos: "+objConsumo.consumoEuros());
        
        objConsumo.setLitros(100);
        
        System.out.println("Velocidad media: "+objConsumo.getVmed());
    }
    
}
