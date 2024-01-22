package hw1;

// 請設計一隻Java程式,計算12 6這兩個數值的和與積

public class HW1_1 {
	public static void main(String[] args) {
		
	
		int i1=12,i2=6;
		int sum=i1+i2;
		System.out.print("和="+sum+"\t");
		
		int product=i1*i2;
		System.out.println("積="+product);
		
		
	}
	
}


//請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
public class HW1_2 {
	public static void main(String[] args) {
		int n1=200,n2=12;
		System.out.println(n1/n2);
			System.out.println(n1%n2);
		
	}

}


//請由程式算出值256559秒為多少天 多少小時 多少分 與多少秒
// 
//256559秒 = 幾分 = 幾時 = 幾天
public class HW1_3 {
	public static void main(String[] args) {
		int sec = 1;
		int minD = 60;
		int hoursD = 60 * 60;
		int dayD = 24 * 60 * 60 * 60;
		int allsec = 256559;
		
		
		int dayA = allsec / dayD; 
		int lessA = allsec % dayD;//不足一天的秒數。
		
		int hr = lessA / hoursD;
		int min = (lessA % hoursD) / minD;
		int secRemaining = (lessA % hoursD) % minD;
		
		
		System.out.println(dayA + "天" + hr + "小時" + min + "分" + sec + "秒");
	}
}

//請定義一個常數為3.1415(圓周率) 並計算半徑為5的圓面積與圓周長

public class HW1_4 {
	public static void main(String[]args) {
			float i=3.1415f;
			int j=5;
			System.out.println(i*Math.pow(j,2));
			System.out.println(i*(j*2));
	}
}

//某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本金加利息共有多少錢 (用複利計算,公式請自行google)

public class HW1_5 {
	
    public static void main(String[] args) {
        double principal = 1500000;      // 宣告一個浮點數(double)資料型別為principal 初始本金 150萬      
        double rate = 0.02;              // 宣告一個浮點數(double)資料型別為rate 年利率 2%
        int years = 10;                  // 宣告一個整數(int)資料型別為 year 
        int compoundingFrequency = 1;    // 宣告一個整數(int)資料型別為compoundingFreqqency 複利次數（一年一次）

        double finalAmount = principal * Math.pow(1 + (rate / compoundingFrequency), compoundingFrequency * years); //程式計算-> 10年後,本金加利息共有多少錢
        
        System.out.println("10年後，本金加利息共有：" + finalAmount + "元"); //printout 出來
    }

}

//請寫一隻程式 利用System.out.println()

public class HW1_6 {
	public static void main(String[] args) {
		String str="5";
		int n1=5,n2=5;
		
		
		System.out.println(n1+n2);
		System.out.println(n1+n2); //ASCLL 為53
		System.out.println(n1+str);
	}
}






