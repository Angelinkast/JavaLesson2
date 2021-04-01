import java.util.Scanner;

public class HomeWorkApp2 {

        public static void main(String[] args) {
            task1();
            task2();
            task3();
            task4();
            task5();
        }

        //Task1
        public static void task1() {
            System.out.println("Task #1");
            System.out.println("Input first number");
            Scanner scan = new Scanner(System.in);
            int a = scan.nextInt();
            scan.nextLine();
            System.out.println("Input second number");
            int b = scan.nextInt();
            int c = a + b;
            if (c >= 10 && c <= 20) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }

        //Task2
        public static void task2() {
            System.out.println("Task #2");
            System.out.println("Input number");
            Scanner scan = new Scanner(System.in);
            int a = scan.nextInt();
            if (a >= 0) {
                System.out.println("Положительное");
            } else {
                System.out.println("Отрицательное");
            }
        }

        //Task3
        public static void task3() {
            System.out.println("Task #2");
            System.out.println("Input number");
            Scanner scan = new Scanner(System.in);
            int a = scan.nextInt();
            if (a < 0) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }

        //Task4
        public static void task4() {
            System.out.println("Task #4");
            System.out.println("Сколько раз повторить строку?");
            Scanner scan = new Scanner(System.in);
            int i = scan.nextInt();
            for (int a = 0; a < i; a++) {
                int b = a + 1;
                System.out.println(b + ". Нормально делай - нормально будет!");
            }

        }

        //Task5 - Вот тут вопросики!!!
        public static void task5() {
            System.out.println("Task #5");
            System.out.println("Введите год:");
            Scanner scan = new Scanner(System.in);
            int a = scan.nextInt();
            if ((a % 4 == 0) && (a % 400 == 0) && (a % 100 != 0)) {
                System.out.println(a + "високосный год");
            }
            else {
                System.out.println("false");
            }
        }
    }
