public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.print("\n ");
        for (int i = 0; i <= 10; i++) {
            System.out.print(" " + i);
        }
        // Задание 2
        System.out.print("\n ");
        for (int i = 10; i > 0; i--) {
            System.out.print(" " + i);
        }
        // Задание 3
        System.out.print("\n ");
        for (int i = 0; i < 17; i = i + 2) {
            System.out.print(" " + i);
        }
        // Задание 4
        System.out.print("\n ");
        for (int i = 10; i >= -10; i--) {
            System.out.print(" " + i);
        }
        // Задание 5
        int year = 1904;
        System.out.print("\n");
        for (; year <= 2096; year = year + 4) {
            System.out.println(year + " год является высокосным");
        }
        // Задание 6
        System.out.print(" ");
        for (int i = 0; i <= 98; i = i + 7) {
            System.out.print(" " + i);
        }
        // Задание 7
        System.out.print("\n  ");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.print(" " + i);
        }
        // Задание 8
        int bankAccountIncome = 29000;
        int total = 0;
        System.out.print("\n");
        for (int i = 1;i<=12 ; i++) {
            total=total+bankAccountIncome;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей" );
        }
        // Задание 9!
        float bankAccountIncome2 = 29000;
        float total_2 = 0;
        float bankPercent = 0.01f;
        System.out.print("\n");
        for (int i = 1;i<=12 ; i++) {
            float percentIncome = total_2 *bankPercent;
            total_2 = total_2 + percentIncome +bankAccountIncome2;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total_2 + " рублей" );
        }
        // Задание 10!
        int multiplier = 2;
        int number = 1;
        for (int i = 1; i<=20; i=number*multiplier) {
            System.out.println(multiplier + " * " +  number + " = " + i);
            number = number+1;
        }
    }
}