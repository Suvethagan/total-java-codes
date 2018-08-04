package shop.exam;

public class InvoiceDemo {
	public static void main(String[] args) {
		InvoiceTest it0 = new InvoiceTest("p1", "original iron rod", -5, 250.00);
		InvoiceTest it1 = new InvoiceTest("p2", "cement bag", 10, 1000.00);

		System.out.println("it0 :" + 
				it0.getQuantity() + "\t" + 
				it0.getPart_description() + "\t"+ 
				it0.getPart_number() + "\t" + 
				it0.getPrice() + "\t" + 
				it0.getInvoice_amount());

		System.out.println("it1 :" + 
				it1.getQuantity() + "\t" + 
				it1.getPart_description() + "\t"+ 
				it1.getPart_number() + "\t" + 
				it1.getPrice() + "\t" + 
				it1.getInvoice_amount());
	}
}
