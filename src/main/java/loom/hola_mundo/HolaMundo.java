package loom.hola_mundo;

/*
 * Clase que saluda.
 * Saluda a la persona indicada o genéricamente si no se indica.
 */

public class HolaMundo {

	/**
	 * @param persona: recibe el nombre de la persona a saludar
	 * @return String con saludo.
	 */
    public String saludar(final String persona) {
    	return persona != "" ? "¡Hola, " + persona + "!" : "¡Hola!";
    }
}
