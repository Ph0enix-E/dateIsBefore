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
      boolean printYes = object1.checkDate(2, 20, 3, 20);
      if (printYes == true) {
      System.out.println("Date is before");
      }
      else {
      System.out.println("Date isn't before");
      }
   }
}