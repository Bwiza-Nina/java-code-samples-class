package exercises.java;

public class PersonInfo{
	private String FirstName;
	private String LastName;
	private Integer Age;
	public Gender gender;
	
	public PersonInfo() {}
	
	public PersonInfo(String FirstName, String LastName,Integer Age, Gender gender) {
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.Age = Age;
		this.gender = gender;
	}
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	
	public int getAge() {
		return Age;
	}
	public void setAge(Integer age) {
		this.Age = age;
	}
	
	public void setGender(Gender gender) {
        this.gender = gender;
    }
	public Gender getGender() {
		return gender;
	}
}

