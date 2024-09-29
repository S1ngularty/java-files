import java.util.Scanner;

public class search{

public static void main(String args[]){

Scanner scan= new Scanner (System.in);

System.out.print("how many element you want to enter: ");

int num=scan.nextInt();

int[] arrnum= new int[num];

for(int i=0;i<num;i++){
System.out.print("Element " +(i+1) + ": ");
arrnum[i]=scan.nextInt();
}

System.out.print("what element you want to search:");
int search=scan.nextInt();

for(int a=0; a<=arrnum.length-1;a++){
if(search == arrnum[a]){
System.out.println("The element is found on index "+a);
System.out.print(" here is the elements of the array: ");
for(int y=0;y<=arrnum.length-1;y++){
System.out.print(" " + arrnum[y]);

}

}
}



}


}