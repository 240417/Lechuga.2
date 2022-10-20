/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.carlota.enumerador;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author Jesus
 */

public enum Dificultad {
    //Serealizamos las dificultades para pasarlo al archivo JSON e imprimirlo
    @SerializedName("1")
    FACIL,
    @SerializedName("2")
    INTERMADIO,
    @SerializedName("3")
    DESAFIENTE
}


