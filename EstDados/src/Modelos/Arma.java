package Modelos;


public enum Arma {

    SOCO(1),
    ESPADA(2),
    TIRO(3),
    CHUTE(4),
    OUTRO(5);
    
    public final int id;
    
    Arma (int idCargo){
        id = idCargo;
    }
    
}
