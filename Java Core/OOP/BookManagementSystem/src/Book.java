public class Book implements IBook{

   private static int idCounter = 1;
   private int id;

   private String name;

   private String publishDate;

   private String author;

   private String language;

   private float averagePrice;

   private int[] priceList = new int[5];

   public Book(String name, String publishDate, String author, String language, int[] priceList) {
      this.id = idCounter++;
      this.name = name;
      this.publishDate = publishDate;
      this.author = author;
      this.language = language;
      this.priceList = priceList;
      calculate();
   }

   @Override
   public void display() {
      System.out.println("Book ID: " + id);
      System.out.println("Name: " + name);
      System.out.println("Published Date: " + publishDate);
      System.out.println("Author: " + author);
      System.out.println("Language: " + language);
      System.out.println("Average Price: $" + averagePrice);
   }

   public float getAveragePrice() {
      return averagePrice;
   }

   public void calculate() {
      int sum = 0;
      for(int price : priceList) {
         sum +=price;
      }
      averagePrice = (float) sum /priceList.length;
   };


}
