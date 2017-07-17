package GUVI;

import java.util.Scanner;

public class H40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int c=0;
int i=0,sum=0,sum1=0;
int temp=0,d=0,temp1=0;
for(i=0;i<=15;i++){
	temp=a%10;
	sum+=temp;
	a=a/10;
}
System.out.println(sum);
for(i=0;i<=15;i++){
	temp1=sum%10;
	sum1+=temp1;
	sum=sum/10;
	if(sum1==sum){
		System.out.println("palindrome");
		break;
	}
	else{
		System.out.println("not a palindrome");
		break;
	}
}

	}}

