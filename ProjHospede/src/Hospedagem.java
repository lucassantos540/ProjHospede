public class Hospedagem {
    
    public int numdias;
    public double valordiario;
    private double consumo;
    private double adicional;
    
    public double getConsumo(){
        return this.consumo;
    }
    
    public void setConsumo(double consumo){
        this.consumo = consumo;
    }
    
    public double getAdicional(){
        return this.adicional;
    }
    
    public void setAdicional(double adicional){
        this.adicional = adicional;
    }
    
    public double CalcularCheckout(){
        return (this.numdias * this.valordiario) + this.consumo + this.adicional;
    }
    
}
