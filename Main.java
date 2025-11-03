public class Main {
   private boolean dateChecked;
   
   public Main() {
   dateChecked = false;
   }
  
  
   public boolean checkDate(int month1, int day1, int month2, int day2) {
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
      Main object2 = new Main();
      Main object3 = new Main();
      Main object4 = new Main();
      boolean printYes = object1.checkDate(6, 3, 9, 20);
      boolean printYes2 = object2.checkDate(10, 1, 2, 25);
      boolean printYes3 = object3.checkDate(8, 15, 8, 15);
      boolean printYes4 = object4.checkDate(8, 15, 8, 16);
      System.out.println(printYes);
      System.out.println(printYes2);
      System.out.println(printYes3);
      System.out.println(printYes4);
   }
}