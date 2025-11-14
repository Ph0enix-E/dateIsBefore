public class Algorithims {
   public static void main(String[] args) {
   int n = 42;
   int x = 1;
   double average = 0;
   while (x <= n) {
   average += x;
   x += 1;
   }
   average /= n;
   System.out.println(average);
   }
}