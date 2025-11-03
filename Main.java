public class Main {
   private boolean dateChecked;
   
   public Main() {
   dateChecked = false;
   }
  
  
   public boolean dateIsBefore(int month1, int day1, int month2, int day2) {
   boolean lesserDate = false;
   if (month1 < month2) {
      lesserDate = true;
   }
   else if (month1 == month2) {
      if (day1 < day2) {
         lesserDate = true;
         }
         else {
         lesserDate = false;
         }
   }
   else {
      lesserDate = false;
   }
   return lesserDate;
   }
   
   public static void main(String[] args) {
      Main object1 = new Main();
      boolean printYes = object1.dateIsBefore(6, 3, 9, 20);
      boolean printYes2 = object1.dateIsBefore(10, 1, 2, 25);
      boolean printYes3 = object1.dateIsBefore(8, 15, 8, 15);
      boolean printYes4 = object1.dateIsBefore(8, 15, 8, 16);
      System.out.println(printYes);
      System.out.println(printYes2);
      System.out.println(printYes3);
      System.out.println(printYes4);
   }
}