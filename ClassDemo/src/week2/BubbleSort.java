package week2;

/**
 * @author chenlin
 * @create 2020-10-17  10:42
 */
public class BubbleSort {
    public void bubbleSort(int[] arr, int n) {
        if (n <= 1) {
            return;
        }
        for (int i = 0; i < n; ++i) {
            boolean flag = false;
            for (int j = 0; j < n - i - 1; ++j) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {3, 4, 7, 11,6, 8, 6, 9,10};
        System.out.println("排序前：");
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println( );
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(arr, arr.length);
        System.out.println("排序后：");
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

}
