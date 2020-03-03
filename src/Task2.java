import java.util.Scanner;

public class Task2 {

    static String name,town,hobbie;
    static int age;

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println(" ");
        name=sc.next();
        System.out.println(" ");
        town =sc.nextLine();
        System.out.println(" ");
        age =sc.nextInt();
        System.out.println(" ");
        hobbie=sc.nextLine();
        System.out.println(" ");

        System.out.println("Выберите вариант вывода введя число от 1 до 3 включительно");
        while (true) {
            switch (sc.next()) {
                case "1":
                    var1();
                    break;
                case "2":
                    var2();
                    break;
                case "3":
                    var3();
                    break;
                default:
                    System.out.println("нужно указать вариант вывода числом 1, 2 или 3");
            }
        }
    }

    public static void var1() {
        

    }

    public static void var2(){

    }

    public static void var3(){

    }

}
