/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciamento.de.mesas.de.restaurante.gmr;

import static gerenciamento.de.mesas.de.restaurante.gmr.Mesa.estados.DESINFECTAR;
import static gerenciamento.de.mesas.de.restaurante.gmr.Mesa.estados.SEGURANÇA;
import static gerenciamento.de.mesas.de.restaurante.gmr.Mesa.estados.LIVRE;
import static gerenciamento.de.mesas.de.restaurante.gmr.Mesa.estados.OCUPADA;
import static gerenciamento.de.mesas.de.restaurante.gmr.Mesa.estados.RESERVADA;
import static gerenciamento.de.mesas.de.restaurante.gmr.Mesa.estados.TEST;
import visao.MapaMesas;

/**
 *
 * @author ranie
 */
public class GerenciamentoDeMesasDeRestauranteGMR {

    // Função que retorna true se a mesa estiver livre e false se não estiver
    public static boolean mesaLivre(Mesa matMesa[][], int linha, int coluna){
        if(matMesa[linha][coluna].estadoAtual == LIVRE && matMesa[linha][coluna].isReserva()== false){
            return true;
        }else{
            return false;
        }
    }
    
    // Função para libeberar uma mesa caso seu estado seja DESINFECTAR
    public static void liberarMesa(Mesa matMesa[][], int linha, int coluna){
        if(matMesa[linha][coluna].estadoAtual == DESINFECTAR){
            desinfectarMesa(matMesa, linha, coluna);
        }
    }
    
    // Função para reservar uma mesa
    public static void reservarMesa(Mesa matMesa[][], int linha, int coluna){
        /* caso a mesa esteja livre, então a variável booleana da classe mesa receberá true
           e seu estado será trocado para RESERVADA */
        if(mesaLivre(matMesa, linha, coluna) == true){ 
            matMesa[linha][coluna].setReserva(true);
            matMesa[linha][coluna].setEstadoAtual(RESERVADA);
        }else{
            System.out.println("\nErro: A mesa nao pode ser reservada no momento!\n");
        }
    }
    
    // função para criar uma mesa
    public static Mesa criarMesa(Mesa matMesa[][], int linha, int coluna, int cont){
        
        matMesa[linha][coluna] = new Mesa(); // cria uma mesa
        matMesa[linha][coluna].setEstadoAtual(LIVRE); // muda o estado atual dela por padrão para LIVRE
        matMesa[linha][coluna].setReserva(false); // coloca o estado de reserva por padrão para FALSE, ou seja, a princípio nenhuma mesa estará reservada
        matMesa[linha][coluna].setNumeroMesa(cont); // adiciona o id da mesa, que varia de 1 a 30
        matMesa[linha][coluna].setNumeroCadeiras(4); // adiciona o número de cadeiras, que por padrão são 4
        
        return matMesa[linha][coluna]; // retorna uma mesa com as especificações acima
    }
    
    // Função que troca o estado de uma mesa para LIVRE caso ela esteja eticada como DESINFECTAR
    public static void desinfectarMesa(Mesa matMesa[][], int linha, int coluna){ 
        if(matMesa[linha][coluna].estadoAtual == DESINFECTAR){
            matMesa[linha][coluna].estadoAtual = LIVRE;
             matMesa[linha+1][coluna].setEstadoAtual(LIVRE);
            matMesa[linha][coluna+1].setEstadoAtual(LIVRE);  
 
       
        }
    }
    
    // Função que desocupa uma mesa caso seu estado seja OCUPADA, trocando seu estado para DESINFECTAR
    public static void desocuparMesa(Mesa matMesa[][], int linha, int coluna){ 
        if(matMesa[linha][coluna].estadoAtual == OCUPADA){
            matMesa[linha][coluna].estadoAtual = DESINFECTAR;
        }
    }
    
    // Função para efetuar os distanciamento de mesas ao redor de uma mesa reservada
    public static void distanciamentoMesa(Mesa matMesa[][], int numeroMesa){ 
        int i, j;
       
        if(numeroMesa >= 1 && numeroMesa <= 30){ // este if chega se o número da mesa está entre 1 e 30, caso não esteja uma mensagem de erro será mostrada
            for(i = 0; i < 5; i++){
                 for(j = 0; j < 6; j++){
                     
                     /* o if abaixo checa se o estado da mesa é diferente de SEGURANÇA 
                        e o número da mesa fornecido corresponde ao número armazenado na posição da matriz que se quer trocar o estado.
                        Caso seja verdade, o restante do código será executado e cada caso de distanciamento de mesas será tratado.
                        Os casos específos a serem tratados correspodem a primeira e ultima linha e coluna, que são necessários serem
                        executados passos diferentes das mesas do centro para bloquea-las para distanciamento*/ 
                     if (matMesa[i][j].getEstadoAtual() != SEGURANÇA && matMesa[i][j].getNumeroMesa() == numeroMesa){
                         
                        switch (j){
                            // caso j = o, ou seja, caso a coluna da matriz de mesas a ser tratada seja a primeira, então os seguintes codigos sao executados
                            case 0:
                                if (matMesa[i][j].getNumeroMesa() == numeroMesa){
                                    // se a mesa for a 1, então apenas as mesas 1 e 2 serão bloqueadas
                                    if (numeroMesa == 1){ 
                                        matMesa[i][(j + 1)].setEstadoAtual(SEGURANÇA);//bloquear mesa seguinte
                                        matMesa[i+1][j].setEstadoAtual(SEGURANÇA);//bloquear mesa inferior
                                    }
                                    // caso o contrário, se a mesa for a 25, então apenas as mesas 19 e 26 serão bloqueadas
                                    else if (numeroMesa == 25){
                                        matMesa[i-1][j].setEstadoAtual(SEGURANÇA);//bloquear mesa superior
                                        matMesa[i][j+1].setEstadoAtual(SEGURANÇA);//bloquear mesa seguinte
                                    // se não for nenhum dos casos anteriores da primeira coluna, então 3 mesas serão bloqueadas ao invés de apenas 2 
                                    } else {
                                        matMesa[i-1][j].setEstadoAtual(SEGURANÇA);//bloquear mesa superior
                                        matMesa[i][(j + 1)].setEstadoAtual(SEGURANÇA);//bloquear mesa seguinte
                                        matMesa[(i + 1)][j].setEstadoAtual(SEGURANÇA);//bloquear mesa inferior
                                    }
                                }
                                break;
                            // Da mesma forma, caso j = 5, os mesmos passos anteiores serão executados, com a difença das posições das mesas 
                            // 
                            case 5:
                                if (matMesa[i][j].getNumeroMesa() == numeroMesa){
                                    if (numeroMesa == 6){
                                        matMesa[i][(j - 1)].setEstadoAtual(SEGURANÇA);//bloquear mesa anterior
                                        matMesa[i+1][j].setEstadoAtual(SEGURANÇA);//bloquear mesa inferior
                                    }
                                    else if (numeroMesa == 30){
                                        matMesa[i-1][j].setEstadoAtual(SEGURANÇA);//bloquear mesa superior
                                        matMesa[i][j-1].setEstadoAtual(SEGURANÇA);//bloquear mesa anterior
                                    } else {
                                        matMesa[i-1][j].setEstadoAtual(SEGURANÇA);//bloquear mesa superior
                                        matMesa[i][(j + 1)].setEstadoAtual(SEGURANÇA);//bloquear mesa seguinte
                                        matMesa[(i + 1)][j].setEstadoAtual(SEGURANÇA);//bloquear mesa inferior
                                    }
                                }
                                break;
                        }
                        
                        /*Assim como foram tratados os casos das colunas 0 e 5, será tratado os casos correspondentes das linhas 0 e 5 */
                        switch (i){
                            case 0:
                                /*Caso i = 0 e as colunas da matriz variem entre 1 e 4 (uma vez que os casos referentes 
                                  as colunas 0 e 5 já foram tratadas) e o número da mesa fornecida esteja em alguma posição da matris, 
                                  então 3 mesas serão bloqueadas*/
                                if ((j > 0 && j < 5) && matMesa[i][j].getNumeroMesa() == numeroMesa){
                                    matMesa[i][j-1].setEstadoAtual(SEGURANÇA);//bloquear mesa anterior
                                    matMesa[i+1][(j)].setEstadoAtual(SEGURANÇA);//bloquear mesa inferior
                                    matMesa[i][j+1].setEstadoAtual(SEGURANÇA);//bloquear mesa seguinte
                                }
                                break;
                                // o mesmo acontece com a linha 4, com a diferença das posições das mesas
                            case 4:
                                if ((j > 0 && j < 5) && matMesa[i][j].getNumeroMesa() == numeroMesa){
                                    matMesa[i][j-1].setEstadoAtual(SEGURANÇA);//bloquear mesa anterior
                                    matMesa[i-1][j].setEstadoAtual(SEGURANÇA);//bloquear mesa superior
                                    matMesa[i][j+1].setEstadoAtual(SEGURANÇA);//bloquear mesa seguinte
                                }
                                break;
                        }
                        
                        /*No entanto, caso não se trate das colunas 0 e 5 e das linhas 0 e 4, então se trata das mesas centrais em que 
                          será necessario bloquear 4 mesas ao inves de apenas 2 ou 3 como nos casos anteriores.
                          Se isso for verdade e o número da mesa fornecido corresponder ao numero de alguma mesa na matriz,
                          as mesas correspondetes ao redor da mesa ocupada serão bloqueadas para distanciamento*/
                        if((j != 0 && j != 5) && (i != 0 && i != 4) && matMesa[i][j].getNumeroMesa() == numeroMesa){
                            matMesa[i][(j - 1)].setEstadoAtual(SEGURANÇA);//bloquear mesa anterior
                            matMesa[i][(j + 1)].setEstadoAtual(SEGURANÇA);//bloquear mesa seguinte
                            matMesa[(i + 1)][j].setEstadoAtual(SEGURANÇA);//bloquear mesa inferior
                            matMesa[(i - 1)][j].setEstadoAtual(SEGURANÇA);//bloquear mesa superior
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
    
    //Função para efetuar o ocupamento das mesas 
    public static void ocuparMesa(Mesa matMesa[][], int numeroMesa){
        int i, j;
        
        if(numeroMesa >= 1 && numeroMesa <= 30){ // se o numero da mesa fornecido estiver entre 1 e 30, o restante do codigo é executado
            for(i = 0; i < 5; i++){
                for(j = 0; j < 6; j++){
                    /* se o numero da mesa fornecido corresponder ao numero de mesa em alguma posição da matriz e ela estiver livre, 
                       entao seu estado é trocaddo para OCUPADA e, em seguida, a função de distanciamento é chamada
                       para bloquear aas mesas ao redor para distanciamento social*/
                    if(matMesa[i][j].getNumeroMesa() == numeroMesa){
                        if(mesaLivre(matMesa, i, j) == true){
                            matMesa[i][j].setEstadoAtual(OCUPADA);
                            distanciamentoMesa(matMesa, numeroMesa);
                            break;
                         /* caso a mesa esteja reservada, então seu estado atual sera trocado para OCUPADA
                            a variavel reserva de Mesa será atualizada para false e, por fim, a função de distanciamento é chamada
                            e para efetuar o distanciamento das mesas ao redor da mesa que sera ocupada*/
                        } else if (matMesa[i][j].isReserva() == true){
                            matMesa[i][j].setEstadoAtual(OCUPADA);
                            matMesa[i][j].setReserva(false);
                            distanciamentoMesa(matMesa, numeroMesa);
                        // caso não seja nenhuma das opções anteriores, entao uma msg de erro sera mostrada e a mesa não podera ser ocupada
                        } else {
                            System.out.println("\nErro: A mesa solicitada não pode ser ocupada no momento! Por favor, verique se ela não está OCUPADA, RESERVADA, bloqueada por SEGURANÇA ou se é para DESINFECTAR.");
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
         MapaMesas mesas = new MapaMesas(matMesa);
         mesas.setVisible(true);
         
                    
        /*
        ocuparMesa(matMesa, 1);
        System.out.println("\nEstado da mesa 1: " + matMesa[0][0].estadoAtual);
        System.out.println("\nEstado da mesa 2: " + matMesa[0][1].estadoAtual);
        System.out.println("\nEstado da mesa 7: " + matMesa[1][0].estadoAtual);
        ocuparMesa(matMesa, 8);
        System.out.println("\n\nEstado da mesa 8: " + matMesa[1][1].estadoAtual);
        System.out.println("\nEstado da mesa 9: " + matMesa[1][2].estadoAtual);
        System.out.println("\nEstado da mesa 14: " + matMesa[2][1].estadoAtual);
        reservarMesa(matMesa, 2, 0);
        System.out.println("\n\nEstado da mesa 8: " + matMesa[1][1].estadoAtual);
        System.out.println("\nEstado da mesa 13: " + matMesa[2][0].estadoAtual);
        ocuparMesa(matMesa, 13);
        System.out.println("\nEstado da mesa 13: " + matMesa[2][0].estadoAtual);
        System.out.println("\nEstado da mesa 14: " + matMesa[2][1].estadoAtual);
        System.out.println("\nEstado da mesa 19: " + matMesa[3][0].estadoAtual);
        */
    }
    
}
