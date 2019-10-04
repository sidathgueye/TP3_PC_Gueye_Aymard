
public class RangeArray {
    int indexMin;
    int indexMax;
    int elements[];

    public RangeArray(int indexMin, int indexMax) {
        if (indexMax < indexMin) throw new RuntimeException ("indexMax < indexMin");
        this.indexMin = indexMin;
        this.indexMax = indexMax;
        elements= new int[rangeSize()];
    }

    public int getIndexMin() { return indexMin; }
    public int getIndexMax() { return indexMax; }
    public int rangeSize(){ return indexMax - indexMin + 1; }
    public int realIndex (int index) { return index - indexMin; }

    public void checkIndex (int index) {
        if (index < indexMin) throw new RuntimeException ("index < indexMin");
        if (index > indexMax) throw new RuntimeException ("index > indexMax");
    }


    public void set(int index, int value) {
        checkIndex (index);
        int realIndex= realIndex (index);
        elements[realIndex]= value;
    }

    public int get (int index) {
        checkIndex (index);
        int realIndex= realIndex (index);
        return elements[realIndex];
    }
}
