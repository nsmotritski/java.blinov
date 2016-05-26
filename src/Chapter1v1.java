import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Chapter1v1 {

    //1. Приветствовать любого пользователя при вводе его имени через командную строку.
   /*public static void main(String[] args) {
       System.out.println("What is you name?");
       Scanner scan = new Scanner(System.in);
       String name = scan.next();
       System.out.println("Hello, " + name + "!");
   }*/

    //2. Отобразить в окне консоли аргументы командной строки в обратном порядке.
   /*public static void main(String[] args) {
       for (int i= args.length; i >=0; i--) {
           System.out.println("Aргумент-> " + args[i]);
       }
   }*/

    //3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.
   /*public static void main(String[] args) {
       System.out.println("Enter how many random numbers do you want to generate");
       Scanner scan = new Scanner(System.in);
       Integer number = new Integer(scan.next());
       for (int i=0; i <number; i++) {
           System.out.println((int)(Math.random()*100)); //with new string
           //System.out.println((int)(Math.random()*100) + " "); //in one string
       }
   }*/

    //4.Ввести пароль из командной строки и сравнить его со строкой-образцом.
   /*public static void main(String[] args) {
       System.out.println("Enter a password");
       Scanner scan = new Scanner(System.in);
       String password = scan.next();
       System.out.println("Enter the password");
       String password2 = scan.next();
       if (password2.equals(password)) {
           System.out.println("The passwords match");
       } else {
           System.out.println("The passwords don't match");
       }
   }*/

       /*5.Ввести целые числа как аргументы командной строки, подсчитать их сум-
       мы (произведения) и вывести результат на консоль.*/
       /*public static void main(String[] args) {
           Integer sum = 0, prod = 1;
           for (int i = 0; i < args.length; i++) {
               System.out.println("Argument->" + args[i]);
               sum += Integer.parseInt(args[i]);
               prod *= Integer.parseInt(args[i]);
           }
           System.out.println("Sum = " + sum);
           System.out.println("Product = " + prod);
       }*/



    /*6.Вывести фамилию разработчика, дату и время получения задания, а также
    дату и время сдачи задания.*/
    /*public static void main(String[] args) {
        String devSurname = new String("Smotritski");
        System.out.println("Developer - " + devSurname);
        DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        Date dateTimeTaskReceived = new Date();
        System.out.println("Task Received - " + df.format(dateTimeTaskReceived));
        Date dateTimeTaskFinished = new Date();
        System.out.println("Task Completed - " + df.format(dateTimeTaskFinished));

    }*/
}