package Controladores;
import Modelos.Arco;
import Modelos.Arma;
import Modelos.DiretorioAkuma;
import Modelos.DiretorioArco;
import Modelos.DiretorioRecompensa;
import Modelos.Personagem;
import Telas.PersonagemOT;
import Telas.TelaBusca;
import Telas.TelaPersonagem;

public class ControladorPersonagem {
    
    private ControladorPrincipal ctrlPrincipal; 
    private Personagem[] listaPersonagem = new Personagem[32];
    private DiretorioAkuma dirAkuma;
    private DiretorioArco dirArco;
    private DiretorioRecompensa dirRecompensa;
    private TelaBusca telaBusca;
    private TelaPersonagem telaPersonagem;
    
    public ControladorPersonagem(ControladorPrincipal ctrlPrincipal) {
        this.ctrlPrincipal = ctrlPrincipal;
        telaBusca = new TelaBusca(this);
        telaPersonagem = new TelaPersonagem(this);
        DiretorioAkuma dirAkuma = new DiretorioAkuma();
        DiretorioArco dirArco = new DiretorioArco();
        DiretorioRecompensa dirRecompensa = new DiretorioRecompensa();
    }
    
    public void addPersonagem(PersonagemOT personagem) {
        boolean temAkuma = (personagem.akuma == 1);
        Personagem novoPersonagem = new Personagem (personagem.nome,temAkuma,personagem.recompensa,defineArco(personagem.arco),defineArma(personagem.arma));
    }

    public TelaBusca getTelaBusca() {
        return telaBusca;
    }
    
    public TelaPersonagem getTelaPersonagem() {
        return telaPersonagem;
    }
    
    public Personagem[] getListaPersonagem () {
        return listaPersonagem;
    }
    
    public void buscaSimples (){
        
    }
  
}
