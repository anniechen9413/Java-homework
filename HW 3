import java.util.Scanner;

public class HW3_1 {

	public static void main(String[] args) {
//請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰三角形、其它三角形或不是三角形,如圖示結果:
//(提示:Scanner,三角形成立條件,判斷式if else)(進階功能:加入直角三角形的判斷)
		
//三角形判斷->if elese
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("請輸入三個整數");     //
		int a = sc.nextInt();                 //設定一個整數資料型態為int 
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a <= 0 || b <= 0 || c <= 0) {    //a<=0  ||或
			System.out.println("不是三角形");
		} else if (a + b <= c) {
			System.out.println("不是三角形");
		} else if (a == b && a == c) {
			System.out.println("正三角形");
		} else if (a == b || a == c || b == c) {
			System.out.println("等腰三角形");
		} else if (a * a + b * b == c * c) {
			System.out.println("直角三角形");
		} else {
			System.out.println("其他三角形");
		}
		System.out.println("======================================");
	}
}

////請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜對則顯示正確訊息,如圖示結果:
////(提示:Scanner,亂數方法,無窮迴圈)(進階功能:產生0~100亂數,每次猜就會提示你是大於還是小於正確答案)

//亂數->Random  猜數字->while無窮迴圈

public class hw3_2 {
import java.util.Random;
import java.util.Scanner;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);                      //產生一個Scanner 的物件(new scanner)，並放入一個Scanner 型別的scanner變數中。儲存桶
		Random random = new Random(); 
		int minRange = 0;                                         //依據題目要求，所產生的最小數字
		int maxRange = 9;                                         //依據題目要求，所產生的最大數字
		int correctNumber = (int)(Math.random()*(9 - 0 + 1))+0;   //int資料型態 correctNumber 變數型別  Math.random 亂數(小數點) max9 min0 +1幾個數字 +0起始值
		//引入一個Java內建Math的方法random() 並產生一個0~9之間的隨機亂數。
		//(int)(Math.random() * maxRange -  minRange + 1 ) +  minRange);然後產生的值為double，記得轉型成題所需的型別。 
		

		System.out.println("歡迎參加猜數字遊戲!");
		System.out.println("請猜一個數字 (範圍 " + minRange + " 到 " + maxRange + "):");

		while (true) {//建立一個無限迴圈
			int guessedNumber = sc.nextInt();
			//取得使用者所猜的數，並存入一個變數。
			
			//條件判斷
			if (guessedNumber == correctNumber) {                         //比較答案與使用者所猜的數是否一致。
				System.out.println("恭喜你猜對了！正確答案是 " + correctNumber);//如果使用者猜對，顯示猜對結果。
				break;                                                    //這是跳出while的無限迴圈。
			} else if (guessedNumber < correctNumber) {                   //如果使用者所猜的數比答案小
				System.out.println("猜錯了，數字太小了，請再試一次:");
			} else {                                                      //如果使用者所猜的數(不)比答案小。
				System.out.println("猜錯了，數字太大了，請再試一次:");
			}
		}
		sc.close();
	}
}

//阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇
//的號碼與總數,如圖:

//(提示:Scanner)(進階挑戰:輸入不要的數字後,直接亂數印出6個號碼且不得重複)
//的號碼與總數,如圖:
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class hw3_3 {
    public static void main(String[] args) {           	//main方法
        Scanner scanner = new Scanner(System.in);      	//產生一個scanner的新物件,System in 是一個系統薪物件
        System.out.println("阿文的大樂透号码选择器");       	//列印文字
        System.out.print("请输入阿文不想要的数字（1~9）: "); 	//列印文字
        int unwantedNumber = scanner.nextInt();       	//依據題目要求,所產生的阿文不想要的數字

        List<Integer> lotteryNumbers = generateLotteryNumbers(unwantedNumber);  //產生樂透號碼
        int totalCount = lotteryNumbers.size();  //

        System.out.println("阿文可以选择的号码: " + lotteryNumbers);
        System.out.println("总数: " + totalCount);
    }

    public static List<Integer> generateLotteryNumbers(int unwantedNumber) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 49; i++) {
            if (i != unwantedNumber) {
                numbers.add(i);
            }
        }
        return numbers;
    }
}


public class hw3_4 {

import java.util.Random;
import java.util.Scanner;
    public static void main(String[] args) {

//透過Math類別的靜態方法random(),可以自動產生隨機的數字


//請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜對則顯示正確訊息,如圖示結果:
//(提示:Scanner,亂數方法,無窮迴圈)

    Scanner scanner = new Scanner(System.in);        
    Random random = new Random();                      //亂數產生使用random
    for(int i=0;i<=9;i++)
    	

//(進階功能:產生0~100亂數,每次猜就會提示你是大於還是小於正確答案)
//亂數=Math.random

	        Scanner scanner = new Scanner(System.in);        
	        Random random = new Random();                      //亂數產生使用random
	        
	        int minRange = 0;
	        int maxRange = 100;                                // 設定猜數字的範圍為0到100
	        int randomNumber = random.nextInt(maxRange + 1);   //
	        
	        System.out.println("歡迎參加猜數字遊戲！請猜一個介於 " + minRange + " 到 " + maxRange + " 之間的數字。");
	        
	        while (true) {
	            System.out.print("請輸入你的猜測: ");
	            int guess = scanner.nextInt();
	            
	            if (guess < minRange || guess > maxRange) {
	                System.out.println("請輸入 " + minRange + " 到 " + maxRange + " 之間的數字。");
	            } else if (guess < randomNumber) {
	                System.out.println("太小了，再試一次！");
	            } else if (guess > randomNumber) {
	                System.out.println("太大了，再試一次！");
	            } else {
	                System.out.println("恭喜你，猜對了！正確答案是 " + randomNumber);
	                break;
	            }
	        }
	        
	        scanner.close();
	    }
	}
