import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        String[] arr1 = new String[] { "a", "b", "c" };
        String[] arr2 = new String[] { "c", "d", "e", "a", "a" };
        List<String> values = new ArrayList<String>();

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i].equals(arr2[j]) && !values.contains(arr1[i])) {
                    values.add(arr1[i]);
                }
            }
        }
        System.out.println(values);
    }
}
