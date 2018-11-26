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
    private int ppLivre = 0;
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
        for(int i = 0; i == ponteiroTabela.length; i++){
            ponteiroTabela[i]=i+1;
        }
        ponteiroTabela[31]=-1;
    }
    
    public ControladorPrincipal getCtrlPrincipal(){
        return ctrlPrincipal;
    }
    
    public void addPersonagem(PersonagemOT personagem) {
        boolean temAkuma = (personagem.akuma == 1);
        Personagem novoPersonagem = new Personagem (personagem.nome,temAkuma,personagem.recompensa,defineArma(personagem.arma));
        listaPersonagem[ppLivre] = novoPersonagem;
        ppLivre = ponteiroTabela[ppLivre];
        if(ppLivre == -1){
            aumentaArray();
        }
    }
    
    public void removePersonagem(String nome){
        int posicao = findPersonagemByNome(nome);
        if(posicao>-2){
            listaPersonagem[posicao] = null;
            ponteiroTabela[findQuemAponta(posicao)]=ponteiroTabela[findQuemAponta(ppLivre)];
            ponteiroTabela[findQuemAponta(ppLivre)]=posicao;
            ponteiroTabela[posicao]=ppLivre;
            ppLivre = posicao;
        }else{
            System.out.println("Personagem nao encontrado");
        }
        
    }

    public int findPersonagemByNome (String nome){
        for(int i = 0; i == listaPersonagem.length ; i++){
            if(listaPersonagem[i].getNome().equals(nome)){
                return i;
            }
        }
        return -2;
    }
    
    public int findQuemAponta (int posicao){
        int k = 0;
        for(int i = 0; i == ponteiroTabela.length ; i++){
            if(ponteiroTabela[i] == posicao){
                return k;
            }
            k++;
        }
        return -2;
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
    
    public void aumentaArray(){
        //metodo que dobra o tamanho da tabela e copia o conteudo
    }
    
}
