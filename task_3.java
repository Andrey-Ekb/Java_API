import java.util.Scanner;
public class task_3 {
   public static void main(String[] args) {
      double num1;
      double num2;
      double ans;
      char op;
      Scanner reader = new Scanner(System.in);
      System.out.println("\n");
      System.out.print("Введите первое число: ");
      num1 = reader.nextDouble();
      System.out.print("Введите второе число: ");
      num2 = reader.nextDouble();
      System.out.print("\n Введите оператор (+, -, *, /): ");
      op = reader.next().charAt(0);
      reader.close();
      switch(op) {
         case '+': ans = num1 + num2;
            break;
         case '-': ans = num1 - num2;
            break;
         case '*': ans = num1 * num2;
            break;
         case '/': ans = num1 / num2;
            break;
         default:  System.out.printf("Такой оператор не используется");
            return;
      }
      System.out.print("\n Результат равер : ");
      System.out.printf(num1 + " " + op + " " + num2 + " = " + "%.2f", ans);
      System.out.println("\n");
   }
}