import java.time.LocalDate;

public class User {
    protected String name;
    protected LocalDate dob;
    public User(){
        this.name = null;
        this.dob = LocalDate.now();
    }

    public User(String name, int year, int month, int dayOfMonth) {
        this.name = name;
        this.dob = LocalDate.of(year,month,dayOfMonth);
    }

    public void displayInfo(){
        System.out.println("User Info: " + name + ",Date of Birth: "+ dob );

    }
    
    public boolean isBirthday(){
        LocalDate today = LocalDate.now();
        return today.getDayOfMonth() == this.dob.getDayOfMonth() && today.getMonthValue() == this.dob.getMonthValue();
    }

    public void displayHappyBirthday() {
        if(isBirthday())
          System.out.println("Happy birthday " + this.name + "!");

          
      }
 
}