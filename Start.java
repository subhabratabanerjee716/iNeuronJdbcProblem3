package PetsManagement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Start {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		
		System.out.println("Welcome to pets management app");
		
		
		System.out.println("Choose what database operation would you you like to perform :-");
		
		System.out.println("Enter 1 to insert new Pet with owner");
		System.out.println("Enter 2 to update ");
		System.out.println("Enter 3 to select new Pet with owner");
		System.out.println("Enter 4 to delete your Pet with owner");
		
		int n = Integer.parseInt(br.readLine());
			
		if(n==1) {
			
			//insert new owner in pet_owner
			//insert pets in pets table
			
			System.out.println("Enter your name");
			
			String name =br.readLine();
			
			System.out.println("enter your pet name plus breed :-");
			
			String petName=br.readLine();
			
			String DogCategory=br.readLine();
			
			System.out.println("what is the id of the dog person :-");
			
			int n1 = Integer.parseInt(br.readLine());
			
			Pets_owner po=new Pets_owner(n1,name);
			
			pets p = new pets(petName,DogCategory,n1);
			
			if(Dao.insertOwnerAndPet(po,p)) {
				
				System.out.println("Data is inserted");
				
			}
			
		}else if(n==2) {
			
			//update  the table
			
			
		}else if(n==3) {
			
			
			//select from table
			
			Dao.select();
			
			
		}else if(n==4) {
			
			// delete from the table
			
			System.out.println("Enter the id to be deleted");
			
			int id=br.read();
			
			Dao.delete(id);
			
			
		}
		

	}

	

}
