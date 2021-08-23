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

    public static boolean mesaLivre(Mesa vetMesa[][], int linha, int coluna){ //FUNÇÃO PRONTA!
        
        if(vetMesa[linha][coluna].estadoAtual == LIVRE && vetMesa[linha][coluna].isReserva() == false){
            return true;
        }else{
            return false;
        }
    }
    
    public static void liberarMesa(Mesa vetMesa[][], int linha, int coluna){ //FUNÇÃO PRONTA!
        if(vetMesa[linha][coluna].estadoAtual == DESINFECTAR){
            desinfectarMesa(vetMesa, linha, coluna);
        }
    }
    
    /*
    public static void criarMesa(Mesa vetor_mesa[], int numeroTotalDeMesas){
        int cont = 0;
        Mesa mesaPlaceHolder; //Foi necessário criar um objeto do tipo Mesa localmente dentro da função porque devido a um detalhe técnico da linguagem Java no qual quando um vetor de um tipo de dado criado pelo programador (ou seja, uma classe) é instanciado, ele AUTOMATICAMENTE tem todos as suas posições iniciadas com NULL (ou seja, um vetor de objetos vazios). Por isso a variável individual mesaPlaceHolder (com todos os campos com valores padrão definidos na classe original) é atibuída a cada posição do vetMesa[].
        mesaPlaceHolder = new Mesa();
        
        for(cont = 0; cont < numeroTotalDeMesas; cont++){//Isso faz com que a variável individual mesaPlaceHolder (com todos os campos com valores padrão definidos na classe original) seja atibuída a cada posição do vetMesa[].
            vetor_mesa[cont] = mesaPlaceHolder;//Agora todas as posições de vetMesa[] estão inicializadas corretamente! O vetMesa[] não é mais completamente null!
        }
        
        for(cont = 0; cont < numeroTotalDeMesas; cont++){
            vetor_mesa[cont].setEstadoAtual(LIVRE);
            vetor_mesa[cont].setReserva(false);
            vetor_mesa[cont].setNumeroMesa((cont + 1));
            vetor_mesa[cont].setNumeroCadeiras(4);
        }
    }
    */
    public static void desinfectarMesa(Mesa vetMesa[][], int linha, int coluna){ //FUNÇÃO PRONTA!
        if(vetMesa[linha][coluna].estadoAtual == DESINFECTAR){
            vetMesa[linha][coluna].estadoAtual = LIVRE;
        }
    }
    
    public static void distanciamentoMesa(Mesa vetMesa[][], int numeroMesa){ //Falta tratar exceções de limiar de numeração das mesas
        int cont = 0;
        int idMesa = numeroMesa - 1;//Subtrair 1 considerando que vetor em Java começa em 0 (zero)
        int i, j;
        /*
        switch(idMesa){
            case 0:
                vetMesa[(idMesa + 1)].setEstadoAtual(DISTANCIAMENTO_SOCIAL);//bloquear mesa seguinte
                vetMesa[(idMesa + 6)].setEstadoAtual(DISTANCIAMENTO_SOCIAL);//bloquear mesa inferior
                break;
            case 1:
                vetMesa[(idMesa - 1)].setEstadoAtual(DISTANCIAMENTO_SOCIAL);//bloquear mesa anterior
                vetMesa[(idMesa + 1)].setEstadoAtual(DISTANCIAMENTO_SOCIAL);//bloquear mesa seguinte
                vetMesa[(idMesa + 6)].setEstadoAtual(DISTANCIAMENTO_SOCIAL);//bloquear mesa inferior
                break;
            case 2:
                vetMesa[(idMesa - 1)].setEstadoAtual(DISTANCIAMENTO_SOCIAL);//bloquear mesa anterior
                vetMesa[(idMesa + 1)].setEstadoAtual(DISTANCIAMENTO_SOCIAL);//bloquear mesa seguinte
                vetMesa[(idMesa + 6)].setEstadoAtual(DISTANCIAMENTO_SOCIAL);//bloquear mesa inferior
                break;
            case 3:
                vetMesa[(idMesa - 1)].setEstadoAtual(DISTANCIAMENTO_SOCIAL);//bloquear mesa anterior
                vetMesa[(idMesa + 1)].setEstadoAtual(DISTANCIAMENTO_SOCIAL);//bloquear mesa seguinte
                vetMesa[(idMesa + 6)].setEstadoAtual(DISTANCIAMENTO_SOCIAL);//bloquear mesa inferior
                break;
        }
        */
        /*
        if(numeroMesa >= 0 && numeroMesa <= 30){
            vetMesa[(idMesa - 1)].setEstadoAtual(DISTANCIAMENTO_SOCIAL);//bloquear mesa anterior
            vetMesa[(idMesa + 1)].setEstadoAtual(DISTANCIAMENTO_SOCIAL);//bloquear mesa seguinte
            vetMesa[(idMesa + 6)].setEstadoAtual(DISTANCIAMENTO_SOCIAL);//bloquear mesa inferior
            vetMesa[(idMesa - 6)].setEstadoAtual(DISTANCIAMENTO_SOCIAL);//bloquear mesa superior
        }else{
            System.out.println("\nErro: O numero de mesa digitado é invalido!\n");
        }
        */
        if(numeroMesa >= 0 && numeroMesa <= 30){
            for(i = 0; i < 5; i++){
                 for(j = 0; j < 6; j++){
                        if(vetMesa[i][j].getNumeroMesa() == numeroMesa){
                            vetMesa[i][(j - 1)].setEstadoAtual(DISTANCIAMENTO_SOCIAL);//bloquear mesa anterior
                            vetMesa[i][(j + 1)].setEstadoAtual(DISTANCIAMENTO_SOCIAL);//bloquear mesa seguinte
                            vetMesa[(i + 1)][j].setEstadoAtual(DISTANCIAMENTO_SOCIAL);//bloquear mesa inferior
                            vetMesa[(i - 1)][j].setEstadoAtual(DISTANCIAMENTO_SOCIAL);//bloquear mesa superior
                        }
                 }
            }
        }else{
            System.out.println("\nErro: O numero de mesa digitado é invalido!\n");
        }
    }    
    /**
     *
     * @param vetMesa
     * @param numeroMesa
     */
    public static void ocuparMesa(Mesa vetMesa[][], int numeroMesa){
        //int idMesa = numeroMesa - 1;//Subtrair 1 considerando que vetor em Java começa em 0 (zero)
        int i, j;
        
        if(numeroMesa >= 0 && numeroMesa <= 30){
            for(i = 0; i < 5; i++){
                for(j = 0; j < 6; j++){
                    if(vetMesa[i][j].getNumeroMesa() == numeroMesa){
                        if(mesaLivre(vetMesa, i, j) == true){
                            vetMesa[i][j].setEstadoAtual(OCUPADA);
                            distanciamentoMesa(vetMesa, numeroMesa);//Enviar pro método de distanciamento o número original da mesa, pois no método chamado nesta linha também é subtraido 1 do número da mesa
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
        /*
        if(numeroMesa >= 0 && numeroMesa <= 30){
            if(mesaLivre(vetMesa[idMesa]) == true){
                vetMesa[idMesa].setEstadoAtual(OCUPADA);
                distanciamentoMesa(vetMesa, numeroMesa);//Enviar pro método de distanciamento o número original da mesa, pois no método chamado nesta linha também é subtraido 1 do número da mesa
                System.out.println("\nAviso: Mesa " + idMesa + " foi ocupada com sucesso!\n");
            }else{
                System.out.println("\nErro: A mesa solicitada não pode ser ocupada no momento! Por favor, verique se ela não está OCUPADA, RESERVADA, bloqueada por DISTANCIAMENTO_SOCIAL ou se é para DESINFECTAR.");
            }
        }else{
            System.out.println("\nErro: O numero de mesa digitado é invalido!\n");
        }
        */
    }
    
    public static void main(String[] args) {
        int i;
        int j;
        
        //Mesa vetMesa[] = new Mesa[30];
        Mesa vetMesa[][] = new Mesa[5][6];
        int cont = 1;
        
        Mesa mesa1 = new Mesa();
        Mesa mesa2 = new Mesa();
        Mesa mesa3 = new Mesa();
        Mesa mesa4 = new Mesa();
        Mesa mesa5 = new Mesa();
        Mesa mesa6 = new Mesa();
        Mesa mesa7 = new Mesa();
        Mesa mesa8 = new Mesa();
        Mesa mesa9 = new Mesa();
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
        Mesa mesa21 = new Mesa();
        Mesa mesa22 = new Mesa();
        Mesa mesa23 = new Mesa();
        Mesa mesa24 = new Mesa();
        Mesa mesa25 = new Mesa();
        Mesa mesa26 = new Mesa();
        Mesa mesa27 = new Mesa();
        Mesa mesa28 = new Mesa();
        Mesa mesa29 = new Mesa();
        Mesa mesa30 = new Mesa();
        
        vetMesa[0][0] = mesa1;
        vetMesa[0][1] = mesa2;
        vetMesa[0][2] = mesa3;
        vetMesa[0][3] = mesa4;
        vetMesa[0][4] = mesa5;
        vetMesa[0][5] = mesa6;
        vetMesa[1][0] = mesa7;
        vetMesa[1][1] = mesa8;
        vetMesa[1][2] = mesa9;
        vetMesa[1][3] = mesa10;
        vetMesa[1][4] = mesa11;
        vetMesa[1][5] = mesa12;
        vetMesa[2][0] = mesa13;
        vetMesa[2][1] = mesa14;
        vetMesa[2][2] = mesa15;
        vetMesa[2][3] = mesa16;
        vetMesa[2][4] = mesa17;
        vetMesa[2][5] = mesa18;
        vetMesa[3][0] = mesa19;
        vetMesa[3][1] = mesa20;
        vetMesa[3][2] = mesa21;
        vetMesa[3][3] = mesa22;
        vetMesa[3][4] = mesa23;
        vetMesa[3][5] = mesa24;
        vetMesa[4][0] = mesa25;
        vetMesa[4][1] = mesa26;
        vetMesa[4][2] = mesa27;
        vetMesa[4][3] = mesa28;
        vetMesa[4][4] = mesa29;
        vetMesa[4][5] = mesa30;
        
        
        for(i = 0; i < 5; i++){
            for(j = 0; j < 6; j++){
                vetMesa[i][j].setNumeroMesa((cont));
                cont++;
            }
        }
        
        //System.out.println("Numero da mesa "+vetMesa[0][3].getNumeroMesa());
        /*
        mesa1.numeroMesa = 1;
        mesa2.numeroMesa = 2;
        mesa3.numeroMesa = 3;
        mesa4.numeroMesa = 4;
        mesa5.numeroMesa = 5;
        mesa6.numeroMesa = 6;
        mesa7.numeroMesa = 7;
        mesa8.numeroMesa = 8;
        mesa9.numeroMesa = 9;
        mesa10.numeroMesa = 10;
        mesa11.numeroMesa = 11;
        mesa12.numeroMesa = 12;
        mesa13.numeroMesa = 13;
        mesa14.numeroMesa = 14;
        mesa15.numeroMesa = 15;
        mesa16.numeroMesa = 16;
        mesa17.numeroMesa = 17;
        mesa18.numeroMesa = 18;
        mesa19.numeroMesa = 19;
        mesa20.numeroMesa = 20;
        mesa21.numeroMesa = 21;
        mesa22.numeroMesa = 22;
        mesa23.numeroMesa = 23;
        mesa24.numeroMesa = 24;
        mesa25.numeroMesa = 25;
        mesa26.numeroMesa = 26;
        mesa27.numeroMesa = 27;
        mesa28.numeroMesa = 28;
        mesa29.numeroMesa = 29;
        mesa30.numeroMesa = 30;
        */
        
        
        //System.out.println("vetMesa[0][0] = " + vetMesa[0][0]);
        
        //int i;
        
        //criarMesa(vetMesa, 30);
        
        //System.out.println("Estado atual da vetMesa[0] = " + vetMesa[0].estadoAtual);
        
        /*
        for(i = 0; i < 30; i++){
            if(vetMesa[i] != null){
                vetMesa[i].setEstadoAtual(LIVRE);
            }
        }
        
        for(i = 0; i < 30; i++){
            vetMesa[i].setNumeroMesa(i + 1);
        }
        */
        //distanciamentoMesa(vetMesa, 15);
        
        ocuparMesa(vetMesa, 9);
        
        System.out.println("\nEstado da mesa 2: " + vetMesa[0][1].estadoAtual);
        //System.out.println("\nEstado da mesa 15: " + vetMesa[14].estadoAtual);
        System.out.println("\nEstado da mesa 9: " + vetMesa[1][2].estadoAtual);
        System.out.println("\nEstado da mesa 3: " + vetMesa[0][2].estadoAtual);
        System.out.println("\nEstado da mesa 8: " + vetMesa[1][1].estadoAtual);
        System.out.println("\nEstado da mesa 10: " + vetMesa[1][3].estadoAtual);
        System.out.println("\nEstado da mesa 15: " + vetMesa[2][2].estadoAtual);
        
        //mesa01.estadoAtual = DESINFECTAR;
        
        //System.out.println("Estado da mesa01 ANTES: " + mesa01.estadoAtual);
        
        //mesa01 = desinfectarMesa(mesa01);
        
        
        //System.out.println("A mesa01 esta livre: " + mesaLivre(mesa01));
        
        
    }
    
}
