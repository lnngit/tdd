package tdd;

public class Sravani {
	public static void main(String[] args) {
		User user = new User();
		user.setFirstName("Lenin Kumar");
		//user.setLastName("Koppoju");
		display(user);

		Customer c = new Customer();// first-name, last-name
		c.put("first-name", "Lenin Kumar");
		c.put("last-name", "Koppoju");
		display(c);
	}

	public static void display(User u) {
		System.out.println(u.getFirstName());
		System.out.println(u.getLastName());
	}

	public static void display(Customer c) {
		System.out.println(c.get("first-name"));
		System.out.println(c.get("last-name"));
	}
}
