package com.company;

public class Finding {

   public int find(int k, int n, int[][] matrixA) {
       int[] mas = new int[n*k];
       int[] mas2 = new int[n*k];
       int l=0;
       for(int i=0; i<k; i++) {
           for(int j=0; j<n; j++) {
               mas[l]=matrixA[i][j];
               l++;
           }
       }

        boolean flag = true;

       for(int i=0; i<n*k; i++) {

           for(int j=1; j<n*k; j++) {
               flag = true;
               if((mas[i]==mas[j]) && (i!=j)) {
                   flag = false;
                   mas2[i] = 0;
                   break;  }
                        else mas2[i]=mas[i];

           }
       }



       int min=100;
       for(int i=0; i<n*k; i++) {
           if((mas2[i]<min) && (mas2[i]!=0))
               min=mas2[i];
       }

       return min;
   }
}
