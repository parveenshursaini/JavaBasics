package InterviewQuestions;

public class RevString {

	public static void main(String[] args) {
		String s="Parveen Shursaini";
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
		int l=s.length();
		System.out.println(l);
		String rev = "";
		for (int i=l-1;i>=0;i--) {
			rev=rev+s.charAt(i);
			
		} 
		System.out.println(rev);
		
		StringBuffer str=new StringBuffer(s);
		str.reverse();
		
		System.out.println(str);
		
		
		
		
	}
	
	

}
