/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asincrono.CajeroThread;

import asincrona.CajeroSecuencial.*;

/**
 *
 * @author root
 */
public class ClienteThread {

	private String nombre;
	private int[] carroCompra;

	// Constructor, getter y setter
    public ClienteThread (String nombre, int[] carroCompra){
        this.nombre = nombre;
        this.carroCompra = carroCompra;
    }    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int[] getCarroCompra(){
        return carroCompra;
    }
    public void setCarroCompra(int[] carroCompra){
        this.carroCompra = carroCompra;
    }
}
