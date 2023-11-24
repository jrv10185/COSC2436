import java.util.ArrayList;
import java.util.Comparator;

public class Heap<T> {
    private final ArrayList<T> elements;
    private final Comparator<? super T> comparator;

    public Heap(Comparator<? super T> comparator) {
        this.elements = new ArrayList<>();
        this.comparator = comparator;
    }

    public void add(T element) {
        elements.add(element);
        int index = elements.size() - 1;
        while (index > 0) {
            int parentIndex = (index - 1) / 2;
            if (comparator.compare(elements.get(index), elements.get(parentIndex)) > 0) {
                swap(index, parentIndex);
                index = parentIndex;
            } else {
                break;
            }
        }
    }

    public T remove() {
        if (elements.isEmpty()) {
            return null;
        }

        T removedElement = elements.get(0);
        elements.set(0, elements.remove(elements.size() - 1));
        int index = 0;
        while (true) {
            int leftChildIndex = 2 * index + 1;
            int rightChildIndex = 2 * index + 2;

            if (leftChildIndex >= elements.size()) {
                break;
            }

            int maxIndex = leftChildIndex;
            if (rightChildIndex < elements.size() &&
                comparator.compare(elements.get(rightChildIndex), elements.get(leftChildIndex)) > 0) {
                maxIndex = rightChildIndex;
            }

            if (comparator.compare(elements.get(maxIndex), elements.get(index)) > 0) {
                swap(index, maxIndex);
                index = maxIndex;
            } else {
                break;
            }
        }

        return removedElement;
    }

    private void swap(int i, int j) {
        T temp = elements.get(i);
        elements.set(i, elements.get(j));
        elements.set(j, temp);
    }

    public static class HeapDemo {
        public static void main(String[] args) {
            Comparator<Integer> integerComparator = new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o1 - o2;
                }
            };

            Heap<Integer> heap = new Heap<>(integerComparator);

            for (int i = 0; i < 20; i++) {
                int randomNumber = (int) (Math.random() * 100);
                heap.add(randomNumber);
                System.out.print(randomNumber + " ");
            }
            System.out.println();

            while (!heap.elements.isEmpty()) {
                System.out.print(heap.remove() + " ");
            }
        }
    }
}
