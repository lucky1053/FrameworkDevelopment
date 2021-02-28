package utilities;

import com.github.javafaker.Faker;

public class TestDataGenerator {
	String gender;
	public void TestDataGenerator(){
		
		gender= generateGender();
	}

	Faker faker = new Faker();

	//String gender;
	String firstName;
	String lastName;
	int DOB;
	int MOB;
	int YOB;
	String emailID;
	String companyName;
	String password;
	
		public String generateGender() {
		if (Math.random() > 0.5) {
			gender = "MALE";
		} else {
			gender = "FEMALE";
		}
		return gender;
	}

	public String generateFirstName() {
		firstName = faker.name().firstName();
		return firstName;
	}

	public String generateLastName() {
		lastName = faker.name().lastName();
		return lastName;
	}

	public int generateDOB() {
		DOB = faker.date().birthday().getDate();
		return DOB;
	}

	public int generateMOB() {
		MOB = faker.date().birthday().getMonth();
		return MOB;
	}

	public int generateYOB() {
		YOB = faker.date().birthday().getYear();
		return YOB + 1900;
	}

	public String generateCompanyName() {
		companyName = faker.company().name();
		return companyName;
	}

	public String generateEmailId() {
		emailID = faker.internet().emailAddress();
		return emailID;

	}

	public String generatePassword() {
		password = faker.internet().password();
		return password;
	}

	
	
}
