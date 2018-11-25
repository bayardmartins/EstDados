package Modelos;

public class Personagem {
    
    private int cod; 
    private String nome;
    private boolean akuma;
    private int recompensa;
    private Arco arco;
    private Arma arma;
    
    public Personagem (int cod, String nome, boolean temAkuma, int recompensa, Arco arco, Arma arma){
        this.cod = cod; 
        this.nome = nome;
        this.akuma = temAkuma;
        this.recompensa = recompensa;
        this.arco = arco;
        this.arma = arma;
    }
    

    public int getCod() {
        return cod;
    }

    public String getNome() {
        return nome;
    }

    public boolean isAkuma() {
        return akuma;
    }

    public int getRecompensa() {
        return recompensa;
    }

    public Arco getArco() {
        return arco;
    }

    public Arma getArma() {
        return arma;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTemAkuma(boolean temAkuma) {
        this.akuma = temAkuma;
    }

    public void setRecompensa(int recompensa) {
        this.recompensa = recompensa;
    }

    public void setArco(Arco arco) {
        this.arco = arco;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }
    
               
}
