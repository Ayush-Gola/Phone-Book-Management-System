package project;
import java.util.Iterator;
import java.util.Scanner;
public class operation {
	
	static Scanner sc=new Scanner(System.in);
	void addcontact() {
			System.out.println("Enter your name");
			String name=sc.nextLine();
			System.out.println("Enter your number");
			String number=sc.nextLine();
			Iterator<contact>i=database.arr.iterator();
			int p=0;
			while(i.hasNext()) {
				if(i.next().getnumber().equals(number)) {
					p=1;
					break;
				}
			}
			if(p==1) {
				System.out.println("Contact already present with same number");
			}else {
			contact c3=new contact(name,number);
			database.arr.add(c3);
			System.out.println("Contact Added Successfully");}
	}
	
	
	
	void display() {
		Iterator<contact>i=database.arr.iterator();
		int k=0;
		while(i.hasNext()) {
			System.out.println(i.next());
			k=1;
		}
		if(k==0) {
			System.out.println("No Contacts Availaible");
		}
	}
	
	
	
	void searchContact() {
		System.out.println("Want to perform searchin by name or number");
		System.out.println("1: name       2:number");
		System.out.println("Enter your choice");
		int c=sc.nextInt();
		if(c==1) {
			int count=0;
			System.out.println("Enter name");
			sc.next();
			String n=sc.nextLine();
			Iterator<contact>i=database.arr.iterator();
			while(i.hasNext()){
				contact obj=i.next();
				if((obj.getname().contains(n))) {
					count++;
					System.out.println(obj.getname()+" "+obj.getnumber());
				}
			}
			if(count==0) {
				System.out.println("No contact availaible");
			}
		}
		else if(c==2) {
			int count=0;
			System.out.println("Enter number");
			sc.next();
			String n=sc.nextLine();
			Iterator<contact>i=database.arr.iterator();
			while(i.hasNext()){
				contact obj=i.next();
				if((obj.getnumber().contains(n))) {
					count++;
					System.out.println(obj.getname()+" "+obj.getnumber());
				}
			}
			if(count==0) {
				System.out.println("No contact availaible");
			}
		}
		else {
			System.out.println("Enter correct choice");
		}
		
		
	}
	
	
	
	
		contact searchIndexName(String name) {
			Iterator<contact>i=database.arr.iterator();
			while(i.hasNext()) {
				contact obj=i.next();
				if(obj.getname().equals(name)) {
					return obj;
				}
			}
			return null;
		}
	contact searchIndexNumber(String number) {
		Iterator<contact>i=database.arr.iterator();
		while(i.hasNext()) {
			contact obj=i.next();
			if(obj.getnumber().equals(number)) {
				return obj;
			}
		}
		return null;
	}
	
	
	void editContact() {
		System.out.println("What you want to edit----");
		System.out.println("1:Edit Name     2:Edit Number");
		System.out.println("Enter your choice");
		int c=sc.nextInt();
		switch(c) {
			case 1:{
					System.out.println("Enter name");
					sc.nextLine();
					String input_name=sc.nextLine();
					contact a=searchIndexName(input_name);
					if(a==null) {
						System.out.println("Contact not present of this name:"+" " +input_name);
					}
					else if(a!=null){
						System.out.println("Enter new name");
						String new_name=sc.nextLine();
						a.setname(new_name);
						System.out.println("Contact Updated");
					}
			}break;
			case 2:{
					System.out.println("Enter number");
					sc.nextLine();
					String input_number=sc.nextLine();
					contact a=searchIndexNumber(input_number);
					if(a==null) {
						System.out.println("Contact not present of this number:"+" " +input_number);
					}
					else if(a!=null){
						System.out.println("Enter new number");
						String new_number=sc.nextLine();
						a.setnumber(new_number);
						System.out.println("Contact Updated");
					}					
			}break;
			default:{
				System.out.println("Enter correct choice");
			}			
		}
	}
	
	
	void deleteContact() {
		System.out.println("Want to perform deletion by name or number");
		System.out.println("1:name   2:number");
		System.out.println("Enter your choice");
		int ch=sc.nextInt();
		switch(ch) {
			case 1:{
					System.out.println("Enter name");
					sc.nextLine();
					String n=sc.nextLine();
					contact a=searchIndexName(n);
					if(a==null) {
						System.out.println("Contact not present");
					}
					else if(a!=null) {
						database.arr.remove(a);
						System.out.println("Contact Deleted Successfully");
					}
			}break;
			case 2:{
					System.out.println("Enter number");
					sc.nextLine();
					String n=sc.nextLine();
					contact a=searchIndexNumber(n);
					if(a==null) {
						System.out.println("Contact not present");
					}
					else if(a!=null) {
						database.arr.remove(a);
						System.out.println("Contact Deleted Successfully");
					}
			}break;
		}
	}
	
	void call() {
		System.out.println("Enter the person want to call");
		String str=sc.nextLine();
		
	}
	
}
