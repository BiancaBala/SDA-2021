package Laborator2;

public class P3 {

	public static void main(String[] args) {

		Adress address = new Adress("Brasov", "Zizinului", 35);

		Payment pay = new Payment("cash");

		Customer customer = new Customer(address, pay, "Bianca", "Balanuca", 22);

		System.out.println("Numele complet este: " + customer.getCompleteName());

		System.out.println("Adresa este: " + customer.getAdress().getFullAdress());

		System.out.println("Plata: " + customer.getPaymentMethod().getType());

	}

}
