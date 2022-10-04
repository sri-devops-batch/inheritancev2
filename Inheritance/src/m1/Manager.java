package m1;

public class Manager extends Employee {
String product;
int noOfSales;

public Manager(String product,int noOfSales) {
	super();
	this.product=product;
	this.noOfSales=noOfSales;
	
}
public Manager(String name, int id, int salary,String product,int noOfSales) {
	super(name, id, salary);
	this.product = product;
	this.noOfSales=noOfSales;
	// TODO Auto-generated constructor stub
}
public String getProduct() {
	return product;
}
public void setProduct(String product) {
	this.product = product;
}
public int getNoOfSales() {
	return noOfSales;
}
public void setNoOfSales(int noOfSales) {
	this.noOfSales = noOfSales;
}
}
