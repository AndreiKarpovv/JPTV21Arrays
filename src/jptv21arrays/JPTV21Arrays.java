/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv21arrays;
import java.util.Random;

/**
 *
 * @author pupil
 */
public class JPTV21Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        int n = 3;
        int sum = 0; 
        int min = 10;
        int max = 0;
        int sumDown = 0;
        int sumUp = 0;
        System.out.println("---- Одномернеые массивы ----");
        int[] nums = new int [10];
        for(int i = 0; i < nums.length; i++){
            nums[i] = random.nextInt(10);
        }
        for(int i = 0; i < nums.length; i++){
            System.out.printf("%2d", nums[i]);
           sum += nums[i];
           if(min > nums[i]) min = nums[i];
            if(max < nums[i]) max = nums[i];
            
        }    
        System.out.println();
        System.out.println("sum = " +sum);
        System.out.println("min = " +min);
        System.out.println("max = " +max);        
        System.out.println("---- Многомернеые массивы ----");
        int[][] nums2 = new int[n][n];
        for(int i = 0; i < nums2.length; i++){
            for(int j = 0; j < nums2[i].length; j++){
              nums2[i][j] = random.nextInt(10);
            }
        }
        int sumrows = 0;
        int sumcol = 0;
        sum = 0;
        max = 0;
        min = 10;
        sumUp = 0;
        sumDown = 0;
        for(int i = 0; i < nums2.length; i++){
            for(int j = 0; j < nums2[i].length; j++){
                System.out.printf("%4d", nums2[i][j]);
                sum += nums2[i][j];
                if(min > nums2[i][j]) min = nums2[i][j];
                if(max < nums2[i][j]) max = nums2[i][j];
                if(i == j) sumDown += nums2[i][j];
                if((i+1)==(n-j)) sumUp += nums2[i][j];
                sumrows +=nums2[i][j];
//                sumDown = nums2[i-i][j-j]+nums2[i-i+1][j-j+1]+nums2[i-i+2][j-j+2];
            }
            System.out.printf("%8d", sumrows);
            sumrows = 0;
            System.out.println();
        }
                
        System.out.println();
        System.out.println("sum = " +sum);
        System.out.println("min = " +min);
        System.out.println("max = " +max); 
        System.out.println("Сумма по нисходящей диагонали = "+sumDown);
        System.out.println("Сумма по исходящей диагонали = "+sumUp);
    }
    
  }

    

