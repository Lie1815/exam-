package Gym;
public class Fitness {
        private FitnessZone gym = new FitnessZone("зале");
        private FitnessZone pool = new FitnessZone("бассейне");
        private FitnessZone group = new FitnessZone("групповых занятиях");

        public boolean checkAccess(Subscription abonement, String zone) {
            return true;
        }

        public void visit(People visitor, Subscription abonement, String zone) {
            FitnessZone selectedZone = null;
            switch (zone) {
                case "gym":
                    selectedZone = gym;
                    break;
                case "pool":
                    selectedZone = pool;
                    break;
                case "group":
                    selectedZone = group;
                    break;
            }

            if (selectedZone != null) {
                if (checkAccess(abonement, zone)) {
                    selectedZone.registerAbonement(abonement);
                    System.out.println(visitor.getFirstName() + " " + visitor.getLastName() + " успешно посещает " + zone);
                } else {
                    System.out.println("Посещение не возможно для " + visitor.getFirstName() + " " + visitor.getLastName());
                }
            } else {
                System.out.println("Неверно указана зона");
            }
        }
    }
