import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileReadWrite {

	public static void main(String[] args) {
		Alumni [] students = new Alumni [2];
		Scanner s = new Scanner(System.in);	// populate array from user input
		for(int i = 0; i < students.length; i++){
			System.out.print("Name");
			String name = s.nextLine();
			System.out.print("Graduation year");
			String grad_year = s.nextLine();
			System.out.print("Email");
			String email = s.nextLine();
			System.out.print("Address");
			String address = s.nextLine();
			System.out.print("Id");
			int id = s.nextInt();
			s.nextLine(); // to consume \n after double input
			// create Student object from input
			Alumni temp = new Alumni(name,grad_year,email,address,id);
			// store in array
			students[i] = temp;
		}
		
		// write object information in a file
		try {
			FileWriter fw = new FileWriter("data.txt", true);
			
			for(int i = 0; i < students.length; i++){
				fw.write(students[i].getName() + "\n");
				fw.write(students[i].getGrad_year() + "\n");
				fw.write(students[i].getEmail() + "\n");
				fw.write(students[i].getAddress() + "\n");
				fw.write(students[i].getId() + "\n");
			}
			
			fw.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		// read back the file, create an array to populate it with retrieved data
		/*Alumni [] data = new Alumni [10];
		
		try {
			File f = new File("data.txt");
			Scanner x = new Scanner(f);
			int index = 0;
			
			while(x.hasNextLine()){
				String name = x.nextLine();
				String grad_year = x.nextLine();
				String email = x.nextLine();
				String address = x.nextLine();
				int id = x.nextInt(); // data is stored in file as String, even numbers
				int c = Int.parseInt(cgpa);
				Alumni temp = new Alumni(name,grad_year,email,address,id);
				data[index] = temp;
				index++;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		// print retrieved data to make sure you have the data back
		for(int i = 0; i < data.length; i++){
			if(data[i] != null){ // object is not null
				System.out.println(data[i]);
			}
		}
		
		// search for a particular record
		System.out.println("Enter search key which you would like to use for searching:");
		String key = s.nextLine();
		
		for(int i = 0; i < data.length; i++){
			if(data[i] != null && data[i].getId().equals(key) || data[i].getName().equals(key)){
				System.out.println("Record found!");
				System.out.println(data[i]);
			}
		}*/
	}
}