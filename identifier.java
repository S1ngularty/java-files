import java.util.Scanner;

class identifier{
public static void main (String args[]){

Scanner sc= new Scanner(System.in);
boolean track=false;

do{
System.out.println("enter a num");
int num=sc.nextInt();

int result = num%2;

if(result == 1){
System.out.println();
System.out.println("its ODD! "+num);
System.out.println();
}else{
System.out.println();
System.out.println("its EVEN! "+num);
System.out.println();
}

System.out.println("you want to try again??:");
String ans= sc.next();

if(ans.equalsIgnoreCase("y") || ans.equalsIgnoreCase("yes")){
track = true;
}else{track = false;
 }


}while(track==true);


}

}

