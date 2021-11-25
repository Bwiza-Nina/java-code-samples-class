package Logic;
import Model.Person;
import Model.Gender;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Person_register {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = null;
        String myline;
        int i = 0;

     Person[] persons= new Person[7];
     //read from file by stroin in the array of person
        //read from the array by writing to the console

        try{
            bufferedReader = new BufferedReader(new FileReader("PersonStore.txt"));

        while ((myline = bufferedReader.readLine()) != null){
            StringTokenizer tokenizer = new StringTokenizer(myline," ");

            String FirstName = tokenizer.nextToken();
            String LastName = tokenizer.nextToken();
            String age = tokenizer.nextToken();
            String gender = tokenizer.nextToken();


            persons[i] = new Person();
                persons[i].setFirstName(FirstName);
                persons[i].setLastName(LastName);
                persons[i].setAge(Integer.parseInt(age));
                persons[i].gender = Gender.valueOf(gender);
//            }
            i++;
        }
         //for printing array to the console
            for(i = 0; i< persons.length ; i++){
                System.out.println(persons[i].getFirstName() + " " + persons[i].getLastName() + " is "+persons[i].getAge() + " and is " +persons[i].getGender());
            }


        }
        catch (IOException e){
         e.printStackTrace();
        }
        finally {
            bufferedReader.close();
        }
        }

}
