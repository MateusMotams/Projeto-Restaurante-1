/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciamento.de.mesas.de.restaurante.gmr;

import static gerenciamento.de.mesas.de.restaurante.gmr.Mesa.estados.LIVRE;
import static gerenciamento.de.mesas.de.restaurante.gmr.Mesa.estados.TEST;

/**
 *
 * @author ranie
 */
public class Mesa {

    
    public enum estados {LIVRE, OCUPADA, DESINFECTAR, RESERVADA, SEGURANÇA, TEST};
    public estados estadoAtual = LIVRE;
    public int numeroMesa;
    public int numeroCadeiras = 4;
    public boolean reserva = false; //Por padrão a mesa ao ser criada, não está reservada.

    public estados getEstadoAtual() {
        return estadoAtual;
    }

    public void setEstadoAtual(estados estadoAtual) {
        this.estadoAtual = estadoAtual;
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public int getNumeroCadeiras() {
        return numeroCadeiras;
    }

    public void setNumeroCadeiras(int numeroCadeiras) {
        this.numeroCadeiras = numeroCadeiras;
    }

    public boolean isReserva() {
        return reserva;
    }

    public void setReserva(boolean reserva) {
        this.reserva = reserva;
    }

    
}
