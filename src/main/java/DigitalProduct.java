import java.util.Scanner; 

public class DigitalProduct extends Product {
  private String fileType;
  private String fileSizeUnit;
  private int fileSize;
  private String downloadLink;

  // CONSTRUCTOR
  public DigitalProduct() {
    super();
    fileType = "N/A";
    fileSizeUnit = "N/A";
    fileSize = 0;
    downloadLink = "N/A";
  }

  // OVERLOADED CONSTRUCTOR
  public DigitalProduct(String name, String SKU, double cost, String fileType, String fileSizeUnit, int fileSize, String downloadLink) {
    super(name, SKU, cost);
    this.fileType = fileType;
    this.fileSizeUnit = fileSizeUnit;
    this.fileSize = fileSize;
    this.downloadLink = downloadLink;
  }

  // GETTER
  public String getFileType() {
    return fileType;
  }

  public String getFileSizeUnit() {
    return fileSizeUnit;
  }

  public int getFileSize() {
    return fileSize;
  }

  public String getDownloadLink() {
    return downloadLink;
  }

  // SETTER
  public void setFileType(String fileType){
    this.fileType = fileType;
  }

  public void setFileSizeUnit(String fileSizeUnit){
    this.fileSizeUnit = fileSizeUnit;
  }

  public void setFileSize(int fileSize){
    this.fileSize = fileSize;
  }

  public void setDownloadLink(String downloadLink){
    this.downloadLink = downloadLink;
  }

  // toString
  public String toString() {
    return super.toString() + ", File Type: " + fileType + ", File Size: " + fileSize + fileSizeUnit + ", Download Link: " + downloadLink;
  }

  // EDIT DETAILS
  public void editDetails(){
    super.editDetails();
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter new file type (e.g. PDF, DOC): ");
    String newFileType = sc.next();
    this.setFileType(newFileType);
    System.out.println();

    System.out.println("Enter new file size unit (e.g. KB, MB): ");
    String newFileSizeUnit = sc.next();
    this.setFileSizeUnit(newFileSizeUnit);
    System.out.println();

    System.out.println("Enter new file size (e.g. 200): ");
    int newFileSize = sc.nextInt();
    this.setFileSize(newFileSize);
    System.out.println();

    System.out.println("Enter new download link: ");
    String newDownloadLink = sc.next();
    this.setDownloadLink(newDownloadLink);
    System.out.println();
  }

  // SALES TAX
   public double calculateSalesTax(){
     return 0;
   }
}