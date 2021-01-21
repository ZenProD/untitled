import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello 1");
        System.out.println("hello 2");
        int[] nums = new int[] {1,-7,9,5,6,1,4};
        Arrays.sort(nums);

        for(int i = 0 ; i < nums.length ; i ++) {
            System.out.println(nums[i]);
        }

        demoException();

    }
    public static void demoException() {
        try {
            int k = 9;
            //k /= 0;

        } catch (Exception e) {
            System.out.println("error");

        } finally {
            System.out.println("finally");
        }
    }
}
