package basicprogram;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class buffer {
    public static void main (String[] args)throws Exception {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int T=Integer.parseInt(br.readLine());
        while(T-->0){
            int n=Integer.parseInt(br.readLine());
            int m=Integer.parseInt(br.readLine());
            int[][] arr=new int[n][m];
            String[] strNums;
            strNums = br.readLine().split(" ");
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    arr[i][j]=Integer.parseInt(br.readLine());
                }
            }

            int[][] arr1=new int[n][m];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(arr[i][j]==1){
                        for(int k=0;k<m;k++){
                            arr1[i][k]=1;
                        }
                        break;
                    }
                }

            }
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    System.out.print(arr1[i][j]+" ");
                }
                System.out.println();
            }



        }
        // Your code here
    }
    }


        // Your code here


