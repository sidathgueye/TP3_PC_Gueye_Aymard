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

        RangeArray<String> habitations = new RangeArray<String>(3, 5);
        habitations.set(3, "Maison");
        habitations.set(4, "Immeuble");
        habitations.set(5, "Hutte");
        for (int index = habitations.getIndexMin(); index <= habitations.getIndexMax(); index++)
            System.out.print(habitations.get(index).length() + " ");

        // RangeArray<String> habitations = new RangeArray<String>(3, 5);
        habitations.set(3, "Maison");
        habitations.set(4, "Immeuble");
        habitations.set(5, "Hutte");
        for (String habitation : habitations)
            System.out.print(habitation + " ");


        String[][] elements = {{"A", "C", "E", "G"},
                {"B", "D", "F", "H"}};
        Grid<String> grid = new Grid<String>(elements);

        /*for (int line = 0; line < grid.nbLines(); line++)
          for (int column = 0; column < grid.nbColumns(); column++) {
            String element = grid.get(line, column);
            System.out.print(element+" ");
          }
        System.out.println();
        */

        for (String element : grid) System.out.print(element + " ");
        System.out.println();


    }

}
