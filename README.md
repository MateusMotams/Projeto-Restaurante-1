# Reserva de Mesas Para Restaurante





<p align="center">
    <a href="#sobre">Sobre </a> *
    <a href="#funções"> Funções </a> *
    <a href="#features"> Features </a> *
    <a href="#colaboradores"> Colaboradores </a> *
</P>

<h4 align="center">
    🚧 Projeto em Construção... 🚧
</h4>

# Sobre

Solução para reserva de mesas no comércio de varejo alimentício.

Metodologia usada para a criação da aplicação foi prototipagem rápida , que é uma coleção de técnicas formais e informais para desenvolvimento ,desmostração e avaliação do design de interfaces de úsuarios , que dá suporte a interações rápidas.
 


# Funções

<h3 align="center">Algumas funções implementadas na aplicação.</h3>


<h4>Chamada da função para verirficar se a mesa está livre .</h4>


```
public static boolean mesaLivre(Mesa matMesa[][], int linha, int coluna){
    if(matMesa[linha][coluna].estadoAtual == LIVRE && matMesa[linha][coluna] isReserva()== false){
        return true;
    }else{
        return false;
    }
}
```

<h4>Chamada da função para a reserva de uma mesa .</h4>

```
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

```



# Tecnologias


# Features
- [x] Cliente
- [x] Gerenciamento de mesa
- [x] Mesa
- [x] Interface gráfica

# Colaboradores

Kenedy: https://github.com/knd14?tab=repositories

Raniery Vasconcelos: raniery_vasconcelos@alu.ufc.br

Dominique: kossidominique@alu.ufc.br

Luan Gomes: luangomes@alu.ufc.br

Mateus Mota: mateusms@alu.ufc.br

Yara Braga: yrbraga@alu.ufc.br
