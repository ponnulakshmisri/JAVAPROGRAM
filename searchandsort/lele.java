package searchandsort;

public class lele {


        public static void insertionSort(int[] arr){

// int[] arr or int arr[]; both are correct. int[] arr is logically correct.

            int len = arr.length;

            for(int i = 1; i< len;i++){

// when i =1 we are at step 2, size of array is 2;

                int key = arr[i];

                int j = i-1; // second iterator

//j will traverse the array backward to find the place to insert key element.

                while(j>=0 && arr[j] < key){

                    arr[j+1] = arr[j]; // moving the element which are greater than key;

                    j--;

                }

                arr[j+1] = key;

            }

        }

        public static void main(String[] args){

            int arr[] = {9,6,7,5,2};

            int len = arr.length;

            insertionSort(arr); // Arrays are passed by reference

            for(int i = 0;i < len;i++){

                System.out.print(arr[i]+" ");

            }

            System.out.println();

        }

    }

