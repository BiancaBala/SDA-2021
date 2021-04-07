package Laborator2;

public class Customer {

	private Adress adress;
	private Payment payment;
	private String lastName;
	private String firstName;
	private int age;

	public Customer(Adress adress, Payment pay, String lastName, String firstName, int age) {

		this.adress = adress;
		this.payment = pay;
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;

	}

	public String getCompleteName() {
		return (firstName + " " + lastName);
	}

	public Adress getAdress() {
		return adress;
	}

	public Payment getPaymentMethod() {
		return payment;
	}

	public String getLastName() {
		return lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public int getAge() {
		return age;
	}

}