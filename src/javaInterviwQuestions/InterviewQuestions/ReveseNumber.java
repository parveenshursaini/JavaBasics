package InterviewQuestions;



public class ReveseNumber {

	public static void main(String[] args) {
		int n=349027,reverse=0,remainder;
		
		while(n!=0) {
			remainder=n%10;
		    reverse=reverse*10+remainder;
		    n=n/10;
			
		}
		

	}

}
