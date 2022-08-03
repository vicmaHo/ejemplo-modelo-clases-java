package co.com.victorhernandez.apuntesjava.modelo;

public class Peon extends Ficha { // el peon es una ficha, ficha tiene lo general peon tiene lo epecifico
    
    @Override // override es como sobreescribri los metodos anteriores, de ficha
    public void comer() {
        // TODO Auto-generated method stub
        super.comer();
    }

    @Override
    public void mover() {
        // TODO: implementar movimiento del peon
    }

    public void comerAlPaso(){
        // TODO: Implementar comer al paso
    }

    public void coronar() {
        // TODO: Implementar coronar
    }
}
