public class Main {
    public static void main(String[] args) {
        int indexMin = -3;
        int indexMax = 1;
        RangeArray squares = new RangeArray(indexMin, indexMax);
        for (int index = squares.getIndexMin(); index <= squares.getIndexMax(); index++)
            squares.set(index, index * index);
        for (int index = squares.getIndexMin(); index <= squares.getIndexMax(); index++)
            System.out.println(index + " -> " + squares.get(index));
        System.out.println(squares.rangeSize());

    }

}
