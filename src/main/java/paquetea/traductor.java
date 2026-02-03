package paquetea;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class traductor {
    

    private Map <String,String> diccionario;

    

    // Constructor: traductor vacio.
    public traductor (){
        diccionario = new TreeMap<>();
    }

    // Añadir una entrada.
    public void guardarEntrada(String palabraExtranjera, String palabraEspañola){
        diccionario.put(palabraExtranjera, palabraEspañola);
    }

    // Borrar entrada.
    public void borrarEntrada(String palabraExtranjera){
        diccionario.remove(palabraExtranjera);
    }

    // Modificar una clase que ya existe
    public void modificarUnaClaseExistente (String palabraExtranjera, String nuevaTraduccion){
        if (diccionario.containsKey(nuevaTraduccion)) {
            diccionario.put(palabraExtranjera, nuevaTraduccion);
        }
    }

    // Traducir una palabra
    public String traducir (String palabraExtranjera){
        return diccionario.get(palabraExtranjera);
    }

    // Lista de palabras extranjeras
    public ArrayList<String> palabrasExtranjeras(){
        return new ArrayList<>(diccionario.keySet());
    }

    // Lista de palabras españolas
    public ArrayList<String> palabrasEspañolas(){
        return new ArrayList<>(diccionario.values());
    }


    
}
