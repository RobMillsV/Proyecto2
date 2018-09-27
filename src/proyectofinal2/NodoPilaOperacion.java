package proyectofinal2;

public class NodoPilaOperacion {

    private double data;
    private NodoPilaOperacion next = null;
;
    
    public double getData() {
        return data;
    }

    public void setData(double data) {
        this.data = data;
    }

    public NodoPilaOperacion getNext() {
        return next;
    }

    public void setNext(NodoPilaOperacion next) {
        this.next = next;
    }

  


    @Override
    public String toString() {
//        return cima;
        return Double.toString(data);
    }

}
