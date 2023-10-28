public class MyListTest {
    public static void main(String[] args) {
        Integer array1 = 1;
        Integer array2 = 2;
        Integer array3 = 3;
        Integer array4 = 4;
        Integer array5 = 5;

        Double array6 = 1.1;
        Double array7 = 1.2;
        Double array8 = 1.3;
        Double array9 = 1.4;
        Double array10 = 1.5;

        Mylist<Integer> firstList = new Mylist<>();

        firstList.add(array1);
        firstList.add(array2);
        firstList.add(array3);
        firstList.add(array4);
        firstList.add(array5);

        Mylist<Double> secondList = new Mylist<>();

        secondList.add(array6);
        secondList.add(array7);
        secondList.add(array8);
        secondList.add(array9);
        secondList.add(array10);

        System.out.println("The highest number of the First array is: "+firstList.largest());
        System.out.println("The smallest number of the First array is: "+firstList.smallest());

        System.out.println("The highest number of the Second array is: "+secondList.largest());
        System.out.println("The smallest number of the Second array is: "+secondList.smallest());
    }
}
