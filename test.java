import java.util.Scanner;

class test{

public static void main(String args[]){

Scanner sc = new Scanner(System.in);
boolean track = false;

do{

System.out.print("enter the desired height for your triangle:");
int x=sc.nextInt();

for(int i=1; i<=x;i++){

for(int j=x; j>=i;j--){
System.out.print(" ");

}
for(int c=1;c<=i;c++){
System.out.print("* ");

}
System.out.println();
}

System.out.println("want to try again?");
String ans= sc.next();
if(ans.equalsIgnoreCase("y") || ans.equalsIgnoreCase("yes")){
track= true;
}else{
track=false;
}


}while(track);


}

}