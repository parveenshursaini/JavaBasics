package InterviewQuestions;
import java.util.Arrays;

public class LargeSmallNum {

	public static void main(String[] args) {
		
		int[]a= {20,30,22,345,98765,-88,-21};
		
		int largest=a[0];
		int smallest=a[0];
		
		for(int i=1;i<a.length;i++) {
			if (a[i]>largest) {
				largest=a[i];
			}
				else if(a[i]<smallest){
					smallest=a[i];
					
				}
				
			}
		System.out.println(Arrays.toString(a));
		
		System.out.println(largest);
		System.out.println(smallest);
			
		}
		
		
	}


