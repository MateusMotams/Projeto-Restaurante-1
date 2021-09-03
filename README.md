# Gerencimento de Mesas de Restaurante (GMR)



<p align="center">
    <a href="#sobre">Sobre </a> *
    <a href="#funções"> Funções </a> *
    <a href="#instalação"> Instalação </a> *
    <a href="#feedback"> Feedback </a> *
    <a href="#tecnologias"> Tecnologias </a> *
    <a href="#features"> Features </a> *
    <a href="#colaboradores"> Colaboradores </a> *
</P>

<h4 align="center">
    Projeto Finalizado em 03/09/2021!
</h4>

# Sobre

Solução de software para reserva de mesas no comércio de varejo alimentício.

Modelo de Processo usado para a criação da aplicação foi Prototipagem Rápida, que é uma coleção de técnicas formais e informais para desenvolvimento, desmonstração e avaliação do design de interfaces de úsuarios, que dá suporte a interações rápidas.

Em tempos de pandemia originada pela COVID-19 há uma preocupação muito grande com o distanciamento social e com os protocolos de segurança sanitária.

Tendo isso em vista, é notório que os restaurantes são locais bastante frequentados e com risco de contágio maior, pensando nisso, este software visa manter o distanciamento social em restaurantes, baseando-se no gerenciamento de mesas presentes no local, e assim proporcionar um local seguro, que esteja de acordo com os protocolos sanitários, e que seja ideal para as pessoas aproveitarem ao máximo seu momento de lazer.

# Funções

<h3 align="center">Algumas funções implementadas na aplicação.</h3>


<h4>Chamada da função para verificar se a mesa está livre .</h4>


```
public static boolean mesaLivre(Mesa matMesa[][], int linha, int coluna){
        if(matMesa[linha][coluna].estadoAtual == LIVRE){
            return true;
        }else{
            return false;
        }
}
```
<h4 align="center">Função que verirfica se a mesa está livre (em execução).</h4>

<p align="center">
    <img align="center" src="https://user-images.githubusercontent.com/81472331/131894549-c52ca7b4-f1df-4866-be37-358f97ccbb40.gif">
    </img>
</p>

<h4>Chamada da função para a reserva de uma mesa .</h4>

```
 public static void reservarMesa(Mesa matMesa[][], int linha, int coluna){
        
        if(mesaLivre(matMesa, linha, coluna) == true){ 
            matMesa[linha][coluna].setReserva(true);
            matMesa[linha][coluna].setEstadoAtual(RESERVADA);
        }else{
            System.out.println("\nErro: A mesa nao pode ser reservada no momento!\n");
        }
    }

```
<h4 align="center">Função de reserva de mesa em excução.</h4>

<p align="center">
    <img src="https://user-images.githubusercontent.com/81472331/131895068-f7cd9b86-dc2f-4f36-85d3-1a74cde3ed93.gif">
</p>

<h4>Chamada da função que faz a principal função do codigo, promover o distanciamento seguro das mesas com etiqueta de "SEGURANÇA".</h4>


```
public static void distanciamentoMesa(Mesa matMesa[][], int numeroMesa){ 
        int i, j;
       
        if(numeroMesa >= 1 && numeroMesa <= 30){ // este if chega se o número da mesa está entre 1 e 30, caso não esteja uma mensagem de erro será mostrada
            for(i = 0; i < 5; i++){
                 for(j = 0; j < 6; j++){
                     
                     if (matMesa[i][j].getEstadoAtual() != SEGURANÇA && matMesa[i][j].getNumeroMesa() == numeroMesa){
                         
                        switch (j){
                            case 0:
                                if (matMesa[i][j].getNumeroMesa() == numeroMesa){
                                    
                                    if (numeroMesa == 1){ 
                                        matMesa[i][(j + 1)].setEstadoAtual(SEGURANÇA);//bloquear mesa seguinte
                                        matMesa[i+1][j].setEstadoAtual(SEGURANÇA);//bloquear mesa inferior
                                    }
                                    
                                    else if (numeroMesa == 25){
                                        matMesa[i-1][j].setEstadoAtual(SEGURANÇA);//bloquear mesa superior
                                        matMesa[i][j+1].setEstadoAtual(SEGURANÇA);//bloquear mesa seguinte
                                     
                                    } else {
                                        matMesa[i-1][j].setEstadoAtual(SEGURANÇA);//bloquear mesa superior
                                        matMesa[i][(j + 1)].setEstadoAtual(SEGURANÇA);//bloquear mesa seguinte
                                        matMesa[(i + 1)][j].setEstadoAtual(SEGURANÇA);//bloquear mesa inferior
                                    }
                                }
                                break;
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
                        switch (i){
                            case 0:
                                if ((j > 0 && j < 5) && matMesa[i][j].getNumeroMesa() == numeroMesa){
                                    matMesa[i][j-1].setEstadoAtual(SEGURANÇA);
                                    matMesa[i+1][(j)].setEstadoAtual(SEGURANÇA);
                                    matMesa[i][j+1].setEstadoAtual(SEGURANÇA);
                                }
                                break;
                                // o mesmo acontece com a linha 4, com a diferença das posições das mesas
                            case 4:
                                if ((j > 0 && j < 5) && matMesa[i][j].getNumeroMesa() == numeroMesa){
                                    matMesa[i][j-1].setEstadoAtual(SEGURANÇA);
                                    matMesa[i-1][j].setEstadoAtual(SEGURANÇA);
                                    matMesa[i][j+1].setEstadoAtual(SEGURANÇA);
                                }
                                break;
                        }
                        if((j != 0 && j != 5) && (i != 0 && i != 4) && matMesa[i][j].getNumeroMesa() == numeroMesa){
                            matMesa[i][(j - 1)].setEstadoAtual(SEGURANÇA);
                            matMesa[i][(j + 1)].setEstadoAtual(SEGURANÇA);
                            matMesa[(i + 1)][j].setEstadoAtual(SEGURANÇA);
                            matMesa[(i - 1)][j].setEstadoAtual(SEGURANÇA);
                        }
                    }
                }
            }
        } else{
            System.out.println("\nErro: O numero de mesa digitado é invalido!\n");
        }
    } 

```
<h4 align="center">Após a função de ocupar mesa ser chamada, o distanciamento seguro das mesas com etiqueta de "SEGURANÇA" (principal função do codigo) é aplicado. </h4>

<p align="center">
    <img src="https://user-images.githubusercontent.com/81472331/131895548-1b819e4e-f011-4050-967b-f09be4124024.gif">
</p>

<h4>Chamada da função que faz a ocupação da mesa desejada.</h4>

```

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

```
<h4 align="center">Função de ocupar mesa em execução </h4>

<p align="center">
    <img src="https://user-images.githubusercontent.com/81472331/131895781-d931b533-24f0-47b7-aacb-15365662b4b3.gif">
</p>

# Instalação
## Passos para executar o software GMR já compilado (arquivo .jar):
1. Acessar a página da internet: https://github.com/MateusMotams/Projeto-Restaurante-GMR-
2. Clicar no botão verde "Code"
3. No menu aberto pelo botão do passo anterior, clique em "Download ZIP"
4. Descompacte o arquivo .ZIP chamado "Projeto-Restaurante-GMR--master" com o uso do software de sua preferência (por exemplo: WinRAR, 7-Zip etc).
5. Se após clicar com o botão direito do mouse no arquivo .ZIP do passo anterior, você selecionar a opção de "Extract Here/Extrair Aqui", você terá acesso à uma pasta chamada "Projeto-Restaurante-GMR--master", abra-a. Ou se você selecionar a opção "Extract to/Extrair para Projeto-Restaurante-GMR--master\" abra a pasta de mesmo nome (Projeto-Restaurante-GMR--master), neste método haverá uma subpasta com o mesmo nome antes de chegar aos arquivos principais.
6. Abra a pasta "dist".
7. Dentro da pasta "dist" clique duas vezes no ícone (ou no nome) do arquivo "Gerenciamento_de_Mesas_de_Restaurante__GMR_". Agora você pode usar o software GMR.
8. (OPCIONAL) Caso você não tenha conseguido seguir o 1º Passo, provavelmente é preciso instalar o Java Runtime Environment (JRE) no link: https://www.java.com/pt-BR/download/manual.jsp
9. (OPCIONAL) Abrir a IDE que ofereça suporte a Java de sua preferência e abrir o projeto da pasta "Projeto-Restaurante-GMR--master". Agora, você pode analisar os códigos-fontes produzidos pelos membros desta equipe de desenvolvimento e fazer novas compilações e/ou alterações na programação feita.

# Feedback

<img align="center" src="https://user-images.githubusercontent.com/81472331/131927123-61a3dbaa-98ec-40c5-ac58-b41873bdba16.png"></img>


<h4>Após o software ser testado (por terceiros não envolvidos com trabalho e de forma voluntária) foi constatado por parte dos usuários a falta da função de cancelar a reserva de uma mesa. Após feita a respectiva alteração e atualização dos códigos-fontes, pode-se ver a função abaixo em execução.</h4>


<p align="center">
<img src="https://user-images.githubusercontent.com/81472331/131928632-3b1dea01-ca7f-4056-93a8-13100b8f0686.gif"></img>
</p>

# Tecnologias
<div>
    <img align="center" height="70" width="70" src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original-wordmark.svg">
</div>

# Features

- [x] Cliente
- [x] Gerenciamento de mesas 
    - [x] ocupar mesa
    - [x] distanciamento das mesas
    - [x] reservar mesa
    - [x] cancelar reserva de mesa
    - [x] desocupar mesa
    - [x] desinfectar mesa
    - [x] outras
- [x] Mesa
- [x] Interface gráfica (em Java)

# Colaboradores

Raniery Alves Vasconcelos (Matrícula: 473532) <a href = "mailto:raniery_vasconcelos@alu.ufc.br"><img src="https://img.shields.io/badge/-Gmail-%23333?style=for-the-badge&logo=gmail&logoColor=white" target="_blank"></a>

Kossi Dominique (Matrícula: 422707) <a href = "mailto:kossidominique@alu.ufc.br"><img src="https://img.shields.io/badge/-Gmail-%23333?style=for-the-badge&logo=gmail&logoColor=white" target="_blank"></a>

Luan Gomes (Matrícula: 473008) <a href = "mailto:luangomes@alu.ufc.br"><img src="https://img.shields.io/badge/-Gmail-%23333?style=for-the-badge&logo=gmail&logoColor=white" target="_blank"></a>

Mateus Mota (Matrícula: 432342) <a href = "mailto:mateusms@alu.ufc.br"><img src="https://img.shields.io/badge/-Gmail-%23333?style=for-the-badge&logo=gmail&logoColor=white" target="_blank"></a>

Yara Braga (Matrícula: 433931) <a href = "mailto:yrbraga@alu.ufc.br"><img src="https://img.shields.io/badge/-Gmail-%23333?style=for-the-badge&logo=gmail&logoColor=white" target="_blank"></a>

Kenedy (Matrícula: 478937) <a href = "mailto:kenedyr14@alu.ufc.br"><img src="https://img.shields.io/badge/-Gmail-%23333?style=for-the-badge&logo=gmail&logoColor=white" target="_blank"></a>
