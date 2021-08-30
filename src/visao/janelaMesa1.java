/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import gerenciamento.de.mesas.de.restaurante.gmr.Mesa;
import static gerenciamento.de.mesas.de.restaurante.gmr.Mesa.estados.DESINFECTAR;
import static gerenciamento.de.mesas.de.restaurante.gmr.Mesa.estados.SEGURANÇA;
import static gerenciamento.de.mesas.de.restaurante.gmr.Mesa.estados.LIVRE;
import static gerenciamento.de.mesas.de.restaurante.gmr.Mesa.estados.OCUPADA;
import static gerenciamento.de.mesas.de.restaurante.gmr.Mesa.estados.RESERVADA;
import javax.swing.JOptionPane;

/**
 *
 * @author ranie
 */
public class janelaMesa1 extends javax.swing.JFrame {
    int linha, coluna;
    public Mesa[][] vetMesa;
    /*
    public static Mesa.estados OCUPADA;
    public static Mesa.estados SEGURANÇA;
    public static Mesa.estados DESINFECTAR;
    public static Mesa.estados LIVRE;
    public static Mesa.estados RESERVADA;
  */  
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
            desinfectarMesa(matMesa, linha, coluna, matMesa[linha][coluna].getNumeroMesa());
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
    public static void desinfectarMesa(Mesa matMesa[][], int i, int j, int numeroMesa){ 

        if(matMesa[i][j].estadoAtual == DESINFECTAR){
            matMesa[i][j].estadoAtual = LIVRE;
            
            for(i = 0; i < 5; i++){
                 for(j = 0; j < 6; j++){
                        switch (j){
                            // caso j = o, ou seja, caso a coluna da matriz de mesas a ser tratada seja a primeira, então os seguintes codigos sao executados
                            case 0:
                                if (matMesa[i][j].getNumeroMesa() == numeroMesa){
                                    if (numeroMesa == 1 && matMesa[i][j+2].getEstadoAtual() != OCUPADA && matMesa[i+1][j+1].getEstadoAtual() != OCUPADA && matMesa[i+2][j].getEstadoAtual() != OCUPADA){ 
                                        matMesa[i][(j + 1)].setEstadoAtual(LIVRE);//bloquear mesa seguinte
                                        matMesa[i+1][j].setEstadoAtual(LIVRE);//bloquear mesa inferior
                                    }
                                    if (numeroMesa == 25 && matMesa[i-1][j+1].getEstadoAtual() != OCUPADA && matMesa[i-2][j].getEstadoAtual() != OCUPADA){
                                        matMesa[i-1][j].setEstadoAtual(LIVRE);//bloquear mesa superior
                                        matMesa[i][j+1].setEstadoAtual(LIVRE);
                                    }
                                    if (numeroMesa == 7 && matMesa[i-1][j+1].getEstadoAtual() != OCUPADA && matMesa[i][j+2].getEstadoAtual() != OCUPADA && matMesa[i+1][j+1].getEstadoAtual() != OCUPADA && matMesa[i+2][j].getEstadoAtual() != OCUPADA){
                                            matMesa[i-1][j].setEstadoAtual(LIVRE);
                                            matMesa[i][(j + 1)].setEstadoAtual(LIVRE);
                                            matMesa[(i + 1)][j].setEstadoAtual(LIVRE);
                                    }
                                    if (numeroMesa == 19 && matMesa[i+1][j+1].getEstadoAtual() != OCUPADA && matMesa[i][j+2].getEstadoAtual() != OCUPADA && matMesa[i-1][j+1].getEstadoAtual() != OCUPADA && matMesa[i-2][j].getEstadoAtual() != OCUPADA){ 
                                            matMesa[i+1][j].setEstadoAtual(LIVRE);
                                            matMesa[i][j + 1].setEstadoAtual(LIVRE);
                                            matMesa[i-1][j].setEstadoAtual(LIVRE);
                                    } 
                                    if (numeroMesa == 13 && matMesa[i-2][j].getEstadoAtual() != OCUPADA && matMesa[i-1][j+1].getEstadoAtual() != OCUPADA && matMesa[i][j+2].getEstadoAtual() != OCUPADA && matMesa[i+1][j+1].getEstadoAtual() != OCUPADA && matMesa[i+2][j].getEstadoAtual() != OCUPADA){
                                            matMesa[i-1][j].setEstadoAtual(LIVRE);
                                            matMesa[i][(j + 1)].setEstadoAtual(LIVRE);
                                            matMesa[(i + 1)][j].setEstadoAtual(LIVRE);
                                    }
                                 }
                                 break;
         
                                
                            case 5:
                                if (matMesa[i][j].getNumeroMesa() == numeroMesa){    
                                    if (numeroMesa == 6 && matMesa[i][j-2].getEstadoAtual() != OCUPADA && matMesa[i+1][j-1].getEstadoAtual() != OCUPADA && matMesa[i+2][j].getEstadoAtual() != OCUPADA){ 
                                        matMesa[i][j-1].setEstadoAtual(LIVRE);//bloquear mesa seguinte
                                        matMesa[i+1][j].setEstadoAtual(LIVRE);//bloquear mesa inferior
                                    }
                                    if (numeroMesa == 12 && matMesa[i-1][j-1].getEstadoAtual() != OCUPADA && matMesa[i][j-2].getEstadoAtual() != OCUPADA && matMesa[i+1][j-1].getEstadoAtual() != OCUPADA && matMesa[i+2][j].getEstadoAtual() != OCUPADA){
                                            matMesa[i-1][j].setEstadoAtual(LIVRE);
                                            matMesa[i][j-1].setEstadoAtual(LIVRE);
                                            matMesa[i+1][j].setEstadoAtual(LIVRE);
                                    } 
                                    if (numeroMesa == 18 && matMesa[i-2][j].getEstadoAtual() != OCUPADA && matMesa[i-1][j-1].getEstadoAtual() != OCUPADA && matMesa[i][j-2].getEstadoAtual() != OCUPADA && matMesa[i+1][j-1].getEstadoAtual() != OCUPADA && matMesa[i+2][j].getEstadoAtual() != OCUPADA){
                                            matMesa[i-1][j].setEstadoAtual(LIVRE);
                                            matMesa[i][j-1].setEstadoAtual(LIVRE);
                                            matMesa[i+1][j].setEstadoAtual(LIVRE);
                                    }
                                    if (numeroMesa == 24 && matMesa[i-2][j].getEstadoAtual() != OCUPADA && matMesa[i-1][j-1].getEstadoAtual() != OCUPADA && matMesa[i][j-2].getEstadoAtual() != OCUPADA && matMesa[i+1][j-1].getEstadoAtual() != OCUPADA){ 
                                            matMesa[i-1][j].setEstadoAtual(LIVRE);
                                            matMesa[i][j-1].setEstadoAtual(LIVRE);
                                            matMesa[i+1][j].setEstadoAtual(LIVRE);
                                    }
                                    if (numeroMesa == 30 && matMesa[i][j-2].getEstadoAtual() != OCUPADA && matMesa[i-1][j-1].getEstadoAtual() != OCUPADA && matMesa[i-2][j].getEstadoAtual() != OCUPADA){
                                        matMesa[i][j-1].setEstadoAtual(LIVRE);//bloquear mesa superior
                                        matMesa[i-1][j].setEstadoAtual(LIVRE);
                                    }
                                }
                                break;
                            }
                        
                        /*Assim como foram tratados os casos das colunas 0 e 5, será tratado os casos correspondentes das linhas 0 e 5 */
                        switch (i){
                            case 0:
                                if ((j > 0 && j < 5) && matMesa[i][j].getNumeroMesa() == numeroMesa){
                                    if (numeroMesa == 2 && matMesa[i+1][j-1].getEstadoAtual() != OCUPADA && matMesa[i+2][j].getEstadoAtual() != OCUPADA && matMesa[i+1][j+1].getEstadoAtual() != OCUPADA && matMesa[i][j+2].getEstadoAtual() != OCUPADA){
                                        matMesa[i][j-1].setEstadoAtual(LIVRE);
                                        matMesa[i+1][(j)].setEstadoAtual(LIVRE);
                                        matMesa[i][j+1].setEstadoAtual(LIVRE);
                                    } else if (numeroMesa == 5 && matMesa[i][j-2].getEstadoAtual() != OCUPADA && matMesa[i+1][j-1].getEstadoAtual() != OCUPADA && matMesa[i+2][j].getEstadoAtual() != OCUPADA && matMesa[i+1][j+1].getEstadoAtual() != OCUPADA){
                                        matMesa[i][j-1].setEstadoAtual(LIVRE);
                                        matMesa[i+1][(j)].setEstadoAtual(LIVRE);
                                        matMesa[i][j+1].setEstadoAtual(LIVRE);
                                    } else {
                                        if (matMesa[i][j-2].getEstadoAtual() != OCUPADA && matMesa[i+1][j-1].getEstadoAtual() != OCUPADA && matMesa[i+2][j].getEstadoAtual() != OCUPADA && matMesa[i+1][j+1].getEstadoAtual() != OCUPADA && matMesa[i][j+2].getEstadoAtual() != OCUPADA){
                                            matMesa[i][j-1].setEstadoAtual(LIVRE);
                                            matMesa[i+1][(j)].setEstadoAtual(LIVRE);
                                            matMesa[i][j+1].setEstadoAtual(LIVRE);
                                        }
                                    }
                                }
                                break;
                                // o mesmo acontece com a linha 4, com a diferença das posições das mesas
                            case 4:
                                if ((j > 0 && j < 5) && matMesa[i][j].getNumeroMesa() == numeroMesa){
                                    if (numeroMesa == 26 && matMesa[i-1][j-1].getEstadoAtual() != OCUPADA && matMesa[i-2][j].getEstadoAtual() != OCUPADA && matMesa[i-1][j+1].getEstadoAtual() != OCUPADA && matMesa[i][j+2].getEstadoAtual() != OCUPADA){
                                        matMesa[i][j-1].setEstadoAtual(LIVRE);
                                        matMesa[i-1][j].setEstadoAtual(LIVRE);
                                        matMesa[i][j+1].setEstadoAtual(LIVRE);
                                    } else if (numeroMesa == 29 && matMesa[i][j-2].getEstadoAtual() != OCUPADA && matMesa[i-1][j-1].getEstadoAtual() != OCUPADA && matMesa[i-2][j].getEstadoAtual() != OCUPADA && matMesa[i-1][j+1].getEstadoAtual() != OCUPADA){
                                        matMesa[i][j-1].setEstadoAtual(LIVRE);
                                        matMesa[i-1][(j)].setEstadoAtual(LIVRE);
                                        matMesa[i][j+1].setEstadoAtual(LIVRE);
                                    } else {
                                        if (matMesa[i][j-2].getEstadoAtual() != OCUPADA && matMesa[i-1][j-1].getEstadoAtual() != OCUPADA && matMesa[i-2][j].getEstadoAtual() != OCUPADA && matMesa[i-1][j+1].getEstadoAtual() != OCUPADA && matMesa[i][j+2].getEstadoAtual() != OCUPADA){
                                            matMesa[i][j-1].setEstadoAtual(LIVRE);
                                            matMesa[i-1][(j)].setEstadoAtual(LIVRE);
                                            matMesa[i][j+1].setEstadoAtual(LIVRE);
                                        }
                                    }
                                }
                                break;
                        }
                        
                        /*No entanto, caso não se trate das colunas 0 e 5 e das linhas 0 e 4, então se trata das mesas centrais em que 
                          será necessario bloquear 4 mesas ao inves de apenas 2 ou 3 como nos casos anteriores.
                          Se isso for verdade e o número da mesa fornecido corresponder ao numero de alguma mesa na matriz,
                          as mesas correspondetes ao redor da mesa ocupada serão bloqueadas para distanciamento*/
                        if((j != 0 && j != 5) && (i != 0 && i != 4) && matMesa[i][j].getNumeroMesa() == numeroMesa){
                            if (matMesa[i-1][j-1].getEstadoAtual() != OCUPADA && matMesa[i-1][j+1].getEstadoAtual() != OCUPADA && matMesa[i+1][j-1].getEstadoAtual() != OCUPADA && matMesa[i+1][j+1].getEstadoAtual() != OCUPADA){
                                matMesa[i-1][j].setEstadoAtual(LIVRE);//bloquear mesa anterior
                                matMesa[i][j-1].setEstadoAtual(LIVRE);//bloquear mesa seguinte
                                matMesa[i+1][j].setEstadoAtual(LIVRE);//bloquear mesa inferior
                                matMesa[i][j+1].setEstadoAtual(LIVRE);//bloquear mesa superior
                            }
                           
                        }
                    }
                }
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
                                        matMesa[i][j-1].setEstadoAtual(SEGURANÇA);//bloquear mesa seguinte
                                        matMesa[i+1][j].setEstadoAtual(SEGURANÇA);//bloquear mesa inferior
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
    
    

    /**
     * Creates new form janelaMesa1
     */
    public janelaMesa1(Mesa matMesa[][], int i, int j) {
        initComponents();
        this.vetMesa = matMesa;
        jLabel1.setText("Mesa " + this.vetMesa[i][j].getNumeroMesa());
    }

    private janelaMesa1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVerEstadoAtual = new javax.swing.JButton();
        btnOcuparMesa = new javax.swing.JButton();
        btnDesinfectar = new javax.swing.JButton();
        btnReservar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnDesocuparMesa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnVerEstadoAtual.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnVerEstadoAtual.setText("Ver estado atual");
        btnVerEstadoAtual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerEstadoAtualActionPerformed(evt);
            }
        });

        btnOcuparMesa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnOcuparMesa.setText("Ocupar Mesa");
        btnOcuparMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOcuparMesaActionPerformed(evt);
            }
        });

        btnDesinfectar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDesinfectar.setText("Desinfectar");
        btnDesinfectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesinfectarActionPerformed(evt);
            }
        });

        btnReservar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnReservar.setText("Reservar");
        btnReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservarActionPerformed(evt);
            }
        });

        btnVoltar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(255, 0, 0));
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel1.setText("Mesa 1");

        jLabel2.setText("Opções:");

        btnDesocuparMesa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDesocuparMesa.setText("Desocupar Mesa");
        btnDesocuparMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesocuparMesaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(137, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(159, 159, 159))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(btnReservar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVoltar)
                            .addGap(19, 19, 19))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnVerEstadoAtual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnOcuparMesa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDesinfectar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDesocuparMesa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(133, 133, 133)))))
            .addGroup(layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(btnVerEstadoAtual)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnOcuparMesa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDesocuparMesa)
                .addGap(12, 12, 12)
                .addComponent(btnDesinfectar)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar)
                    .addComponent(btnReservar))
                .addGap(18, 18, 18))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerEstadoAtualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerEstadoAtualActionPerformed
        JOptionPane.showMessageDialog(null, "O estado atual da Mesa " + this.vetMesa[linha][coluna].getNumeroMesa() + " é: " + this.vetMesa[linha][coluna].getEstadoAtual());
    }//GEN-LAST:event_btnVerEstadoAtualActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.setVisible(false); //fecha a tela de operações
        MapaMesas mesas = new MapaMesas(vetMesa);
        mesas.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnOcuparMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOcuparMesaActionPerformed
        //ocuparMesa(this.matMesa, this.matMesa[0][0].getNumeroMesa());
        this.vetMesa[linha][coluna].setEstadoAtual(OCUPADA);
        this.vetMesa[linha][coluna] = vetMesa[linha][coluna];
        distanciamentoMesa(this.vetMesa, this.vetMesa[linha][coluna].getNumeroMesa());
        
        JOptionPane.showMessageDialog(null, "A Mesa " + this.vetMesa[linha][coluna].getNumeroMesa() + " foi " + this.vetMesa[linha][coluna].getEstadoAtual() + " com sucesso!");
    }//GEN-LAST:event_btnOcuparMesaActionPerformed

    private void btnDesinfectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesinfectarActionPerformed
        desinfectarMesa(this.vetMesa, linha, coluna, vetMesa[linha][coluna].getNumeroMesa());
        if(this.vetMesa[linha][coluna].getEstadoAtual() == LIVRE){
            JOptionPane.showMessageDialog(null, "A Mesa " + this.vetMesa[linha][coluna].getNumeroMesa() + " foi desinfectada com sucesso!");
        }
        
    }//GEN-LAST:event_btnDesinfectarActionPerformed

    private void btnDesocuparMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesocuparMesaActionPerformed
        desocuparMesa(vetMesa, linha, coluna);
        JOptionPane.showMessageDialog(null, "A Mesa " + this.vetMesa[linha][coluna].getNumeroMesa() + " foi desocupada com sucesso! Ela deve ser desinfectada!");
    }//GEN-LAST:event_btnDesocuparMesaActionPerformed

    private void btnReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservarActionPerformed
        reservarMesa(vetMesa, linha, coluna);
        if(this.vetMesa[linha][coluna].getEstadoAtual() == RESERVADA){
            JOptionPane.showMessageDialog(null, "A Mesa " + this.vetMesa[linha][coluna].getNumeroMesa() + " foi reservada com sucesso!");
        }
    }//GEN-LAST:event_btnReservarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(janelaMesa1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(janelaMesa1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(janelaMesa1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(janelaMesa1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //Mesa matMesa[][] = new Mesa[5][6];
        //matMesa = this.matMesa;
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                janelaMesa1 jMesa1;
                //Mesa vetorMesa[][] = new Mesa[5][6];
                //vetorMesa = vetMesa;
                jMesa1 = new janelaMesa1();
                jMesa1.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDesinfectar;
    private javax.swing.JButton btnDesocuparMesa;
    private javax.swing.JButton btnOcuparMesa;
    private javax.swing.JButton btnReservar;
    private javax.swing.JButton btnVerEstadoAtual;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

}
