public class Main {
    public static void main(String[] args) {
        // Домашнее задание 1
        System.out.println("Домашнее задание 1");
        // Задание 1
        System.out.println("Задание 1");
        int i = 0;
        int accumulation = 15000;
        int total = 0;
        while (total < 2_459_000) {
            total = total + total / 100;
            total = total + accumulation;
            System.out.println("Месяц " + i + " Итого " + total);
            i++;
        }

        // Задание 2
        System.out.println("Задание 2");
        int i2 = 1;
        while ( i2<=10 ) {
            System.out.print(i2 + " ");
            i2++;
        }
        System.out.println();
        for (int i3 = 10; i3 > 0; i3--) {
            System.out.print(i3 + " ");
        }
        // Задание 3
        System.out.println("Задание 3");
        int population = 12_000_000;
        int oneYearBorn = population / 1000 * 17;
        int oneYearDeath = population / 1000 * 8;
        int i4 = 1;
        while (i4 <=10) {
            population = population + oneYearBorn - oneYearDeath;
            System.out.println("Год " + i4 + " ,численность населения составляет " + population);
            i4++;
        }

        // Домашнее задание 2
        System.out.println("Домашнее задание 2");
        // Задание 1 и 2
        System.out.println("Задание 1 и 2");
        int total1 = 0;
        int i5 = 1;
        int accumulation1 = 15000;
        while (total1 < 12_000_000) {
            total1 = total1 + total1 /100 *7;
            total1 = total1 + accumulation1;
            if (i5 % 6 == 0) {
                System.out.println("Месяц " + i5 + " Итого: " + total1);
            }
            i5++;
        }
        // Задание 3
        System.out.println("Задание 3");
        int total2 = 0;
        int accumulation2 = 15000;
        for (int i6 = 1; i6 <= 108; i6++) {
            total2 = total2 + total2 /100 *7;
            total2 = total2 + accumulation2;
            if (i6 % 6 == 0) {
                System.out.println("Месяц " + i6 + " Итого: " + total2);
            }
        }
        // Домашнее задание 3
        System.out.println("Домашнее задание 3");
        // Задание 1
        System.out.println("Задание 1");

        for (int i7 = 2022-200; i7 <=2022 + 100; i7++) {
            if (i7 % 79 == 0) {
                System.out.println(i7);
            }
        }
        // Задание 2
        System.out.println("Задание 2");
        int total3 = 1;
        for (int i8 = 1; i8 <= 10; i8++) {
            total3 = i8 * 2;
            System.out.println("2*"+ i8 + " = " + total3);

        }



    }
}