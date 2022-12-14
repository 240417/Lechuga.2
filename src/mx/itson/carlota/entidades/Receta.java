/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.carlota.entidades;

import com.google.gson.Gson;
import java.util.List;
import mx.itson.carlota.enumerador.Dificultad;

/**
 *
 * @author Jesus
 */
public class Receta {
      private String nombre;
    private String descripcion;
    private int numeroPorciones;
    private int tiempo;
    private Usuario usuario;
    private List<Ingrediente> ingredientes;
    private List<Paso> pasos;
    private Dificultad dificultad;
    
    /**
     * Al seleccionar el fichero en la otra pagina
     * @return the receta
     * 
     */
    public Receta deserializar (String json){
        Receta receta = new Receta();
        try{
            receta= new Gson().fromJson(json, receta.getClass());
            
        }catch(Exception e){
            System.err.print("Ocurrio un error: "+e.getMessage());
        }
        return receta;
    }
    
    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the numeroPorciones
     */
    public int getNumeroPorciones() {
        return numeroPorciones;
    }

    /**
     * @param numeroPorciones the numeroPorciones to set
     */
    public void setNumeroPorciones(int numeroPorciones) {
        this.numeroPorciones = numeroPorciones;
    }

    /**
     * @return the tiempo
     */
    public int getTiempo() {
        return tiempo;
    }

    /**
     * @param tiempo the tiempo to set
     */
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    /**
     * @return the ingredientes
     */
    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    /**
     * @param ingredientes the ingredientes to set
     */
    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    /**
     * @return the pasos
     */
    public List<Paso> getPasos() {
        return pasos;
    }

    /**
     * @param pasos the pasos to set
     */
    public void setPasos(List<Paso> pasos) {
        this.pasos = pasos;
    }

    /**
     * @return the dificultad
     */
    public Dificultad getDificultad() {
        return dificultad;
    }

    /**
     * @param dificultad the dificultad to set
     */
    public void setDificultad(Dificultad dificultad) {
        this.dificultad = dificultad;
    }

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the titulo to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
