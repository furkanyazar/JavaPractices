import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) throws Exception {
        List<Integer> numberList = new ArrayList<>();

        List<Integer> numberList1 = new ArrayList<>(2500);
        List<Integer> numberList2 = new ArrayList<>(2500);
        List<Integer> numberList3 = new ArrayList<>(2500);
        List<Integer> numberList4 = new ArrayList<>(2500);

        for (int i = 1; i <= 10000; i++)
            numberList.add(i);

        numberList1.addAll(numberList.subList(0, 2500));
        numberList2.addAll(numberList.subList(2500, 5000));
        numberList3.addAll(numberList.subList(5000, 7500));
        numberList4.addAll(numberList.subList(7500, 10000));

        OddNumbers o1 = new OddNumbers(numberList1);
        Thread t1 = new Thread(o1);
        t1.start();

        EvenNumbers e1 = new EvenNumbers(numberList1);
        Thread t2 = new Thread(e1);
        t2.start();
    }

}
