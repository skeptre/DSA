package linearsearch;

public class LinearSearch {

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }





    public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,20,30,40,50};
    int target = 560;
    int index = linearSearch(numbers, target);
    if( index != -1) {
        System.out.println(target + " was found at index: " + index);
    }
    else  {
        System.out.println(target + " was not found");
    }
    }
}
