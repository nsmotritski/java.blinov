public class Chapter1v2 {
    //finding greatest common divisor using the algorithm of Euclid
    public static int algorithmEuclid (int a, int b) {
        while (a != b) {
            if (a < b) {
                b = b - a;
            } else {
                a = a - b;
            }
        }
        return a;
    }

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

    /*public static void main(String[] args) {
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
    }*/

    //4. Числа, которые делятся на 5 и на 7.

    /*public static void main(String[] args) {
        int[] numbers = new int[10];
        System.out.println("Исходный массив:");
        for (int i = 0; i < 10; i++) {
            numbers[i]=(int)(Math.random()*100);
            System.out.print(numbers[i] + " ");

        }
        System.out.println();
        System.out.println("Multiples of 5:");
        for (int i: numbers) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("Multiples of 7:");
        for (int i: numbers) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
        }
    }*/

    //5. Элементы, расположенные методом пузырька по убыванию модулей.
    //Math.abs(); - method for absolute value
    /*public static void main(String[] args) {
        //Generating array
        int[] numbers = new int[10];
        System.out.println("Initial array:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=(int)(Math.random()*200 - 100);
            System.out.print(numbers[i] + " ");

        }
        //array sorting
        for (int j = 0; j < numbers.length;j++) {
            for (int i = 0; i < numbers.length;i++) {
                if (Math.abs(numbers[j]) > Math.abs(numbers[i])) {
                    numbers[j] = numbers[j] + numbers[i];
                    numbers[i] = numbers[j] - numbers[i];
                    numbers[j] = numbers[j] - numbers[i];
                }
            }
        }
        //array output to console
        System.out.println();
        System.out.println("Sorted array:");
        for (int i : numbers) {
            System.out.print(i + " ");
        }
    }*/

    //6. Все трехзначные числа, в десятичной записи которых нет одинаковых цифр.

    /*public static void main(String[] args) {
        //Generating array
        int[] numbers = new int[10];
        int[] digits = new int[3];
        int number;
        System.out.println("Initial array:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=(int)(Math.random()*1000);
            System.out.print(numbers[i] + " ");

        }
        System.out.println();
        System.out.println("Numbers with unique digits:");
        //finding numbers with unique digits
        for (int i = 0; i < numbers.length; i++) {
            number = numbers[i];
            if ((number >= 100) && (number <= 999)) {
                for (int j = 0; j < digits.length; j++) {
                    digits[j] = number % 10;
                    number = number/10;
                }
                if ((digits[0] != digits[1]) && (digits[0] != digits[2]) && (digits[1] != digits[2])) {
                    System.out.print(numbers[i] + " ");
                }
            }
        }
    }*/

    //7. Наибольший общий делитель и наименьшее общее кратное этих чисел.

    /*public static void main(String[] args) {
        //Generating array
        int[] numbers = new int[2];
        System.out.println("The two nummbers");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=(int)(Math.random()*1000);
            System.out.print(numbers[i] + " ");
        }
        int lcm, gcd;
        gcd = algorithmEuclid(numbers[0],numbers[1]);
        lcm = (numbers[0]*numbers[1])/gcd;
        System.out.println();
        System.out.println("greatest common divisor is: " + gcd);
        System.out.println();
        System.out.println("least common multiple is: " + lcm);
    }*/

    //8. Простые числа.

    /*public static void main(String[] args) {
        //Generating array
        int[] numbers = new int[] {65,37,719,55,981,521,727};
        System.out.println("Initial array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        boolean isPrime = true;
        //looking for the prime numbers
        System.out.println();
        System.out.println("Prime numbers are: " );
        for (int number : numbers) {
            for (int i = 2; i < (number/2); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(number + " ");
            }
            isPrime = true;
        }
    }*/

    //9. Отсортированные числа в порядке возрастания и убывания.

    /*public static void main(String[] args) {
        //Generating array
        int[] numbers = new int[] {65,37,719,55,981,521,727};
        System.out.println("Initial array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
//      array sorting ascending according to https://en.wikipedia.org/wiki/Insertion_sort
        int num;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < numbers [i-1]) {
                num = numbers[i];
                for (int j = i-1; j>=0; j--) {
                    if (num < numbers[j]) {
                        numbers[j+1] = numbers[j];
                        numbers[j] = num;
                    }
                }
            }
        }
        System.out.println();
        System.out.println("Array sorted ascending: " );
        for (int i: numbers) {
            System.out.print(i + " ");
        }
//        array sorting descending according to https://en.wikipedia.org/wiki/Insertion_sort
        int num2;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > numbers [i-1]) {
                num2 = numbers[i];
                for (int j = i-1; j>=0; j--) {
                    if (num2 > numbers[j]) {
                        numbers[j+1] = numbers[j];
                        numbers[j] = num2;
                    }
                }
            }
        }
        System.out.println();
        System.out.println("Array sorted descending: " );
        for (int i: numbers) {
            System.out.print(i + " ");
        }
    }*/

    //10. Числа в порядке убывания частоты встречаемости чисел.

    public static void main(String[] args) {
        //Generating array
        int[] numbers = new int[] {65,37,719,55,981,521,727};
        System.out.println("Initial array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
//      creating new array that contains frequencies of the numbers together with the numbers
        int[][] frequencies = new int[numbers.length][numbers.length];
        boolean updated = false;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j >= 0; j--) {
                if (numbers[i] == frequencies[j][0]) {
                    updated = true;
                    frequencies[j][1] += 1;
                }
            }
            if (!updated) {
                frequencies[i][0] = numbers[i];
                frequencies[i][1] = 1;
            }
        }
        System.out.println();
        System.out.println("Array sorted ascending: " );
        for (int i = 0; i < frequencies[1].length; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(frequencies[i][j] + " ");
            }
            System.out.println();
        }
    }

    //11. «Счастливые» числа.
    //12. Числа Фибоначчи: f0 = f1 = 1, f (n) = f (n–1) + f (n–2).
    //13. Числа-палиндромы, значения которых в прямом и обратном порядке совпадают.
    //14. Элементы, которые равны полусумме соседних элементов.
   /*15. Период десятичной дроби p = m/n для первых двух целых положительных
   чисел n и m, расположенных подряд.*/
    //16. Построить треугольник Паскаля для первого положительного числа.

}