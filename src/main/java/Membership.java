public class Membership implements ITaxable {
  private String customerName;
  private String type;
  private double cost;

  // CONSTRUCTOR
  public Membership() {
    customerName = "";
    type = "";
    cost = 0;
  }
  
  // OVERLOADED CONSTRUCTOR
  public Membership(String customerName, String type, double cost) {
    this.customerName = customerName;
    this.type = type;
    this.cost = cost;
  }

  // GETTER
  public String getCustomerName() {
    return customerName;
  }
  
  public String getType() {
    return type;
  }
  
  public double getCost() {
    return cost;
  }

  // SETTER
  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }
  
  public void setType(String type) {
    this.type = type;
  }
  
  public void setCost(double cost) {
    this.cost = cost;
  }

  public double calculateSalesTax() {
    double taxPercentage = 0.05; 
    return getCost() * taxPercentage;
  }

}
