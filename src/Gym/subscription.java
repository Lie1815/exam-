package Gym;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class subscription {

    static class Abonement {
        private String ownerFirstName;
        private String ownerLastName;
        private int ownerBirthYear;
        private Date registrationDate;
        private Date expirationDate;

        public Abonement(String ownerFirstName, String ownerLastName, int ownerBirthYear, Date registrationDate, Date expirationDate) {
            this.ownerFirstName = ownerFirstName;
            this.ownerLastName = ownerLastName;
            this.ownerBirthYear = ownerBirthYear;
            this.registrationDate = registrationDate;
            this.expirationDate = expirationDate;
        }

        public Date getExpirationDate() {
            return null;
        }

        public boolean getOwnerFirstName() {
            return false;
        }

        public Object getOwnerLastName() {
            return null;
        }

        public Object getRegistrationDate() {
            return null;
        }

        // геттеры для полей
    }

    static class FitnessClub {
        private List<Abonement> gymAbonements = new ArrayList<>();
        private List<Abonement> poolAbonements = new ArrayList<>();
        private List<Abonement> groupClassAbonements = new ArrayList<>();
        private int maxCapacity = 20;

        public void addAbonement(Abonement abonement, String zone, Date currentTime) {
            if (abonement.getExpirationDate().before(currentTime)) {
                System.out.println("Абонемент просрочен");
                return;
            }

            List<Abonement> targetZone;
            if (zone.equals("gym")) {
                targetZone = gymAbonements;
            } else if (zone.equals("pool")) {
                targetZone = poolAbonements;
            } else if (zone.equals("group")) {
                targetZone = groupClassAbonements;
            } else {
                System.out.println("Недопустимая зона");
                return;
            }

            if (targetZone.size() >= maxCapacity) {
                System.out.println("В данной зоне нет свободных мест");
                return;
            }

            if (gymAbonements.contains(abonement) || poolAbonements.contains(abonement) || groupClassAbonements.contains(abonement)) {
                System.out.println("Абонемент уже зарегистрирован в другой зоне");
                return;
            }

            targetZone.add(abonement);
        }

        public void showVisitors() {
            System.out.println("Посетители зала:");
            for (Abonement abonement : gymAbonements) {
                System.out.println(abonement.getOwnerFirstName() + " " + abonement.getOwnerLastName() +
                        " - зарегистрирован с " + abonement.getRegistrationDate() + " по " + abonement.getExpirationDate());
            }

            System.out.println("\nПосетители бассейна:");
            for (Abonement abonement : poolAbonements) {
                System.out.println(abonement.getOwnerFirstName() + " " + abonement.getOwnerLastName() +
                        " - зарегистрирован с " + abonement.getRegistrationDate() + " по " + abonement.getExpirationDate());
            }

            System.out.println("\nПосетители групповых занятий:");
            for (Abonement abonement : groupClassAbonements) {
                System.out.println(abonement.getOwnerFirstName() + " " + abonement.getOwnerLastName() +
                        " - зарегистрирован с " + abonement.getRegistrationDate() + " по " + abonement.getExpirationDate());
            }
        }
    }

    public class Main {
        public static void main(String[] args) {
            FitnessClub fitnessClub = new FitnessClub();

            Abonement abonement1 = new Abonement("Иван", "Иванов", 1990, new Date(), new Date());
            Abonement abonement2 = new Abonement("Петр", "Петров", 1985, new Date(), new Date());

            fitnessClub.addAbonement(abonement1, "gym", new Date());
            fitnessClub.addAbonement(abonement2, "pool", new Date());
            fitnessClub.addAbonement(abonement1, "group", new Date());

            fitnessClub.showVisitors();
        }
    }

}
