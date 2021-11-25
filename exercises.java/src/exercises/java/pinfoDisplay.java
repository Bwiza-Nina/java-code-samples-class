package exercises.java;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class pinfoDisplay {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = null;
		String oneLine;
		int i = 0;
		
		PersonInfo [] persons = new PersonInfo[5];
		try {
			bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Cyndy Nina\\eclipse-workspace\\exercises.java\\src\\myText.txt"));
			while((oneLine = bufferedReader.readLine()) != null) {
				StringTokenizer tokenizer = new StringTokenizer(oneLine, "` ");
				
				String FirstName = tokenizer.nextToken();
				String LastName = tokenizer.nextToken();
				String Age = tokenizer.nextToken();
				String gender = tokenizer.nextToken();
//				
				persons[i] = new PersonInfo();
				persons[i].setFirstName(FirstName);
				persons[i].setLastName(LastName);
				persons[i].setAge(Integer.parseInt(Age));
				persons[i].gender =Gender.valueOf(gender);
				
				i++;
			}
			for(i=0; i<persons.length; i++) {
				System.out.println("My name is "+persons[i].getFirstName()+" "+persons[i].getLastName()+" I am a "+persons[i].getAge()+" years old "+persons[i].getGender()+".");
			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			bufferedReader.close();
		}
	}
}
