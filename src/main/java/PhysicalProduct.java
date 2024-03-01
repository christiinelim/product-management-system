import java.util.Scanner;

public class PhysicalProduct extends Product {
  
  private String dimensionUnit;
  private double height;
  private double width;
  private double length;
  
  private String weightUnit;
  private int weight;

  // CONSTRUCTOR
  public PhysicalProduct() {
    super();
    dimensionUnit = "";
    height = 0;
    width = 0;
    length = 0;

    weightUnit = "";
    weight = 0;
  }

  // OVERLOADED CONSTRUCTOR
  public PhysicalProduct(String name, String SKU, double cost, String dimensionUnit, double height, double width, double length, String weightUnit, int weight) {
    super(name, SKU, cost);
    this.dimensionUnit = dimensionUnit;
    this.height = height;
    this.width = width;
    this.length = length;
    this.weightUnit = weightUnit;
    this.weight = weight;
  }

  // GETTER
  public String getDimensionUnit() {
    return dimensionUnit;
  }

  public double getHeight() {
    return height;
  }

  public double getWidth() {
    return width;
  }

  public double getLength() {
    return length;
  }

  public String getWeightUnit(){
    return weightUnit;
  }

  public int getWeight(){
    return weight;
  }

  // SETTER
  public void setDimensionUnit(String dimensionUnit) {
    this.dimensionUnit = dimensionUnit;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public void setLength(double length) {
    this.length = length;
  }

  public void setWeightUnit(String weightUnit){
    this.weightUnit = weightUnit;
  }

  public void setWeight(int weight){
    this.weight = weight;
  }

  // toString
  public String toString() {
    return super.toString() + ", Dimensions: " + height + "X" + width + "X" + length + dimensionUnit + ", " + "Weight: " + weight + weightUnit;
  }

  // EDIT DETAILS
  public void editDetails(){
    super.editDetails();
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter new dimention unit (e.g. cm, m): ");
    String newDimensionUnit = sc.next();
    this.setDimensionUnit(newDimensionUnit);
    System.out.println();

    System.out.println("Enter new height: ");
    double newHeight = sc.nextDouble();
    this.setHeight(newHeight);
    System.out.println();

    System.out.println("Enter new width: ");
    double newWidth = sc.nextDouble();
    this.setWidth(newWidth);
    System.out.println();

    System.out.println("Enter new length: ");
    double newLength = sc.nextDouble();
    this.setLength(newLength);
    System.out.println();

    System.out.println("Enter new weight unit: ");
    String newWeightUnit = sc.next();
    this.setWeightUnit(newWeightUnit);
    System.out.println();

    System.out.println("Enter new weight: ");
    int newWeight = sc.nextInt();
    this.setWeight(newWeight);
    System.out.println();
  }

  // SALES TAX
   public double calculateSalesTax(){
     return this.cost*0.2;
   }
}