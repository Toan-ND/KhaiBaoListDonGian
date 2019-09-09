import java.util.Arrays;

public class MyList<E>  {
    private int size = 0;
    private final int DEAFAULT_CAPACITY = 10;
    private Object Element[];

    public MyList() {
        Element = new Object[DEAFAULT_CAPACITY];
    }

    public void ensureCapa() {
        int newSize = this.Element.length * 2;
        this.Element = Arrays.copyOf(Element, newSize);
    }

    public void add(E e) {
        if (size == Element.length) {
            ensureCapa();
        }
        Element[this.size] = e;
        this.size++;
    }
    public E get(int i){
        if (i >= this.size || i<0){
            throw new IndexOutOfBoundsException("Index: "+ i+ ", Size"+ i);
        }
        return (E) this.Element[i];
    }


}
