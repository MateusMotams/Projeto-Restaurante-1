/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciamento.de.mesas.de.restaurante.gmr;

import static gerenciamento.de.mesas.de.restaurante.gmr.Mesa.estados.DESINFECTAR;
import static gerenciamento.de.mesas.de.restaurante.gmr.Mesa.estados.DISTANCIAMENTO_SOCIAL;
import static gerenciamento.de.mesas.de.restaurante.gmr.Mesa.estados.LIVRE;
import static gerenciamento.de.mesas.de.restaurante.gmr.Mesa.estados.OCUPADA;
import static gerenciamento.de.mesas.de.restaurante.gmr.Mesa.estados.RESERVADA;
import static gerenciamento.de.mesas.de.restaurante.gmr.Mesa.estados.TEST;

/**
 *
 * @author ranie
 */
public class GerenciamentoDeMesasDeRestauranteGMR {

    public static boolean mesaLivre(Mesa matMesa[][], int linha, int coluna){ //FUNÇÃO PRONTA!
        
        if(matMesa[linha][coluna].estadoAtual == LIVRE && matMesa[linha][coluna].isReserva() == false){
            return true;
        }else{
            return false;
        }
    }
    
    public static void liberarMesa(Mesa matMesa[][], int linha, int coluna){ //FUNÇÃO PRONTA!
        if(matMesa[linha][coluna].estadoAtual == DESINFECTAR){
            desinfectarMesa(matMesa, linha, coluna);
        }
    }
    
   
    public static Mesa criarMesa(Mesa matMesa[][], int linha, int coluna, int cont){
        //Mesa mesaPlaceHolder; //Foi necessário criar um objeto do tipo Mesa localmente dentro da função porque devido a um detalhe técnico da linguagem Java no qual quando um vetor de um tipo de dado criado pelo programador (ou seja, uma classe) é instanciado, ele AUTOMATICAMENTE tem todos as suas posições iniciadas com NULL (ou seja, um vetor de objetos vazios). Por isso a variável individual mesaPlaceHolder (com todos os campos com valores padrão definidos na classe original) é atibuída a cada posição do matMesa[].
        //Mesa mesaPlaceHolder = new Mesa();
        
        matMesa[linha][coluna] = new Mesa();//Agora todas as posições de matMesa[] estão inicializadas corretamente! O matMesa[] não é mais completamente null!
        matMesa[linha][coluna].setEstadoAtual(LIVRE);
        matMesa[linha][coluna].setReserva(false);
        matMesa[linha][coluna].setNumeroMesa(cont);
        matMesa[linha][coluna].setNumeroCadeiras(4);
        
        return matMesa[linha][coluna];
    }
    
    public static void desinfectarMesa(Mesa matMesa[][], int linha, int coluna){ //FUNÇÃO PRONTA!
        if(matMesa[linha][coluna].estadoAtual == DESINFECTAR){
            matMesa[linha][coluna].estadoAtual = LIVRE;
        }
    }
    
    public static void distanciamentoMesa(Mesa matMesa[][], int numeroMesa){ //Falta tratar exceções de limiar de numeração das mesas
        int i, j;
       
        if(numeroMesa >= 1 && numeroMesa <= 30){
            for(i = 0; i < 5; i++){
                 for(j = 0; j < 6; j++){
                     if (matMesa[i][j].getEstadoAtual() != DISTANCIAMENTO_SOCIAL || matMesa[i][j].getNumeroMesa() == numeroMesa){
                        switch (j){
                            case 0:
                                if (matMesa[i][j].getNumeroMesa() == numeroMesa){
                                    if (numeroMesa == 1){
                                        matMesa[i][(j + 1)].setEstadoAtual(DISTANCIAMENTO_SOCIAL);//bloquear mesa seguinte
                                        matMesa[i+1][j].setEstadoAtual(DISTANCIAMENTO_SOCIAL);//bloquear mesa inferior
                                    }
                                    else if (numeroMesa == 25){
                                        matMesa[i-1][j].setEstadoAtual(DISTANCIAMENTO_SOCIAL);//bloquear mesa superior
                                        matMesa[i][j+1].setEstadoAtual(DISTANCIAMENTO_SOCIAL);//bloquear mesa seguinte
                                    } else {
                                        matMesa[i-1][j].setEstadoAtual(DISTANCIAMENTO_SOCIAL);//bloquear mesa superior
                                        matMesa[i][(j + 1)].setEstadoAtual(DISTANCIAMENTO_SOCIAL);//bloquear mesa seguinte
                                        matMesa[(i + 1)][j].setEstadoAtual(DISTANCIAMENTO_SOCIAL);//bloquear mesa inferior
                                    }
                                }
                                break;
                            case 5:
                                if (matMesa[i][j].getNumeroMesa() == numeroMesa){
                                    if (numeroMesa == 6){
                                        matMesa[i][(j - 1)].setEstadoAtual(DISTANCIAMENTO_SOCIAL);//bloquear mesa anterior
                                        matMesa[i+1][j].setEstadoAtual(DISTANCIAMENTO_SOCIAL);//bloquear mesa inferior
                                    }
                                    else if (numeroMesa == 30){
                                        matMesa[i-1][j].setEstadoAtual(DISTANCIAMENTO_SOCIAL);//bloquear mesa superior
                                        matMesa[i][j-1].setEstadoAtual(DISTANCIAMENTO_SOCIAL);//bloquear mesa anterior
                                    } else {
                                        matMesa[i-1][j].setEstadoAtual(DISTANCIAMENTO_SOCIAL);//bloquear mesa superior
                                        matMesa[i][(j + 1)].setEstadoAtual(DISTANCIAMENTO_SOCIAL);//bloquear mesa seguinte
                                        matMesa[(i + 1)][j].setEstadoAtual(DISTANCIAMENTO_SOCIAL);//bloquear mesa inferior
                                    }
                                }
                                break;
                        }
                      
                        switch (i){
                            case 0:
                                if ((j > 0 && j < 5) && matMesa[i][j].getNumeroMesa() == numeroMesa){
                                    matMesa[i][j-1].setEstadoAtual(DISTANCIAMENTO_SOCIAL);//bloquear mesa anterior
                                    matMesa[i+1][(j)].setEstadoAtual(DISTANCIAMENTO_SOCIAL);//bloquear mesa inferior
                                    matMesa[i][j+1].setEstadoAtual(DISTANCIAMENTO_SOCIAL);//bloquear mesa seguinte
                                }
                                break;
                            case 4:
                                if ((j > 0 && j < 5) && matMesa[i][j].getNumeroMesa() == numeroMesa){
                                    matMesa[i][j-1].setEstadoAtual(DISTANCIAMENTO_SOCIAL);//bloquear mesa anterior
                                    matMesa[i-1][j].setEstadoAtual(DISTANCIAMENTO_SOCIAL);//bloquear mesa superior
                                    matMesa[i][j+1].setEstadoAtual(DISTANCIAMENTO_SOCIAL);//bloquear mesa seguinte
                                }
                                break;
                        }
                 
                        if((j != 0 && j != 5) && (i != 0 && i != 4) && matMesa[i][j].getNumeroMesa() == numeroMesa){
                            matMesa[i][(j - 1)].setEstadoAtual(DISTANCIAMENTO_SOCIAL);//bloquear mesa anterior
                            matMesa[i][(j + 1)].setEstadoAtual(DISTANCIAMENTO_SOCIAL);//bloquear mesa seguinte
                            matMesa[(i + 1)][j].setEstadoAtual(DISTANCIAMENTO_SOCIAL);//bloquear mesa inferior
                            matMesa[(i - 1)][j].setEstadoAtual(DISTANCIAMENTO_SOCIAL);//bloquear mesa superior
                        }
                    }
                }
            }
        } else{
            System.out.println("\nErro: O numero de mesa digitado é invalido!\n");
        }
    }    
    /**
     *
     * @param matMesa
     * @param numeroMesa
     */
    public static void ocuparMesa(Mesa matMesa[][], int numeroMesa){
        //int idMesa = numeroMesa - 1;//Subtrair 1 considerando que vetor em Java começa em 0 (zero)
        int i, j;
        
        if(numeroMesa >= 1 && numeroMesa <= 30){
            for(i = 0; i < 5; i++){
                for(j = 0; j < 6; j++){
                    if(matMesa[i][j].getNumeroMesa() == numeroMesa){
                        if(mesaLivre(matMesa, i, j) == true){
                            matMesa[i][j].setEstadoAtual(OCUPADA);
                            distanciamentoMesa(matMesa, numeroMesa);//Enviar pro método de distanciamento o número original da mesa, pois no método chamado nesta linha também é subtraido 1 do número da mesa
                            //System.out.println("\nAviso: Mesa " + idMesa + " foi ocupada com sucesso!\n");
                            break;
                        }else{
                            System.out.println("\nErro: A mesa solicitada não pode ser ocupada no momento! Por favor, verique se ela não está OCUPADA, RESERVADA, bloqueada por DISTANCIAMENTO_SOCIAL ou se é para DESINFECTAR.");
                        }
                    }
                }
            }
        }else{
            System.out.println("\nErro: O numero de mesa digitado é invalido!\n");
        }
    }
    
    public static void main(String[] args) {
        int i;
        int j;
        
        Mesa matMesa[][] = new Mesa[5][6];
        int cont = 1;
        
        for(i = 0; i < 5; i++){
                for(j = 0; j < 6; j++){
                    matMesa[i][j] = criarMesa(matMesa, i, j, cont);
                    cont++;
                }
        }

        
        ocuparMesa(matMesa, 1);
        System.out.println("\nEstado da mesa 1: " + matMesa[0][0].estadoAtual);
        System.out.println("\nEstado da mesa 2: " + matMesa[0][1].estadoAtual);
        System.out.println("\nEstado da mesa 7: " + matMesa[1][0].estadoAtual);
        ocuparMesa(matMesa, 8);
        System.out.println("\n\nEstado da mesa 8: " + matMesa[1][1].estadoAtual);
        System.out.println("\nEstado da mesa 9: " + matMesa[1][2].estadoAtual);
        System.out.println("\nEstado da mesa 14: " + matMesa[2][1].estadoAtual);
        ocuparMesa(matMesa, 13);
        System.out.println("\n\nEstado da mesa 13: " + matMesa[2][0].estadoAtual);
        System.out.println("\nEstado da mesa 14: " + matMesa[2][1].estadoAtual);
        System.out.println("\nEstado da mesa 19: " + matMesa[3][0].estadoAtual);
        ocuparMesa(matMesa, 19);
        System.out.println("\nEstado da mesa 20: " + matMesa[3][1].estadoAtual);
        System.out.println("\nEstado da mesa 15: " + matMesa[2][2].estadoAtual);
        
    }
    
}
