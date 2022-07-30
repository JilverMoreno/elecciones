/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eleccionesgrupo8;

import Clases.ClsJdbc;

/**
 *
 * @author lenovo
 */
public class EleccionesGrupo8 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        ClsJdbc jdbc = new ClsJdbc();
        jdbc.CrearConexion();
    }
}
