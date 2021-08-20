/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciamento.de.mesas.de.restaurante.gmr;

import static gerenciamento.de.mesas.de.restaurante.gmr.Mesa.estados.LIVRE;

/**
 *
 * @author ranie
 */
public class GerenciamentoDeMesasDeRestauranteGMR {

    public boolean mesaLivre(Mesa mesa){
        if(mesa.isReserva() == true)
        {
            return false;
        }else{
            return true;
        }
    }
    
    public void criarMesa(Mesa vetor_mesa[], int contadorNumeroDaMesa){
        vetor_mesa[contadorNumeroDaMesa].setEstadoAtual(LIVRE);
        vetor_mesa[contadorNumeroDaMesa].setReserva(false);
        vetor_mesa[contadorNumeroDaMesa].setNumeroMesa((contadorNumeroDaMesa + 1));
    }
    public static void main(String[] args) {
        Mesa vetMesa[] = new Mesa[20];
        /*
        Mesa mesa02 = new Mesa();
        Mesa mesa03 = new Mesa();
        Mesa mesa04 = new Mesa();
        Mesa mesa05 = new Mesa();
        Mesa mesa06 = new Mesa();
        Mesa mesa07 = new Mesa();
        Mesa mesa08 = new Mesa();
        Mesa mesa09 = new Mesa();
        Mesa mesa10 = new Mesa();
        Mesa mesa11 = new Mesa();
        Mesa mesa12 = new Mesa();
        Mesa mesa13 = new Mesa();
        Mesa mesa14 = new Mesa();
        Mesa mesa15 = new Mesa();
        Mesa mesa16 = new Mesa();
        Mesa mesa17 = new Mesa();
        Mesa mesa18 = new Mesa();
        Mesa mesa19 = new Mesa();
        Mesa mesa20 = new Mesa();
        */
        int cont = 0;
        
        for(cont = 0; cont < 20; cont++){
            criarMesa(vetMesa, cont);
        }
    }
    
}
