public class UserRegistration {

    private String firstName;

    public void setFirstName(String firstName){
        if(isValidFirstName(firstName)){
            this.firstName = firstName;
            return;
        }
        System.out.println("Enter valid first name");
    }
    public boolean isValidFirstName(String firstName){
        String test = "^[A-Z][a-zA-z]{2,}$";
        return firstName.matches(test);
    }
    public void displayUser(){
        System.out.println(firstName);
    }

    public static void main(String[] args) {
        UserRegistration user = new UserRegistration();
        user.setFirstName("Anushka");
        user.displayUser();
    }
}
