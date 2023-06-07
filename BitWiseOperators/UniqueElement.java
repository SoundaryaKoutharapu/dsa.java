// Find the duplicate number - using bitwise operator
// use XOR - If any number XOR with itself result in 0
// So, the remaining number will be not duplicate number

public class UniqueElement {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 9, 1, 5, 3, 9 };
        System.out.println(notDuplicate(arr));

    }

    static int notDuplicate(int[] arr) {
        int unique = 0;
        for (int i = 0; i < arr.length; i++) {
            unique ^= arr[i];
        }
        return unique;
    }

}
