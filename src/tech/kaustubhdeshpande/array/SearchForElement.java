package tech.kaustubhdeshpande.array;

public class SearchForElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,};
        int num = 4;
        String result = (searchForElement(arr, num)) ? "The number is present in array": "The number is not present in array";
        System.out.println(result);
    }

    static boolean searchForElement(int[] arr, int num) {
        boolean elementPresent = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }
}
