import java.util.Scanner;
import java.util.ArrayList;

public class Main {
  private static Scanner sc;
  private static ArrayList<Product> products;
  private static ArrayList<Membership> membershipList;

  public static void main(String[] args) {
    products = new ArrayList<Product>();
    membershipList = new ArrayList<Membership>();
    sc = new Scanner(System.in);

    while (true) {
      displayMenu();
      
      System.out.println("Enter your choice: ");
      int categoryChoice = sc.nextInt();
      System.out.println();

      if (categoryChoice == 1){
        displayProductMenu();

        while (true){
          System.out.println("Enter your choice: ");
          int choice = sc.nextInt();
  
          if (choice == 1){
            showAllProducts();
            break;
          } else if (choice == 2){
            addProduct();
            break;
          } else if (choice == 3){
            updateProduct();
            break;
          } else if (choice == 4){
            deleteProduct();
            break;
          } else if (choice == 5) {
            System.out.println("You have selected to exit");
            break;
          } else {
            System.out.println("Error! Invalid choice, please key in only 1 to 5");
            System.out.println();
          }
        }
      } else if (categoryChoice == 2){
          displayMembershipMenu();

          while (true){
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 1){
              showAllMembership();
              break;
            } else if (choice == 2){
              addMembership();
              break;
            } else if (choice == 3){
              System.out.println("You have selected to exit");
              break;
            } else {
              System.out.println("Error! Invalid choice, please key in only 1 to 3");
              System.out.println();
            }
          }
      } else if (categoryChoice == 3){
        System.out.println("You have selected to exit");
        System.out.println();
        break;
      } else {
        System.out.println("Error! Invalid choice, please key in only 1 to 3");
        System.out.println();
      }
    }
  }

  // MENU
  public static void displayMenu(){
    System.out.println("Menu List");
    System.out.println("1. Product Category");
    System.out.println("2. Membership Category");
    System.out.println("3. Exit");
    System.out.println();
  }

  // PRODUCT MENU
  public static void displayProductMenu(){
    System.out.println("1. Show All Products");
    System.out.println("2. Add New Product");
    System.out.println("3. Update a Product");
    System.out.println("4. Delete a Product");
    System.out.println("5. Exit");
    System.out.println();
  }

  //  SHOW ALL PRODUCTS
  public static void showAllProducts(){
    int productNo = 0;
    System.out.println();
    System.out.println("Show All Products");
    System.out.println();

    for (Product p : products){
      System.out.println("Product #" + productNo);
      System.out.println("Name: " + p.getName());
      System.out.println("SKU: " + p.getSKU());
      System.out.println("Cost: $" + p.getCost());

      if (p instanceof DigitalProduct){
        DigitalProduct p1 = (DigitalProduct) p;
        System.out.println("File Size: " + p1.getFileSize() + p1.getFileSizeUnit());
        System.out.println("File Type: " + p1.getFileType());
        System.out.println("Sales Tax: " + p1.calculateSalesTax());
      } else {
        PhysicalProduct p2 = (PhysicalProduct) p;
        System.out.println("Height: " + p2.getHeight() + p2.getDimensionUnit());
        System.out.println("Width: " + p2.getWidth() + p2.getDimensionUnit());
        System.out.println("Length: " + p2.getLength() + p2.getDimensionUnit());
        System.out.println("Weight: " + p2.getWeight() + p2.getWeightUnit());
        System.out.println("Sales Tax: " + p2.calculateSalesTax());
      }
      
      System.out.println();
      productNo++;
    }
  }

  // ADD PRODUCT
  public static void addProduct(){
    Product newProduct = null;

    System.out.println();
    System.out.println("Add New Product");
    System.out.println();

    while (true){
      System.out.println("Which category of product do you want to add? Enter your choice");
      System.out.println("1. Digital Product");
      System.out.println("2. Physical Product");
      int choice = sc.nextInt();
      System.out.println();
  
      if (choice == 1){
        System.out.println("You have selected to add a new digital product");
        System.out.println();
  
        sc.nextLine();
        System.out.println("Enter Name: ");
        String name = sc.nextLine();
        System.out.println();
        
        System.out.println("Enter SKU: ");
        String SKU = sc.next();
        System.out.println();
        
        System.out.println("Enter Cost: ");
        double cost = sc.nextDouble();
        System.out.println();
        
        System.out.println("Enter File Type (e.g. PDF, DOC): ");
        String fileType = sc.next();
        System.out.println();
        
        System.out.println("Enter File Size Unit (e.g. KB, MB): ");
        String fileSizeUnit = sc.next();
        System.out.println();
        
        System.out.println("Enter File Size (e.g. 200): ");
        int fileSize = sc.nextInt();
        System.out.println();
        
        System.out.println("Enter Download Link: ");
        String downloadLink = sc.next();
        System.out.println();
  
        newProduct = new DigitalProduct(name, SKU, cost, fileType, fileSizeUnit, fileSize, downloadLink);
  
        products.add(newProduct);
        System.out.println("Successfully added the new product!");
        System.out.println();
        break;
        
      } else if (choice == 2){
        System.out.println("You have selected to add a new physical product");
        System.out.println();
  
        sc.nextLine();
        System.out.println("Enter Name: ");
        String name = sc.nextLine();
        System.out.println();
  
        System.out.println("Enter SKU: ");
        String SKU = sc.next();
        System.out.println();
  
        System.out.println("Enter Cost: ");
        double cost = sc.nextDouble();
        System.out.println();
  
        System.out.println("Enter the unit of the dimensions (e.g. cm, m): ");
        String dimensionUnit = sc.next();
        System.out.println();
  
        System.out.println("Enter height: ");
        double height = sc.nextDouble();
        System.out.println();
  
        System.out.println("Enter width: ");
        double width = sc.nextDouble();
        System.out.println();
  
        System.out.println("Enter length: ");
        double length = sc.nextDouble();
        System.out.println();
  
        System.out.println("Enter the unit of the weight (e.g. kg, lb): ");
        String weightUnit = sc.next();
        System.out.println();
  
        System.out.println("Enter weight: ");
        int weight = sc.nextInt();
        System.out.println();
  
        newProduct = new PhysicalProduct(name, SKU, cost, dimensionUnit, height, width, length, weightUnit, weight);
        products.add(newProduct);

        System.out.println("Successfully added the new product!");
        System.out.println();
        break;
        
      } else {
        System.out.println("Error! Invalid choice, please enter only 1 or 2");
        System.out.println();
      }
    }
  }

  // UPDATE PRODUCT
  public static void updateProduct(){
    System.out.println();
    System.out.println("Update a Product");
    System.out.println();
    showAllProducts();
    System.out.println();

    while (true){
      int arrayLength = products.size();
      
      if (arrayLength == 0){
        System.out.println("There is no products in the system");
        System.out.println();
        break;
      }
      
      System.out.println("Enter the number of the product you want to edit");
      int choice = sc.nextInt();
      System.out.println();
  
      if (choice >= 0 && choice <= arrayLength-1){
        
        System.out.println();
        editProduct(products.get(choice));
        System.out.println("Product has been successfully updated!");
        System.out.println();
        break;
      } else {
        System.out.println("Error! Invalid choice, please key in based on no of products available");
        System.out.println();
      }
    }
  }

  // EDIT PRODUCT
  public static void editProduct(Product p){
    p.editDetails();
  }

  // DELETE PRODUCT
  public static void deleteProduct(){
    System.out.println();
    System.out.println("Delete a Product");
    System.out.println();
    showAllProducts();
    System.out.println();

    while (true){
      int arrayLength = products.size();

      if (arrayLength == 0){
        System.out.println("There is no products in the system");
        System.out.println();
        break;
      }

      System.out.println("Enter the number of the product you want to delete");
      int choice = sc.nextInt();
      System.out.println();

      if (choice >= 0 && choice <= arrayLength-1){

        System.out.println();
        products.remove(choice);
        System.out.println("Product has been successfully deleted");
        System.out.println();
        break;
      } else {
        System.out.println("Error! Invalid choice, please key in based on no of products available");
        System.out.println();
      }
    }
  }

  // MEMBERSHIP MENU
  public static void displayMembershipMenu(){
    System.out.println("1. Show All Membership");
    System.out.println("2. Add New Membership");
    System.out.println("3. Exit");
    System.out.println();
  }

  // SHOW MEMBERSHIP
  public static void showAllMembership(){
    int membershipNo = 0;
    System.out.println();
    System.out.println("Show All Memberships");
    System.out.println();

    for (Membership m : membershipList){
      System.out.println("Membership #" + membershipNo);
      System.out.println("Customer Name: " + m.getCustomerName());
      System.out.println("Membership Type: " + m.getType());
      System.out.println("Membership Cost: $" + m.getCost());
      System.out.println("Sales Tax: $" + m.calculateSalesTax());

      System.out.println();
      membershipNo++;
    }
  }

  // ADD MEMBERSHIP
  public static void addMembership(){
    Membership newMembership = null;

    System.out.println();
    System.out.println("Add New Membership");
    System.out.println();
    sc.nextLine();
    
    System.out.println("Enter customer name: ");
    String customerName = sc.nextLine();
    System.out.println();
    
    System.out.println("Enter membership type: ");
    String type = sc.next();
    System.out.println();
    
    System.out.println("Enter membership cost: ");
    double cost = sc.nextDouble();
    System.out.println();

    newMembership = new Membership(customerName, type, cost);
      membershipList.add(newMembership);

    System.out.println("Successfully added the new membership!");
    System.out.println();
  }
}