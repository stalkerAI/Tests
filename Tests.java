//Задача 1. Задайте значения M и N.
// Напишите программу, которая выведет все натуральные числа в промежутке от M до N.


public class Main {
    public static void main(String[] args) {
        int m = 5;
        int n = 10;

        for (int i = m; i <= n; i++) {
            System.out.println(i);
        }
    }
    //Задание 2. Напишите программу вычисления функции Аккермана с помощью рекурсии.
// Даны два неотрицательных числа m и n.
    public class Main {
        public static int ackermann(int m, int n) {
            if (m == 0) {
                return n + 1;
            } else if (n == 0) {
                return ackermann(m - 1, 1);
            } else {
                return ackermann(m - 1, ackermann(m, n - 1));
            }
        }


        public static void main(String[] args) {
            int m = 3;
            int n = 2;

            int result = ackermann(m, n);
            System.out.println("The value of the Ackermann function for m = " + m + " and n = " + n + " is: " + result);
        }
    }
    //Задание 3. Задайте произвольный массив на java.
// Выведете его элементы, начиная с конца.
// Использовать рекурсию, не использовать циклы.
    public class Main {
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5};
            printArrayReverse(arr, arr.length - 1);
        }

        public static void printArrayReverse(int[] arr, int index) {
            if (index >= 0) {
                System.out.println(arr[index]);
                printArrayReverse(arr, index - 1);
            }
        }
    }
        }
