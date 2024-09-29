import java.util.Scanner;

public class sort{

public static void main(String args[]){

Scanner scan= new Scanner (System.in);

System.out.println("how many element you want to input:");
int element= scan.nextInt();

int[] arrnum= new int[element];

for(int r=0;r<element;r++){
System.out.print("element "+ (r+1) +": ");
int elnum=scan.nextInt();

arrnum[r]=elnum;
System.out.println();
}

for(int i=0; i<arrnum.length-1;i++){

for(int j=0; j<=i;j++){

if(arrnum[j]>arrnum[i+1]){
int temp=arrnum[i+1];
arrnum[i+1]=arrnum[j];
arrnum[j] = temp;
}


}

}


System.out.println();
for(int y=0;y <= arrnum.length-1;y++){
System.out.println(arrnum[y]);
}


}

}