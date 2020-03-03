import java.util.Scanner;

public class Task2 {

    static String name,town,hobbie;
    static int age;

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите ваше имя");
        name = sc.next();
        //Задваивает в дувайле принт. Баг, не знаю почему
        do {
            System.out.println("Введите город вашего фактического проживания");
        }while((town = sc.nextLine()).isBlank());
        do {
            System.out.println("Введите ваш возраст (от 10 до 99)");
            age = sc.nextInt();
        }
        while(age<10||age>99);
        //Задваивает в дувайле принт, без дувайла печатает следующий принт, а сканер считывает потом. Баг, не знаю почему
        do {
            System.out.println("Какое у вас хобби");
            hobbie = sc.nextLine();
        }while(hobbie.isEmpty());

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
        razd(40,'-');
        System.out.println("\nВариант 1 (табличный):");
        System.out.print("Имя:");
        //отступ зависит от длины переменной чтобы выровнять по правому краю
        razd(40-name.length()-4,' ');
        System.out.println(name);

        System.out.print("Город:");
        razd(40-town.length()-6,' ');
        System.out.println(town);

        System.out.print("Возраст:");
        razd(40-8-2,' ');
        System.out.println(age);

        System.out.print("Хобби:");
        razd(40-hobbie.length()-6,' ');
        System.out.println(hobbie);

        razd(40,'-');
        System.out.println();

    }

    public static void var2(){
        razd(60,'-');
        System.out.println("\nВариант 2 (тектовый):");
        System.out.println("Человек по имени "+name+" живёт в городе "+town);
        System.out.println("Этому человеку "+age+" лет и любит он заниматься "+hobbie);
        razd (60,'-');
        System.out.println();
    }

    public static void var3(){
        razd(40,'-');
        System.out.println("\nВариан 3 (иной):");
        System.out.println(name+" - имя");
        System.out.println(town+" - город");
        System.out.println(age+" - возраст");
        System.out.println(hobbie+" - хобби");
        razd(40,'-');
        System.out.println();
    }

    public static void razd(int a,char c)
    {
        if(a>0)
            for(int i=0;i<a;i++)
                System.out.print(c);
    }
}
