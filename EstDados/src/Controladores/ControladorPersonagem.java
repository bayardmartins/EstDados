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
    private int inicio=-1;
    private int fim=-1;
    
    public ControladorPersonagem(ControladorPrincipal ctrlPrincipal) {
        this.ctrlPrincipal = ctrlPrincipal;
        telaBusca = new TelaBusca(this);
        telaPersonagem = new TelaPersonagem(this);
        dirAkuma = new DiretorioAkuma(this);
        dirArma = new DiretorioArma(this);
        dirRecompensa = new DiretorioRecompensa(this);
        for(int i = 0; i < ponteiroTabela.length; i++){
            ponteiroTabela[i]=i+1;
            System.out.println(ponteiroTabela[i]);
        }
        ponteiroTabela[31]=-1;
        PersonagemOT sanji = new PersonagemOT("sanji",2,70000,4);
        this.addPersonagem(sanji);
        PersonagemOT zoro = new PersonagemOT("zoro",2,160000,2);
        this.addPersonagem(zoro);
        PersonagemOT luffy = new PersonagemOT("luffy",1,160000,1);
        this.addPersonagem(luffy);
        PersonagemOT robin = new PersonagemOT("robin",1,90000,5);
        this.addPersonagem(robin);
        PersonagemOT hatchan = new PersonagemOT("hatchan",2,0,2);
        this.addPersonagem(hatchan);
        PersonagemOT ace = new PersonagemOT("ace",1,550000,1);
        this.addPersonagem(ace);
        PersonagemOT law = new PersonagemOT("law",1,200000,2);
        this.addPersonagem(law);
    }
    
    public ControladorPrincipal getCtrlPrincipal(){
        return ctrlPrincipal;
    }
    
    public void addPersonagem(PersonagemOT personagem) {
        boolean temAkuma = (personagem.akuma == 1);
        System.out.println(ponteiroTabela[ppLivre]);
        Personagem novoPersonagem = new Personagem (personagem.nome,temAkuma,personagem.recompensa,defineArma(personagem.arma));
        if(inicio<0){
            inicio = 0;
            fim = 0;
        }
        listaPersonagem[ppLivre] = novoPersonagem;
        dirAkuma.addPersonagem(ppLivre);
        dirArma.addPersonagem(ppLivre);
        dirRecompensa.addPersonagem(ppLivre);
        fim = ppLivre;
        ppLivre = ponteiroTabela[ppLivre];
        if(ppLivre == -1){
            aumentaArray(); 
        }
        
    }
    
    public void removePersonagem(String nome){
        System.out.println(fim);
        System.out.println(findPersonagemByNome("law"));
        int posicao = findPersonagemByNome(nome);
        if(posicao>-2){
            limparPersonagemDiretorio(posicao);
            listaPersonagem[posicao] = null;
            
            if(posicao==inicio){
                inicio=ponteiroTabela[inicio];
                ponteiroTabela[fim]=posicao;
                ponteiroTabela[posicao]=ppLivre;
                ppLivre = posicao;
            }else if(posicao==fim){
                ppLivre=fim;
                fim=findQuemAponta(fim);
            }else{
                ponteiroTabela[findQuemAponta(posicao)]=ponteiroTabela[ponteiroTabela[posicao]];
                ponteiroTabela[fim]=posicao;
                ponteiroTabela[posicao]=ppLivre;
                ppLivre = posicao;
            }
        }else{
            System.out.println("Personagem nao encontrado");
        }
        
    }

    public int findPersonagemByNome (String nome){
        int i = inicio;
        do{
            if(nome.equals(listaPersonagem[i].getNome())){
                return i;
            }
            i=ponteiroTabela[i];
        }while(listaPersonagem[i]!=null);
        return -2;
    }
    
   
    
    public int findQuemAponta (int posicao){
        int i = inicio;
        do{
            if(ponteiroTabela[i]==posicao){ 
                return i;
            }
            i=ponteiroTabela[i];
        }while(listaPersonagem[i]!=null);
        
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

    private void limparPersonagemDiretorio(int posicao) {
        Personagem personagem = listaPersonagem[posicao];
        dirAkuma.limpaAkuma(posicao,personagem);
        dirArma.limpaArma(posicao,personagem);
        dirRecompensa.limpaRecompensa(posicao,personagem);
    }

    public void imprimeLista() {
        int i = inicio;
        System.out.println("------------------");
        do{
            telaBusca.printPersonagem(listaPersonagem[i]);
            i=ponteiroTabela[i];
            System.out.println("  ");
        }while(listaPersonagem[i]!=null);
        System.out.println("------------------");
    }
    
}
