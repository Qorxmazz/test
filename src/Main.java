import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        int test = test();
        System.out.println(test);
    }

    public static int test() {
        Integer[] arr = {10, 7, 8, 1, 8, 7, 6};


        HashSet<Integer> mySet = new HashSet<>();
        int duplicatElement = 0;
        for (int element : arr) {

            if (!mySet.add(element)) {
                duplicatElement = element;
                break;
            }
        }
        return duplicatElement;
    }
}