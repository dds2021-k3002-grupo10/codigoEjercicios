/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.org.diseno.ejercicios2021.services.trasporte.strategyContexto;

import ar.org.diseno.ejercicios2021.services.trasporte.TransporteEnum;
import ar.org.diseno.ejercicios2021.services.trasporte.strategyConcreta.EnvioEstandar;
import ar.org.diseno.ejercicios2021.services.trasporte.strategyConcreta.EnvioPrivado;
import ar.org.diseno.ejercicios2021.services.trasporte.strategyInterfaces.Transportista;

/**
 *
 * @author Alex
 */
public class Envio {

    private Transportista transportista;

    public Envio() {
    }

    public float getPrecioEnvio(String transportistas, String tipo, Long distancia, Long peso) {
        if (TransporteEnum.EPRIVADO.getDescripcion().equals(transportistas)) {
            this.transportista = new EnvioPrivado();

        } else if (TransporteEnum.EESTANDAR.getDescripcion().equals(transportistas)) {
            this.transportista = new EnvioEstandar();
        }

        return this.transportista.getTarifa(tipo, distancia, peso);
    }

}
