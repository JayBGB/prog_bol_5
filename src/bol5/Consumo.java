
package bol5;

public class Consumo {
    
    //ATTRIBUTES
    
    private double km, litros, vMed, pGas;
    
    //CONSTRUCTORS
    
    public Consumo (){}
    
    public Consumo (double klm, double l, double speed, double gas){
    
    km=klm;
    litros=l;
    vMed=speed;
    pGas=gas;
        
    }
    
    //SETTERS & GETTERS
    
    public void setKm (double klm){
    km=klm;
    }
    public double getKm(){
    return km;
    }
    
    
    public void setLitros (double l){
    litros=l;
    }
    public double getLitros(){
    return litros;
    }
    
    
    public void setVmed (double speed){
    vMed=speed;
    }
    public double getVmed(){
    return vMed;
    }
    
    
    public void setPgas (double gas){
    pGas=gas;
    }
    public double getPgas(){
    return pGas;
    }
    
    
    public double getTempo(){
    double tiempo = km/vMed;
    return tiempo;
    }
    
    
    public double consumoMedio (){
    double cmedio = (litros/km)*100;
    return cmedio;
    }
    
    public double consumoEuros (){
    double ceuros = ((litros/km)*100)/pGas;
    return ceuros;
    }
    
    
    
    
    
    
}
