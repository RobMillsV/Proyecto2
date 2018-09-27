package proyectofinal2;


public class PilaOperacion<Double> extends NodoPilaOperacion {
    private NodoPilaOperacion cima;
    private double resultado;
    private int size;

    public PilaOperacion() {
        cima = null;
        size = 0;
    }

    public NodoPilaOperacion getCima() {
        return cima;
    }

    public void setCima(NodoPilaOperacion cima) {
        this.cima = cima;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
 

    public boolean isEmpty() {
        return cima == null;
    }

    

    public void push(double operador) {
        NodoPilaOperacion nodo = new NodoPilaOperacion();
        
        nodo.setData(operador); 
        
        if (isEmpty()) {
            cima = nodo;
            nodo.setNext(null);
            
        } else {
            nodo.setNext(cima);
            
            cima = nodo;
        }
        size++;
    }

    public double pop() {
            if (cima != null) {
                double info = cima.getData();
                cima = cima.getNext();
                size--;
                return info;
            }
        return 0;

    }
    
    @Override
    public String toString() {
        return "[" + cima + " , " + cima.getNext() + "]";
    }

}
