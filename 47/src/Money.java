import java.util.Scanner;

public class Money {
	static void isCheckOK(String moneyset){
		if (!moneyset.matches("^[0-9]{1,9}$")){
			System.out.println("請重新執行...");
			System.out.println("1.必須須入1到9的數字");
			System.out.println("2.金額誤大於10億");
		}
	}

	public static void main(String[] args) {
		
			System.out.print("請輸入數字:");
			Scanner in = new Scanner(System.in);	
			String moneyset = in.next();
			
			Money.isCheckOK(moneyset);
			
		    String change = new String (moneyset);
		    change =moneyset.replaceAll("1","壹").replaceAll("2","貳").replaceAll("3","叁")
			.replaceAll("4","肆").replaceAll("5","伍").replaceAll("6","陸").replaceAll("7","柒")
			.replaceAll("8","捌").replaceAll("9","玖").replaceAll("0", "零");
		  	
		  	 if(change.length()==1){
		  		System.out.println(change.charAt(0)+"元整");
		  	}else if (change.length()==2){
			  	System.out.println(change.charAt(0)+"拾"+change.charAt(1)+"元整");
		  	}else if (change.length()==3){
		  		System.out.println(change.charAt(0)+"佰"+change.charAt(1)+"拾"+change.charAt(2)+"元整");
		  	}else if (change.length()==4){
		  		System.out.println(change.charAt(0)+"仟"+change.charAt(1)+"佰"+change.charAt(2)+"拾"+change.charAt(3)+"元整");
		  	}else if (change.length()==5){
		  		System.out.println(change.charAt(0)+"萬"+change.charAt(1)+"仟"+change.charAt(2)+"佰"+change.charAt(3)+"拾"+change.charAt(4)+"元整");
		  	}else if (change.length()==6){
		  		System.out.println(change.charAt(0)+"拾"+change.charAt(1)+"萬"+change.charAt(2)+"仟"+change.charAt(3)+"佰"+change.charAt(4)+"拾"+change.charAt(5)+"元整");
		  	}else if (change.length()==7){
		  		System.out.println(change.charAt(0)+"佰"+change.charAt(1)+"拾"+change.charAt(2)+"萬"+change.charAt(3)+"仟"+change.charAt(4)+"佰"+change.charAt(5)+"拾"+change.charAt(6)+"元整");	  		
		  	}else if (change.length()==8){
		  		System.out.println(change.charAt(0)+"仟"+change.charAt(1)+"佰"+change.charAt(2)+"拾"+change.charAt(3)+"萬"+change.charAt(4)+"仟"+change.charAt(5)+"佰"+change.charAt(6)+"拾"+change.charAt(7)+"元整");
		  	}else if (change.length()==9){
		  		System.out.println(change.charAt(0)+"億"+change.charAt(1)+"仟"+change.charAt(2)+"佰"+change.charAt(3)+"拾"+change.charAt(4)+"萬"+change.charAt(5)+"仟"+change.charAt(6)+"佰"+change.charAt(7)+"拾"+change.charAt(8)+"元整");
		  	}
			
			
	}
				   
			   
}   
			
			   
			

			