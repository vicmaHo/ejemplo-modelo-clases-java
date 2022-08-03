package co.com.victorhernandez.apuntesjava.modelo;

public class Casilla { // public significa que x clase puede ser usada, manipulada, llamada desde cualquier lugar a cualquier momento
    // Atributos
    public Integer fila;
    public Character columna;

    // la ficha ocupa una casilla por tanto añado el atributo ficha
    public Ficha ocupadaPor;

    // la casilla tiene un color por tanto la relaciono con el color
    public Color Color;

    // Constructores

    // Metodos --> comportamientos, lo que puede hacer la clase
    public Boolean estaOcupada() {
        // TODO: Falta implementar si esta ocupada la casilla
        // un todo es un comentario especial para recordar que se tieen que realizar algo
        return false;
    }
}
