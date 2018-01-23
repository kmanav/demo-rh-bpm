package example;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Order implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private long orderId;
	private java.lang.String item;
	private java.util.List<model.Supplier> suppliers;
	private double price;
	private Boolean managerApproval;
	private String rejectionReason;

	private java.lang.String category;

	private java.lang.String urgency;

	public Order() {
	}

	@Override
	public String toString() {
		return String.format(
				"Order [orderId=%s, item=%s, suppliers=%s, price=%s, managerApproval=%s, rejectionReason=%s, category=%s, urgency=%s]",
				orderId, item, suppliers, price, managerApproval, rejectionReason, category, urgency);
	}

	public java.lang.String getItem() {
		return this.item;
	}

	public void setItem(java.lang.String item) {
		this.item = item;
	}

	public java.util.List<model.Supplier> getSuppliers() {
		return this.suppliers;
	}

	public void setSuppliers(java.util.List<model.Supplier> suppliers) {
		this.suppliers = suppliers;
	}

	public Order(java.lang.String item, java.util.List<model.Supplier> suppliers) {
		this.item = item;
		this.suppliers = suppliers;
	}

	public Boolean getManagerApproval() {
		return managerApproval;
	}

	public void setManagerApproval(Boolean managerApproval) {
		this.managerApproval = managerApproval;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public String getRejectionReason() {
		return rejectionReason;
	}

	public void setRejectionReason(String rejectionReason) {
		this.rejectionReason = rejectionReason;
	}

	public java.lang.String getCategory() {
		return this.category;
	}

	public void setCategory(java.lang.String category) {
		this.category = category;
	}

	public java.lang.String getUrgency() {
		return this.urgency;
	}

	public void setUrgency(java.lang.String urgency) {
		this.urgency = urgency;
	}

	public Order(long orderId, java.lang.String item, java.util.List<model.Supplier> suppliers, double price,
			java.lang.Boolean managerApproval, java.lang.String rejectionReason, java.lang.String category,
			java.lang.String urgency) {
		this.orderId = orderId;
		this.item = item;
		this.suppliers = suppliers;
		this.price = price;
		this.managerApproval = managerApproval;
		this.rejectionReason = rejectionReason;
		this.category = category;
		this.urgency = urgency;
	}
}
