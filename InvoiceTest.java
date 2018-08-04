package shop.exam;

public class InvoiceTest {

	private String part_number;
	private String part_description;
	private int quantity;
	private double price;
	private double invoice_amount;

	public InvoiceTest(String part_number, String part_description, int quantity, double price) {
		super();
		this.part_number = part_number;
		this.part_description = part_description;
		if (quantity < 0) {
			this.quantity = 0;
		} else {
			this.quantity = quantity;
		}
		if (price < 0) {
			this.price = 0;
		} else {
			this.price = price;
		}
	}

	public double getInvoice_amount() {
		return (double)quantity *price;
	}

	public void setInvoice_amount(double invoice_amount) {
		this.invoice_amount = invoice_amount;
	//	double invoice_amount1 = quantity * price;

	}

	public String getPart_number() {
		return part_number;
	}

	public void setPart_number(String part_number) {
		this.part_number = part_number;
	}

	public String getPart_description() {
		return part_description;
	}

	public void setPart_description(String part_description) {
		this.part_description = part_description;
	}

	public int getQuantity() {
		return (int)quantity-quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return (double) quantity* price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	// double invoice_amount = quantity * price;
}