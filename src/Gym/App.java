package Gym;
import java.util.Date;
public class App {
    public static void main(String[] args) {
            Fitness fitnessClub = new Fitness();

            People visitor1 = new People("Иван", "Иванов", 1990);
            People visitor2 = new People("Петр", "Петров", 1985);
            People visitor3 = new People("Ирина", "Иванова", 2000);
            People visitor4 = new People("Василий", "Петров", 1995);
            People visitor5 = new People("Инга", "Иванова", 1992);
            People visitor6 = new People("Виктор", "Васильевич", 1984);


            Subscription dailyAbonement = new Subscription(visitor1, new Date(), new Date(new Date().getTime() + 24 * 60 * 60 * 1000));
            Subscription fullAbonement = new Subscription(visitor2, new Date(), new Date(new Date().getTime() + 30 * 24 * 60 * 60 * 1000));

            fitnessClub.visit(visitor1, dailyAbonement, "pool");
            fitnessClub.visit(visitor2, fullAbonement, "gym");
            fitnessClub.visit(visitor3, fullAbonement, "group");
            fitnessClub.visit(visitor4, fullAbonement, "gym");
            fitnessClub.visit(visitor5, fullAbonement, "group");
            fitnessClub.visit(visitor6, fullAbonement, "gym");

        }

    }

