package Mountains;

import Mountains.Mount;
import Mountains.People;
import java.util.Scanner;
import java.util.ArrayList;
public class Group {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        People[] arrPeople = new People[8];
        People[] firstGroup = new People[3];
        People[] secondGroup = new People[3];
        People[] thirdGroup = new People[3];

        People Asya = new People("Ася", 19, "СПБ");
        People Vlad = new People("Влад", 20, "Москва");
        People Greta = new People("Грета", 34, "СПБ");
        People Denis = new People("Денис", 18, "Элден");
        People Eve = new People("Ева", 25, "Варшава");
        People Ivan = new People("Иван", 30, "СПБ");
        People Caroline = new People("Каролина", 17, "Германия");
        People Zigrit = new People("Зигрит", 20, "Германия");


        Mount elbrus = new Mount("Эльбрус", "Россия", 5600);
        Mount everest = new Mount("Эверест", "Тибет", 8800);
        Mount alpes = new Mount("Альпы", "Швейцария", 4800);

        arrPeople[0] = Asya;
        arrPeople[1] = Vlad;
        arrPeople[2] = Greta;
        arrPeople[3] = Denis;
        arrPeople[4] = Eve;
        arrPeople[5] = Ivan;
        arrPeople[6] = Caroline;
        arrPeople[7] = Zigrit;

        firstGroup[0] = Asya;
        firstGroup[1] = Denis;
        firstGroup[2] = Caroline;

        secondGroup[0] = Vlad ;
        secondGroup[1] = Eve;
        secondGroup[2] = Ivan;

        thirdGroup[0] = Zigrit;
        thirdGroup[1] = Greta;

        String name;
        int age;
        String Addres;

    System.out.println("список всех альпинистов: ");
    for (People p: arrPeople){
        System.out.println(p.getName()+ ", " +p.getAge()+","+ p.getAddress());
    }
    System.out.println("Идет набор в группу или нет?");
    String a = sc.nextLine();
    if (a.equalsIgnoreCase("да") || a.equalsIgnoreCase("if")){
        System.out.println("выберите одну из трех групп (1, 2, 3), чтобы добавить нового члена группы: ");
        int b = sc.nextInt();
        switch (b){
            case 1:
                if (firstGroup[0] != null || firstGroup[1] != null || firstGroup[2] != null){
                    System.out.println("группа заполнена");
                }else {
                System.out.println("Введите нового члена группы:");

                People newp = new People("Игорь", 23, "Минск");
                firstGroup[2] = newp;
            }
            break;
            case 2:
                if (secondGroup[0] != null || secondGroup[1] != null || secondGroup[2] != null){
                    System.out.println("Группа заполнена");
                }else {
                    System.out.println("Введите нового члена группы:");

                    People newp = new People("Илья", 34, "СПБ");
                    secondGroup[2] = newp;
                }
                break;
            case 3:
                if (thirdGroup[0] != null || thirdGroup[1] != null || thirdGroup[2] != null){
                    System.out.println("Группа заполнена");
                }else {
                    System.out.println("Введите нового члена группы:");

                    People newp = new People ("Дмитрий", 18, "Минск");
                    thirdGroup[2] = newp;
                }
                break;
            default:
                System.out.println("Неверный выбор");
                break;
        }
        System.out.println("Выберите группу для вывода(1, 2, 3):");
        int c = sc.nextInt();
        switch (c){
            case 1:
                for (People f : firstGroup){
                    System.out.println(f.getName()+", "+f.getAge()+" лет, из города "+f.getAddress());

                }
                System.out.println(elbrus.getName());
                break;
            case 2:
                for (People s : secondGroup){
                    System.out.println(s.getName()+", "+s.getAge()+" лет, из города "+s.getAddress());

                }
                System.out.println(everest.getName());
                break;
            case 3:
                for (People t : thirdGroup){
                    System.out.println(t.getName()+", "+t.getAge()+" лет, из города "+t.getAddress());

                }
                System.out.println(alpes.getName());
                //break;
        }

    }
    }
}