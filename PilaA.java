package EstructurasDeDatos;

public class PilaA <T> implements PilaADT<T>{
    private T[] pila;
    private int tope;
    private final int MAXIMO = 20;

    public PilaA() {
        pila = (T[]) new Object[MAXIMO];
        tope = -1;

    }

    @Override
    public void push(T dato) {
        if (tope == pila.length - 1) {
            expande();
        }
        else {
            tope++;
            pila[tope] = dato;
        }
    }

    private void expande() {
        T[] nuevo = (T[]) new Object[pila.length * 2];

        for(int i =0; i<=tope; i++)
            nuevo[i] = pila[i];
        pila = nuevo;
    }

    @Override
    public T pop() {
        if (this.isEmpty())
            throw new ColeccionVaciaExcepcion("Pila Vacia");

        T resultado = pila[tope];
        pila[tope] = null;
        tope--;


        return resultado;
    }
    

    @Override
    public boolean isEmpty() {
        return tope == -1;
    }

    @Override
    public T peek() {
        if(this.isEmpty())
            throw new ColeccionVaciaExcepcion("Pila vacia"); // el throw me saca del metodo

        return pila[tope];
    }

    public String toString() {
        StringBuilder bobthebuilder = new StringBuilder();

        for (int i = tope; i >=0; i--)
            bobthebuilder.append(pila[i]).append("\n");

        return bobthebuilder.toString();
    }
}
