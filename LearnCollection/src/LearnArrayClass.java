import java.util.Arrays;

public class LearnArrayClass {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        int index = Arrays.binarySearch(array,5);//it will work only when arrays is already sorted
        System.out.println(index);
        Integer[] array2 = {257,235,24,325,6,46,346,36};
        Arrays.sort(array2);
        for (int i : array2) {
            System.out.println(" "+i);
        }
        Arrays.fill(array2,0);
        for (int i:array2) {
            System.out.println(" "+i);
        }


    }
}
