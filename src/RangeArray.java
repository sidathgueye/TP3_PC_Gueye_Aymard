import java.util.Iterator;

public class RangeArray<T> implements Iterable<T>{
    int indexMin;
    int indexMax;
    Object elements[];

    public RangeArray(int indexMin, int indexMax) {
        if (indexMax < indexMin) throw new RuntimeException ("indexMax < indexMin");
        this.indexMin = indexMin;
        this.indexMax = indexMax;
        elements= new Object[rangeSize()];
    }

    public int getIndexMin() { return indexMin; }
    public int getIndexMax() { return indexMax; }
    public int rangeSize(){ return indexMax - indexMin + 1; }
    public int realIndex (int index) { return index - indexMin; }

    public void checkIndex (int index) {
        if (index < indexMin) throw new RuntimeException ("index < indexMin");
        if (index > indexMax) throw new RuntimeException ("index > indexMax");
    }


    public void set(int index, T value) {
        checkIndex (index);
        int realIndex= realIndex (index);
        elements[realIndex]= value;
    }


    public T get (int index) {
        checkIndex (index);
        int realIndex= realIndex (index);
        return (T) elements[realIndex];
    }

    public Iterator<T> iterator (){
        return new RangeArrayIterator();
    }


    private class RangeArrayIterator implements Iterator<T> {
       private int nextIndex;
        //private RangeArray<T> rangeArray;

        public RangeArrayIterator() {
          //  this.rangeArray = rangeArray;
            nextIndex = getIndexMin();
        }

        @Override
        public boolean hasNext() {
            return nextIndex <= getIndexMax();
        }
        @Override
        public T next(){
            T result = get(nextIndex);
            nextIndex++;
            return result;
        }
    }
}
