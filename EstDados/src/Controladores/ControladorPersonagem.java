package Controladores;
import Modelos.Arco;
import Modelos.Arma;
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
    
    public static void addPersonagem(int cod, String nome, boolean temAkuma, int recompensa, Arco arco, Arma arma) {
        Personagem novoPersonagem = new Personagem (cod,nome,temAkuma,recompensa,arco,arma);
    }

    public TelaBusca getTelaBusca() {
        return telaBusca;
    }
    
    public TelaPersonagem getTelaPersonagem() {
        return telaPersonagem;
    }

    public void buscaSimples (){
        
    }
  
}
