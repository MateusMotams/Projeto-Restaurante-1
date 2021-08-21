/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciamento.de.mesas.de.restaurante.gmr;

import static gerenciamento.de.mesas.de.restaurante.gmr.Mesa.estados.DESINFECTAR;
import static gerenciamento.de.mesas.de.restaurante.gmr.Mesa.estados.DISTANCIAMENTO_SOCIAL;
import static gerenciamento.de.mesas.de.restaurante.gmr.Mesa.estados.LIVRE;

/**
 *
 * @author ranie
 */
public class GerenciamentoDeMesasDeRestauranteGMR {

    public static boolean mesaLivre(Mesa mesa){ //FUNÇÃO PRONTA!
        if(mesa.estadoAtual == LIVRE && mesa.isReserva() == false){
            return true;
        }else{
            return false;
        }
    }
    
    public static Mesa liberarMesa(Mesa mesa){
        if(mesa.estadoAtual == DESINFECTAR){
            desinfectarMesa(mesa);
        }
        
        
        /*
        if(mesa.isReserva() == true)
        {
            return false;
        }else{
            return true;
        }
        */
        
        /*
        if(mesa.getEstadoAtual() == DESINFECTAR){
            desinfectar
        }
        */
        return mesa;
    }
    
    public void criarMesa(Mesa vetor_mesa[], int contadorNumeroDaMesa){
        vetor_mesa[contadorNumeroDaMesa].setEstadoAtual(LIVRE);
        vetor_mesa[contadorNumeroDaMesa].setReserva(false);
        vetor_mesa[contadorNumeroDaMesa].setNumeroMesa((contadorNumeroDaMesa + 1));
    }
    
    public static Mesa desinfectarMesa(Mesa mesaASerLimpa){ //FUNÇÃO PRONTA!
        if(mesaASerLimpa.estadoAtual == DESINFECTAR){
            mesaASerLimpa.estadoAtual = LIVRE;
        }
        return mesaASerLimpa;
    }
    
    public static void distanciamentoMesa(Mesa vetMesa[], int numeroMesa){
        int cont = 0;
        int idMesa = numeroMesa - 1;
        
        if(numeroMesa >= 0 && numeroMesa <= 30){
            vetMesa[idMesa - 1].setEstadoAtual(DISTANCIAMENTO_SOCIAL);//bloquear mesa anterior
            vetMesa[idMesa + 1].setEstadoAtual(DISTANCIAMENTO_SOCIAL);//bloquear mesa seguinte
            vetMesa[idMesa + 6].setEstadoAtual(DISTANCIAMENTO_SOCIAL);//bloquear mesa inferior
            vetMesa[idMesa - 6].setEstadoAtual(DISTANCIAMENTO_SOCIAL);//bloquear mesa superior
        }
        
    }
    
    public static void main(String[] args) {
        Mesa vetMesa[] = new Mesa[30];
        
        int i;
        
        for(i = 0; i < 30; i++){
            vetMesa[i].setEstadoAtual(LIVRE);
        }
        
        for(i = 0; i < 30; i++){
            vetMesa[i].setNumeroMesa(i + 1);
        }
        
       distanciamentoMesa(vetMesa, 15);
       
        System.out.println("\nEstado da mesa 9: " + vetMesa[8].estadoAtual);
        System.out.println("\nEstado da mesa 21: " + vetMesa[21].estadoAtual);
        System.out.println("\nEstado da mesa 14: " + vetMesa[14].estadoAtual);
        System.out.println("\nEstado da mesa 16: " + vetMesa[16].estadoAtual);
        
        //mesa01.estadoAtual = DESINFECTAR;
        
        //System.out.println("Estado da mesa01 ANTES: " + mesa01.estadoAtual);
        
        //mesa01 = desinfectarMesa(mesa01);
        
        
        //System.out.println("A mesa01 esta livre: " + mesaLivre(mesa01));
        
        
        
        
        /*
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
        
        /*
        for(cont = 0; cont < 20; cont++){
            criarMesa(vetMesa, cont);
        }
        */
    }
    
}
