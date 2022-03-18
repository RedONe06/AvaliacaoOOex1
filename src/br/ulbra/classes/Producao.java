package br.ulbra.classes;

public class Producao {
    
    protected String peca;
    protected int segundos;
    protected int hora;
    protected int minuto;
    protected int segundo;
    
    public Producao(int hora, int minuto, int segundo){

        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
        this.peca = "Teclado";
        this.segundos = 3700;
    }
    
    public Producao(String peca, int segundos, int hora, int minuto, int segundo) {
        this.peca = peca;
        this.segundos = segundos;
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public void setPeca(String peca){
        this.peca = peca;
    }
    public String getPeca(){
        return this.peca;
    }
    
    public void setSegundos(int segundos){
        if (segundos < 0){
            segundos = 100;
            System.out.println("Não é permitido valor negativo");
        } else {
            this.segundos = segundos;
        }
    }
    
    public int getHora(){
        return this.hora;
    }
    
    public int getMinuto(){
        return this.minuto;
    }
    
    public int getSegundo(){
        return this.segundo;
    }
    
    public void calcularHMS(){
        int rH;
        int rM;
        int rS;
        
        this.hora = this.segundos/3600;
        rH = this.segundos%3600;
        this.minuto = rH/60;
        this.segundo = rH % 60;
    }
    
    @Override
    public String toString() {
        String resposta = "";
        resposta = "A peça: " + this.getPeca() + " que levou um total de "
                + this.segundos + " levou" + this.getHora() + ":" +
                this.getMinuto() + ":" + this.getSegundo()+ " para ficar pronta!!";
        return resposta;
    }
}
