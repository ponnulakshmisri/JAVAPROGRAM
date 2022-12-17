package searchandsort;

import java.util.*;
public class binarysearch {
    public static void main(String args[]) {
        Scanner sv = new Scanner(System.in);
        int n = sv.nextInt();
        int a[] = new int[n];
        int low = 0, high = n;
        for (int i = 0; i < n; i++) {
            a[i] = sv.nextInt();
        }
        int k = sv.nextInt();
        //iterationmethod(a,low,high,k);
        Arrays.sort(a);
        int res = recursionmethod(a, low, high, k);
        if (res == -1) {
            System.out.println("Not present");
        } else {
            System.out.println("index " + res);
        }
    }

    public static void iterationmethod(int arr[], int first, int last, int key) {

        int mid = (first + last) / 2;
        while (first <= last) {
            if (arr[mid] < key) {
                first = mid + 1;
            } else if (arr[mid] == key) {
                System.out.println("Element is found at index: " + mid);
                break;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        if (first > last) {
            System.out.println("Element is not found!");
        }
    }

    public static int recursionmethod(int arr[], int first, int last, int key) {
        if (last >= first) {
            int mid = (first + last) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] > key) {
                return recursionmethod(arr, first, mid - 1, key);//search in left subarray
            } else {
                return recursionmethod(arr, mid + 1, last, key);//search in right subarray
            }
        }
        return -1;

    }
}
