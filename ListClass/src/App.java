public class App {
    public static void main(String[] args) throws Exception {
        MyList<Integer> myList = new MyList<>();
        System.out.println("List status: " + (myList.isEmpty() ? "Null" : "Not null"));

        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.add(2);
        myList.add(4);
        myList.add(6);
        myList.add(8);
        myList.add(0);

        System.out.println("List status: " + (myList.isEmpty() ? "Null" : "Not null"));

        System.out.println("Index: " + myList.indexOf(5));

        System.out.println("Index: " + myList.indexOf(10));

        System.out.println("Index: " + myList.indexOf(6));

        Object[] myArray = myList.toArray();
        System.out.println("Element in index 5: " + myArray[5]);

        MyList<Integer> mySubList = myList.sublist(0, 3);
        System.out.println("Sublist: " + mySubList.toString());

        System.out.println("Is 5 in the list: " + myList.contains(5));
        System.out.println("Is 10 in the list: " + myList.contains(10));

        myList.clear();
        System.out.println(myList.get(0));
    }
}
