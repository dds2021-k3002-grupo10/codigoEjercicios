/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.org.diseno.ejercicios2021.services.trasporte;

/**
 *
 * @author Alex
 */
public enum TransporteEnum {
    EPRIVADO("PRIVADO"),
    EESTANDAR("ESTANDAR");

    private final String descripcion;

    TransporteEnum(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public static boolean isValidTransporte(String transporte) {
        for (TransporteEnum transporteActual : TransporteEnum.values()) {
            if (transporteActual.toString().equals(transporte)) {
                return true;
            }
        }

        return false;
    }
}
