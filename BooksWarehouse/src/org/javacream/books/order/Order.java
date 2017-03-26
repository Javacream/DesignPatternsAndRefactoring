package org.javacream.books.order;

public class Order {

	private long id;
	private String isbn;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amount;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		long temp;
		temp = Double.doubleToLongBits(totalPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (amount != other.amount)
			return false;
		if (id != other.id)
			return false;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		if (status != other.status)
			return false;
		if (Double.doubleToLongBits(totalPrice) != Double.doubleToLongBits(other.totalPrice))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Order [id=" + id + ", isbn=" + isbn + ", totalPrice=" + totalPrice + ", status=" + status + ", amount="
				+ amount + "]";
	}


	public long getId() {
		return id;
	}


	public String getIsbn() {
		return isbn;
	}


	public double getTotalPrice() {
		return totalPrice;
	}


	public OrderStatus getStatus() {
		return status;
	}


	public int getAmount() {
		return amount;
	}


	public Order(long id, String isbn, double totalPrice, OrderStatus status, int amount) {
		super();
		this.id = id;
		this.isbn = isbn;
		this.totalPrice = totalPrice;
		this.status = status;
		this.amount = amount;
	}


	private double totalPrice;
	private OrderStatus status;
	private int amount;
	
	
	public static enum OrderStatus{
		OK, PENDING, UNAVAILABLE;
	}
}
