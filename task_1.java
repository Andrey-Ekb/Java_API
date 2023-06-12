// * Урок 1. Знакомство с языком программирования Java
// **/

// // Задание 1. Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;
    
public class task_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);  
        System.out.println("");
        System.out.print("Введите число (0-15): ");
        int n = sc.nextInt();
        int p = 1;
        int t = 0;
        if (n<16){ 
            for (int i = 0; i <= n; i++) {
                if (i != 0) {
                    p = p * i;
                    t = t + i; 
                }
        }
        System.out.printf("треугольное число = %d \n", p);
        System.out.printf("произведение числа = %d\n", t);      
        sc.close();
        }
    System.out.println("");
    }
}