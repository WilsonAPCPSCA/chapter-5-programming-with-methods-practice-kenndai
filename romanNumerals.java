import java.util.Scanner;
public class romanNumerals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int n = in.nextInt();
		int a = n/100; //hundreds
		int b = n/10; //tens
		int c = n; // ones
		System.out.println(romanDigit(a, "C", "D", "M") + romanDigit(b, "X", "L", "C") + romanDigit(c, "I", "V", "X"));
	}
	public static String romanDigit(int n, String ones, String fives, String tens){
		String x = "";
		int d = n%10;
		if (d >= 1 && d < 4){
			for (int i=1;i<=d; i++ ){
				System.out.print(ones);
			}
		}else if(d==4){
			System.out.print(ones+fives);
		}else if(d>=5 && d<9){
			System.out.print(fives);
			for (int i=0; i<d-5; i++){
				System.out.print(ones);
			}
		}else if (d==9){
			System.out.print(ones+tens);
		}
		return x;
	}
}
