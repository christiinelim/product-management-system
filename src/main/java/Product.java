import java.util.Scanner;

public abstract class Product implements ITaxable{
  protected String name;
  protected String SKU;
  protected double cost;

  // CONSTRUCTOR
  public Product() {
    name = "";
    SKU = "";
    cost = 0;
  }

  // OVERLOADED CONSTRUCTOR
  public Product(String name, String SKU, double cost) {
    this.name = name;
    this.SKU = SKU;
    this.cost = cost;
  }

  // GETTERS
  public String getName() {
    return name;
  }

  public String getSKU() {
    return SKU;
  }

  public double getCost() {
    return cost;
  }

  // SETTERS
  public void setName(String name) {
    this.name = name;
  }

  public void setSKU(String SKU) {
    this.SKU = SKU;
  }

  public void setCost(double cost) {
    this.cost = cost;
  }

  // toString
  public String toString() {
    return "Name: " + name + ", SKU: " + SKU + ", Cost: " + cost;
  }

  // EDIT DETAILS
  public void editDetails(){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter new name: ");
    String newName = sc.nextLine();
    this.setName(newName);
    System.out.println();

    System.out.println("Enter new SKU: ");
    String newSKU = sc.next();
    this.setSKU(newSKU);
    System.out.println();

    System.out.println("Enter new cost: ");
    double newCost = sc.nextDouble();
    this.setCost(newCost);
    System.out.println();
  }

  // SALES TAX
  public abstract double calculateSalesTax();

}