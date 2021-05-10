/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.org.diseno.ejercicios2021.services.trasporte.strategyInterfaces;

/**
 *
 * @author Alex
 */
public interface Transportista {
    
     public float getTarifa( String tipo, Long distancia, Long peso);
     
}
