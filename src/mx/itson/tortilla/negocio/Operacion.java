/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.tortilla.negocio;

/**
 * contiene metodos para trabajar con cadenas de texto.
 * @author angel
 */
public class Operacion {
    
    /**
     * separa una cadena de texto en donde encuentre el caracter guion medio.
     * @param oracion es la oracion que sera separada en fracciones.
     * @return Array de String en cuyo cada componente sera un fraccion de la cadena otorgada.
     */
  
    public String[] separar(String oracion){
        //hola a todos jajaja
        String[] resultado = oracion.split("-");
        return resultado;
    }
            
}
