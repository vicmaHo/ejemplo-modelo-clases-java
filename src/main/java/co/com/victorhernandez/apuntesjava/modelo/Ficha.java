package co.com.victorhernandez.apuntesjava.modelo;

public abstract class Ficha  { // defino una clase para indicar que todas las fichas comen y se mueven
    

    // como la ficha es parte de la casilla, creo un atributo casilla
    public Casilla encuentraEn; // la ficha se encuentra en una casilla

    // la ficha cuenta con un color, por tanto tambien debe ir relacionada con color
    public Color Color;


    // Metodos
    public void comer(){ // puedo definir como comen las fichas
        // TODO: Implementar como come la ficha
    }


    public abstract void mover(); // en ficha no puedo definir como se mueven todas las fichas 
        // no podre definirlo, esto sera abstracto por tanto no puedo implementar un codigo
        // para decir como se mueven
        // lo que dira como se mueven seran las subclases
}
