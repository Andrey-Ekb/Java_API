// Задание 2. Вывести все простые числа от 1 до 1000

import java.util.Scanner;
    
public class task_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);  
        System.out.print("Введите число (0-10000): ");
        int kont = sc.nextInt();
        sc.close();
        // int[] arr = new int[] {2,3,5,7};
        for(int i=1; i < kont; i++){ 
            if ((i % 2) !=0){
                if ((i % 3) != 0){
                        if (i % 5 != 0){
                            if(i % 7 != 0){
                            System.out.printf(" %d\t", i);
                        }
                    }
                }
            }
        }
    }
}