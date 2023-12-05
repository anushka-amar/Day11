public class UserRegistration {

    private String firstName;
    private String lastname;

    public void setFirstName(String firstName){
        if(isValidFirstName(firstName)){
            this.firstName = firstName;
            return;
        }
        System.out.println("Enter valid first name");
    }
    public void setLastName(String lastName){
        if(isValidFirstName(lastName)){
            this.lastname = lastName;
            return;
        }
        System.out.println("Enter valid last name");
    }
    public boolean isValidFirstName(String firstName){
        String test = "^[A-Z][a-zA-z]{2,}$";
        return firstName.matches(test);
    }
    public void displayUser(){
        System.out.println("Name: "+firstName+" "+lastname);
    }

    public static void main(String[] args) {
        UserRegistration user = new UserRegistration();
        user.setFirstName("Anushka");
        user.setLastName("Amar");
        user.displayUser();
    }
}
