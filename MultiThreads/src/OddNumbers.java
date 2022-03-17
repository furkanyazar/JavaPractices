import java.util.ArrayList;
import java.util.List;

public class OddNumbers extends Thread {

    public List<Integer> tempList;

    List<Integer> oddList = new ArrayList<>();

    public OddNumbers(List<Integer> tempList) {
        this.tempList = tempList;
    }

    @Override
    public void run() {
        for (int i = 0; i < tempList.size(); i++)
            if (tempList.get(i) % 2 == 1)
                oddList.add(tempList.get(i));

        print();
    }

    public void print() {
        System.out.println(oddList.toString());
    }

}
