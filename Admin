import java.time.LocalDate;

public class Admin extends User {
    public Admin(){
        super();
    }
    public Admin(String name,int year,int month,int dayOfMonth){
        super(name,year,month,dayOfMonth);}

    public void displayInfo() {
            super.displayInfo();
            System.out.println("User type: admin");
        }
    public void displayInfo(boolean full) {
            if (full) {
                System.out.println("Admin Info: " + name + ",Date of Birth: "+ dob );
                System.out.println("User type: admin" + ",Today's Date: " + LocalDate.now());
            } else {

                System.out.println("Admin Name: " + name);
            }
        }
        public void displayHappyBirthday() {
            int age = LocalDate.now().getYear() - dob.getYear();;
            if(isBirthday()) {
              System.out.println("Happy birthday " + this.name + "! You are " + age + "!");
            }
          }

          
    }
    