public class Compra {
    // ATRIBUTO, PRIVADO
    private double valor = 1;
    private int pipoca;
    private int coca_cola;
    private int bilhete;
    //CONSTRUTOR
    public Compra( int pipoca, int coca_cola, int bilhete) {
        this.pipoca = pipoca;
        this.coca_cola = coca_cola;
        this.bilhete = bilhete;
    }
    //GET E SET 
    public double getValor() {
        return valor;
    }
     public void setValor(double valor) {
        this.valor = valor;
    }
    public int getPipoca() {
        return pipoca;
    }
    public void setPipoca(int pipoca) {
        this.pipoca = pipoca;
    }
    public int getCoca_cola() {
        return coca_cola;
    }
     public void setCoca_cola(int coca_cola) {
        this.coca_cola = coca_cola;
    }
    public int getBilhete() {
        return bilhete;
    }
    public void setBilhete(int bilhete) {
        this.bilhete = bilhete;
    }
    //MÉTODOS
    public double valor_Total() {
        if(this.bilhete>=1){
             this.valor = this.valor * this.bilhete * 10;
             if (this.coca_cola>0 && this.pipoca>0) {
                this.valor = this.valor * this.coca_cola * 5 + this.pipoca * 3;
             }else if (this.coca_cola>0 && this.pipoca==0) {
                this.valor = this.valor * this.coca_cola * 5;
             }else if (this.coca_cola==0 && this.pipoca>0) {
                this.valor = this.valor * this.pipoca * 3;
             }
             return this.valor;
        }
        return 0;
    }

}

