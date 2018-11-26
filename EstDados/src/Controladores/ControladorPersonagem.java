package Controladores;
import Modelos.Arma;
import Modelos.DiretorioAkuma;
import Modelos.DiretorioArma;
import Modelos.DiretorioRecompensa;
import Modelos.Personagem;
import Telas.PersonagemOT;
import Telas.TelaBusca;
import Telas.TelaPersonagem;

public class ControladorPersonagem {
    
    private ControladorPrincipal ctrlPrincipal; 
    private Personagem[] listaPersonagem = new Personagem[32];
    private int[] ponteiroTabela = new int[32];
    private DiretorioAkuma dirAkuma;
    private DiretorioArma dirArma;
    private DiretorioRecompensa dirRecompensa;
    private TelaBusca telaBusca;
    private TelaPersonagem telaPersonagem;
    
    public ControladorPersonagem(ControladorPrincipal ctrlPrincipal) {
        this.ctrlPrincipal = ctrlPrincipal;
        telaBusca = new TelaBusca(this);
        telaPersonagem = new TelaPersonagem(this);
        dirAkuma = new DiretorioAkuma(this);
        dirArma = new DiretorioArma(this);
        dirRecompensa = new DiretorioRecompensa(this);
    }
    
    public ControladorPrincipal getCtrlPrincipal(){
        return ctrlPrincipal;
    }
    
    public void addPersonagem(PersonagemOT personagem) {
        boolean temAkuma = (personagem.akuma == 1);
        Personagem novoPersonagem = new Personagem (personagem.nome,temAkuma,personagem.recompensa,defineArma(personagem.arma));
     
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
    
    public DiretorioAkuma getDiretorioAkuma() {
        return dirAkuma;
    }
    
    public DiretorioArma getDiretorioArma() {
        return dirArma;
    }
    
    public DiretorioRecompensa getDiretorioRecompensa() {
        return dirRecompensa;
    }
    
    public void buscaSimples (){
        
    }

    private Arma defineArma(int codArma) { 
        Arma arma = Arma.SOCO;
        if(codArma == Arma.CHUTE.id){
            arma = Arma.CHUTE;
        }
        if(codArma == Arma.ESPADA.id){
            arma = Arma.ESPADA;
        }
        if(codArma == Arma.TIRO.id){
            arma = Arma.TIRO;
        }
        if(codArma == Arma.CHUTE.id){
            arma = Arma.CHUTE;
        }
        if(codArma == Arma.OUTRO.id){
            arma = Arma.OUTRO;
        }
        return arma;
    }

    public void exibeMenu() {
        getCtrlPrincipal().getTela().exibeMenu();
    }
    
}
