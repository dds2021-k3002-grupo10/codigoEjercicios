/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.org.diseno.ejercicios2021.services.trasporte.strategyConcreta;

import ar.org.diseno.ejercicios2021.services.trasporte.strategyInterfaces.Transportista;

/**
 *
 * @author Alex
 */
public class EnvioEstandar implements Transportista {

    /* USO DATOS SOLO PARA EJEMPLO*/
    private final float costoporkmLocal = 60;
    private final float costoporkmDistancia = 30;

    @Override
    public float getTarifa(String tipo, Long distancia, Long peso) {
        float resultado = 0;
        if ("LARGA_DISTANCIA".equals(tipo)) {
            resultado = costoporkmDistancia * distancia;
        } else {
            resultado = costoporkmLocal * distancia;
        }
        return resultado;
    }

}
