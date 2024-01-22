package hw5;

import java.util.Scanner;

public class hw5_1 {	

//	當使用者鍵盤輸入寬與高時,即會印出對應的*長方形,如
//	圖:
	
//	1.從題目找功能 (圈出中文->列出Java function):
//	2.宣告變數:
//	3.程式運算
//	4.system out出來
	
		

 public static void main(String[] args) {	

  int[] widthandheight = new int[2];			//宣告一個整數陣列 int 儲存寬度和高度  int[2]是指兩個widthandheight的索引值
  
  Scanner SC = new Scanner(System.in);          //用scanner 的類別 建立一個叫SC的物件來接收使用者的輸入
  
  System.out.println("請輸入圖形的長: ");      		//從使用者的輸入中讀取寬和高的數值。
  widthandheight[0] = SC.nextInt();    			// widthandheight[0]用於存儲長方形的長度,是將 nextInt() 方法讀取的整數值指派給 widthandheight 整數陣列的第一個位置（索引為 0），這個位置代表了長方形的長度。

  System.out.println("請輸入圖形的寬: ");
  widthandheight[1] = SC.nextInt();		        //widthandheight[1]用於存儲長方形的高度,是將 nextInt()方法讀取的整數值指派給 widthandheight 整數陣列的第一個位置（索引為 0），這個位置代表了長方形的寬度。

  
  													
  for (int i = 0; i < widthandheight[0]; i++) {    //使用for迴圈來建立長方形圖案 外層迴圈長度 內層迴圈寬度
   System.out.print(i + 1 + ". |");
   for (int j = 0; j < widthandheight[1]; j++) {
    System.out.print("*");
   }
   System.out.println();
  }
 }

}

public class hw5_3 {
	
//利用Overloading,設計兩個方法int maxElement(int x[][])與double maxElement(double x[][]),
//	可以找出二維陣列的最大值並回傳,如圖:

	// 1.從題目找功能 (圈出中文->列出Java function) : int maxElement(int x[][])、法
	// 2.宣告變數 : int count ;
	// 3.程式運算 : 使用for迴圈
	// 4.system out出來


	    // 找出整數型別二維陣列的最大值
	    public static int maxElement(int x[][]) {
	        int max = Integer.MIN_VALUE;

	        for (int[] row : x) {
	            for (int element : row) {
	                if (element > max) {
	                    max = element;
	                }
	            }
	        }

	        return max;
	    }

	    // 找出浮點數型別二維陣列的最大值
	    public static double maxElement(double x[][]) {
	        double max = Double.MIN_VALUE;

	        for (double[] row : x) {
	            for (double element : row) {
	                if (element > max) {
	                    max = element;
	                }
	            }
	        }

	        return max;
	    }

	    public static void main(String[] args) {
	        int[][] intArray = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };

	        double[][] doubleArray = {
	            {1.5, 2.5, 3.5},
	            {4.5, 5.5, 6.5},
	            {7.5, 8.5, 9.5}
	        };

	        // 找出整數型別二維陣列的最大值並輸出
	        int maxInt = maxElement(intArray);
	        System.out.println("整數型別陣列的最大值為: " + maxInt);

	        // 找出浮點數型別二維陣列的最大值並輸出
	        double maxDouble = maxElement(doubleArray);
	        System.out.println("浮點數型別陣列的最大值為: " + maxDouble);
	    }
	}
