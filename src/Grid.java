import java.util.Iterator;

public class Grid<T> implements Iterable<T> {
    private T[][] elements;

    public Grid(T[][] elements) {
        this.elements = elements;
    }

    public T get(int line, int column) {
        return elements[line][column];
    }

    public int nbLines() {
        return elements.length;
    }

    public int nbColumns() {
        return elements[0].length;
    }

    public Iterator<T> iterator() {
        return new GridIterator(this);
    }


    private class GridIterator implements Iterator<T> {
        private int nextLine;
        private int nextColumn;
        private Grid<T> grid;

        public GridIterator(Grid<T> grid) {
            nextLine = 0;
            nextColumn = 0;
            this.grid = grid;
        }

        @Override
        public boolean hasNext() {
            return nextLine < grid.nbLines() && nextColumn < grid.nbColumns();
        }

        @Override
        public T next() {
            T value = grid.get(nextLine, nextColumn);

            if (nextColumn == grid.nbColumns() - 1) {
                nextColumn = 0;
                nextLine += 1;
            } else {
                nextColumn += 1;
            }

            return value;
        }

    }
}
