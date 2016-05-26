public class Chapter1v2 {

    //Вариант В

    //Ввести с консоли n целых чисел. На консоль вывести:
    //1. Четные и нечетные числа.

    /*public static void main(String[] args) {
        int[] numbers = new int[10];
        System.out.println("Исходный массив:");
        for (int i = 0; i < 10; i++) {
            numbers[i]=(int)(Math.random()*100);
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println("Чётные:");
        for (int i:numbers) {
            if (i % 2 == 0) {
                System.out.print(" " + i);
            }
        }
        System.out.println();
        System.out.println("Нечётные:");
        for (int i:numbers) {
            if (i % 2 == 1) {
                System.out.print(" " + i);
            }
        }
    }*/

    //2. Наибольшее и наименьшее число.

    /*public static void main(String[] args) {
        int[] numbers = new int[10];
        System.out.println("Исходный массив:");
        for (int i = 0; i < 10; i++) {
            numbers[i]=(int)(Math.random()*100);
            System.out.print(numbers[i] + " ");

        }
        int max = numbers[0], min = numbers[0];
        for (int i: numbers) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        System.out.println();
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }*/

    //3. Числа, которые делятся на 3 или на 9.

    public static void main(String[] args) {
        int[] numbers = new int[10];
        System.out.println("Исходный массив:");
        for (int i = 0; i < 10; i++) {
            numbers[i]=(int)(Math.random()*100);
            System.out.print(numbers[i] + " ");

        }
        System.out.println();
        System.out.println("Multiples of 3:");
        for (int i: numbers) {
            if (i % 3 == 0 && i % 9 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("Multiples of 9:");
        for (int i: numbers) {
            if (i % 9 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    //4. Числа, которые делятся на 5 и на 7.
    //5. Элементы, расположенные методом пузырька по убыванию модулей.
    //6. Все трехзначные числа, в десятичной записи которых нет одинаковыхцифр.
    //7. Наибольший общий делитель и наименьшее общее кратное этих чисел.
    //8. Простые числа.
    //9. Отсортированные числа в порядке возрастания и убывания.
    //10. Числа в порядке убывания частоты встречаемости чисел.
    //11. «Счастливые» числа.
    //12. Числа Фибоначчи: f0 = f1 = 1, f (n) = f (n–1) + f (n–2).
    //13. Числа-палиндромы, значения которых в прямом и обратном порядке совпадают.
    //14. Элементы, которые равны полусумме соседних элементов.
   /*15. Период десятичной дроби p = m/n для первых двух целых положительных
   чисел n и m, расположенных подряд.*/
    //16. Построить треугольник Паскаля для первого положительного числа.

}