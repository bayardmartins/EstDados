package Modelos;

public class Personagem {
    
    private String nome;
    private boolean akuma;
    private int recompensa;
    private Arma arma;
    
    public Personagem (String nome, boolean temAkuma, int recompensa, Arma arma){
        this.nome = nome;
        this.akuma = temAkuma;
        this.recompensa = recompensa;
        this.arma = arma;
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

    public void setArma(Arma arma) {
        this.arma = arma;
    }
    
    public static void addPersonagem() {
        
    }

               
}
