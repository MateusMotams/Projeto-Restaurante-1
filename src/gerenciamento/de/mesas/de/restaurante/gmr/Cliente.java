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
    boolean temperatura;
    boolean usaMascara;
    int idClient;

    public boolean isTemperatura() {
        return temperatura;
    }

    public void setTemperatura(boolean temperatura) {
        this.temperatura = temperatura;
    }

    public boolean isUsaMascara() {
        return usaMascara;
    }

    public void setUsaMascara(boolean usaMascara) {
        this.usaMascara = usaMascara;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }
    
}
