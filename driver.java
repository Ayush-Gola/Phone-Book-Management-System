package project;
import java.util.Scanner;
public class driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("WELCOME TO OUR APPLICATION");
		boolean t=true;
		while(t) {
			System.out.println();
		System.out.println("What operation you want to perform ❓... ");
		System.out.println();
		System.out.println("✅✅ Enter you choice ✅✅");
		System.out.println("1 : Add Contact               2 : Search Contact");
		System.out.println("3 : Edit Contact       	      4 : Delete Contact");
		System.out.println("5 : Display All Contact       6 : Call");
		System.out.println("7 : Exit");
		
		
		System.out.println("Enter you choice");
		int ch=sc.nextInt();
		operation obj=new operation();
		switch(ch){
		case 1:
			obj.addcontact();
			break;
			
		case 2:
			obj.searchContact();
			break;
			
		case 3:
			obj.editContact();
			break;
			
		case 4:
			obj.deleteContact();
			break;
			
		case 5:
			obj.display();
			break;
		case 6:
			obj.call();
			break;
		case 7:
			t=false;
			break;
		default:
			System.out.println("Enter correct choice");
			
		}
		if (t==false){
			break;
		}
		
		}
	}
}
