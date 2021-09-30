package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {
	public static void main(final String[] args) throws ParseException {
		Locale.setDefault(Locale.US);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter client data:");
		System.out.print("Name: ");

		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date  (DD/MM/YYYY): ");
		// Date birthDate = sdf.parse(sc.next());
		Date birthDate = sdf.parse(sc.next());

		Client client = new Client(name, email, birthDate);

		System.out.println("Enter order data:");
		System.out.println("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());

		Order order = new Order(new Date(), status, client);

		System.out.println("How many items to this order?");
		int N = sc.nextInt();
		for (int i = 1; i <= N; i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Produtc name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Produtc price: ");
			double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();

			Product product = new Product(productName, productPrice);

			OrderItem it = new OrderItem(quantity, productPrice, product);

			order.addItem(it);

		}
		System.out.println();
		System.out.println(order);

		sc.close();

	}
}
