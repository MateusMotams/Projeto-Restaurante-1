/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciamento.de.mesas.de.restaurante.gmr;

/**
 *
 * @author Yara
 */

public class Cliente {
    boolean temperaturaSegura;
    boolean usaMascara;
    int idCliente;

    public boolean isTemperaturaSegura() {
        return temperaturaSegura;
    }

    public void setTemperaturaSegura(boolean temperaturaSegura) {
        this.temperaturaSegura = temperaturaSegura;
    }

    public boolean isUsaMascara() {
        return usaMascara;
    }

    public void setUsaMascara(boolean usaMascara) {
        this.usaMascara = usaMascara;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    
}
