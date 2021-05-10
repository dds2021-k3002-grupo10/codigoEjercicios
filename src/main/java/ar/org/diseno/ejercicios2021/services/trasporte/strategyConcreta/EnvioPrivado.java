/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.org.diseno.ejercicios2021.services.trasporte.strategyConcreta;

import ar.org.diseno.ejercicios2021.services.trasporte.strategyInterfaces.Transportista;

/**
 * 129
 *
 * @author Alex
 */
public class EnvioPrivado implements Transportista {

    /* USO DATOS SOLO PARA EJEMPLO*/
    private float costoporPesoLocal = 300;
    private float costoporPesoDistancia = 600;

    @Override
    public float getTarifa(String tipo, Long distancia, Long peso) {
        float resultado = 0;
        if ("LARGA_DISTANCIA".equals(tipo)) {
            resultado = costoporPesoDistancia * peso;
        } else {
            resultado = costoporPesoLocal * peso;
        }
        return resultado;

    }

}
