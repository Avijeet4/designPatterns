package Practice;

import java.util.Arrays;
import java.util.List;

public class Checksum {
	public static void main(String[] args) {
		List<Integer> weights= Arrays.asList(1,3,1,7,3,9);
		System.out.println(getChecksum("A67849", weights));
		
	}
	static String getChecksum(String number, List<Integer> weights) {
		number=number.toUpperCase();
		
		int sum=0;
		for(int i=0;i<number.length();i++) {
			char c=number.charAt(i);
			int n=0;
			if('0'<= c && '9'>=c) {
				n=c%'0';
			}else {
				n=c%'A'+10;
			}
			sum+=n*weights.get(i);
		}
		int checksum=10-(sum%10);
		return number+checksum;
	}
}
