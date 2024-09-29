import java.util.Scanner;

public class helloworld {
// this is my first attempt learning java i hope it is easy as i expecting
    public static void main(String[] args) {

    	    boolean rep =false;
do {
	
	Scanner scan = new Scanner(System.in);
	int input,end;
		 System.out.println("what do you want to input?: ");
		input = scan.nextInt();
		System.out.println("number that you want to end:");
		end= scan.nextInt();
		int a =1;
		for(int i =input; i<= end; i++) {
			
			System.out.print(input + " ");
			input++;
			a++;
			
			}
		System.out.println();
		System.out.print("want to try again? (Y/N): ");
		String ans;
		ans = scan.next();
		if(ans.equalsIgnoreCase("y")) {
			rep=true;
						}
		else {
			System.exit(0);
		}

		
}while(rep);
	 
	 
	 
	}

}
