package InterviewQuestions;

public class RevInteger {
	public static void main(String [] args) {
		
		int num=12345;
	    int rev=0;
	    while (num!=0) {
	    	rev=rev*10+ num%10;
	    	num=num/10;
	    	
	    }
		System.out.println(rev);
		 
		int num1=123456;
		String s=String.valueOf(num1);
		System.out.println(s);
		
		StringBuffer str=new StringBuffer(s);
		str.reverse();
		System.out.println(str);
		
	}

}
