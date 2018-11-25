package Controladores;
import Modelos.DiretorioAkuma;
import Modelos.DiretorioArco;
import Modelos.DiretorioNome;
import Modelos.DiretorioRecompensa;
import Modelos.Personagem;
import Telas.TelaBusca;
import Telas.TelaPersonagem;

public class ControladorPersonagem {
    
    private ControladorPrincipal ctrlPrincipal; 
    private Personagem[] listaPersonagem = new Personagem[32];
    private DiretorioAkuma dirAkuma;
    private DiretorioArco dirArco;
    private DiretorioNome dirNome;
    private DiretorioRecompensa dirRecompensa;
    private TelaBusca telaBusca;
    private TelaPersonagem telaPersonagem;
    
    public ControladorPersonagem(ControladorPrincipal ctrlPrincipal) {
        this.ctrlPrincipal = ctrlPrincipal;
        telaBusca = new TelaBusca(this);
        telaPersonagem = new TelaPersonagem(this);
    }
    
    public void addPersonagem (){
        Personagem.addPersonagem();
    }

    void getTelaBusca() {
        
    }
}
