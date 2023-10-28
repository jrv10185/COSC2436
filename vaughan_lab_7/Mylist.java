import java.util.ArrayList;

public class Mylist<T extends Number> {
    ArrayList<T> list = new ArrayList<>();

    public void add(T firstArg){
        list.add(firstArg);
    }

    public T largest() {
        T largestValue = list.get(0);
        for (T item : list){
            if (item.doubleValue() > largestValue.doubleValue()){
                largestValue = item;
            }
        }
        return largestValue;
    }
    public T smallest() {
        T smallestValue = list.get(0);
        for (T item : list){
            if (item.doubleValue() < smallestValue.doubleValue()){
                smallestValue = item;
            }
        }
        return smallestValue;
    }
}