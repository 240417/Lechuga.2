/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.carlota.ui;

import java.util.ArrayList;
import java.util.List;
import mx.itson.carlota.entidades.Ingrediente;
import mx.itson.carlota.entidades.Paso;
import mx.itson.carlota.entidades.Receta;
import mx.itson.carlota.entidades.Usuario;
import mx.itson.carlota.enumerador.Dificultad;

/**
 *
 * @author Jesus
 */
public class Main {
    public static void main(String[] args) {
        
        Receta receta = new Receta();
        receta.setNombre("Carlota de limón");
        receta.setDescripcion("¿Tienes una reunión en casa? Sorprende a tus invitados con una rica CARLOTA de LIMÓN preparada con el toque de LA LECHERA® y CARNATION® CLAVEL®.");
        receta.setNumeroPorciones(8);
        receta.setTiempo(172);
        
        List<Ingrediente> ingrediente = new ArrayList<>();
        
        Ingrediente ingrediente1 = new Ingrediente();
        ingrediente1.setContenido("1 Lata de Leche Condensada LA LECHERA");
        ingrediente.add(ingrediente1);
        
        Ingrediente ingrediente2 = new Ingrediente();
        ingrediente2.setContenido("1 Lata de Leche Evaporada CARNATION CLAVEL");
        ingrediente.add(ingrediente2);
        
        Ingrediente ingrediente3 = new Ingrediente();
        ingrediente3.setContenido("1/4 Taza de Jugo de limón colado");
        ingrediente.add(ingrediente3);
        
        Ingrediente ingrediente4 = new Ingrediente();
        ingrediente4.setContenido("30 Galletas Marías");
        ingrediente.add(ingrediente4);
        
        Ingrediente ingrediente5 = new Ingrediente();
        ingrediente5.setContenido("1 Limón cortado en rodajas");
        ingrediente.add(ingrediente5);
        
        Ingrediente ingrediente6 = new Ingrediente();
        ingrediente6.setContenido("5 Galletas Marías troceadas");
        ingrediente.add(ingrediente6);
        
        Ingrediente ingrediente7 = new Ingrediente();
        ingrediente7.setContenido("1 Rama de Menta desinfectada");
        ingrediente.add(ingrediente7);
        
        Ingrediente ingrediente8 = new Ingrediente();
        ingrediente8.setContenido("1 Limón (su ralladura)");
        ingrediente.add(ingrediente8);
        
        receta.setIngredientes(ingrediente);
        
        List<Paso> pasos = new ArrayList<>();
        
        Paso paso1= new Paso();
        paso1.setContenido("1.  Licúa la Leche Condensada LA LECHERA® con la Leche Evaporada CARNATION® CLAVEL® y sin dejar de licuar, agrega poco a poco el jugo de limón.");
        pasos.add(paso1);
        
         Paso paso2= new Paso();
        paso2.setContenido("2.  En un refractario cuadrado, coloca una capa de galletas, un poco de la mezcla de limón y repite hasta terminar con el resto de los ingredientes. Cubre con plástico adherente y refrigera por 1 hora o hasta que esté firme.");
        pasos.add(paso2);
        
         Paso paso3= new Paso();
        paso3.setContenido("3.  Decora con las rodajas de limón, las galletas troceadas, las hojas de menta y la ralladura de limón. Ofrece.");
        pasos.add(paso3);
        
        receta.setPasos(pasos);
        receta.setDificultad(Dificultad.FACIL);
        
        Usuario usuario = new Usuario();
        usuario.setNombre(":)");
        usuario.setCorreoElrctronico("alejandra.");
        usuario.setContraseña("");
        
        receta.setUsuario(usuario);
        
        System.out.println("***RECETA NESTLÉ***");
        System.out.println("Subido por: "+receta.getUsuario());
        System.out.println(receta.getNombre());
        System.out.println(receta.getDescripcion());
        System.out.println("Porciones:"+receta.getNumeroPorciones()+"  ");
        System.out.println("Tiempo:"+receta.getTiempo()+"   ");
        System.out.println("Dificultad"+receta.getDificultad());
        
        System.out.println("Ingredientes");
        for(Ingrediente i : receta.getIngredientes()){
            System.out.println("-"+i.getContenido());
        }
        
        System.out.println("Pasos:");
        for(Paso p: receta.getPasos()){
        System.out.println(p.getContenido());
        }
        
    }
            
}
