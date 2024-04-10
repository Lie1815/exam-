package Gym;
import java.time.LocalDate;
import java.util.Date;
public class Subscription {
        private People owner;
        private Date registrationDate;
        private Date expirationDate;

        public Subscription(People owner, Date registrationDate, Date expirationDate) {
            this.owner = owner;
            this.registrationDate = registrationDate;
            this.expirationDate = expirationDate;
        }

        public People getOwner() {
            return owner;
        }

        public Date getRegistrationDate() {
            return registrationDate;
        }

        public Date getExpirationDate() {
            return expirationDate;
        }
    }

