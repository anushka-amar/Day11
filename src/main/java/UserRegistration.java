public class UserRegistration {

    private String firstName;
    private String lastname;
    private String email;
    private String phone_number;

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

    public void setEmail(String email){
        if(isValidEmail(email)){
            this.email = email;
            return;
        }
        System.out.println("Email address invalid");
    }

    public void setPhone_number(String phone_number){
        if(isValidPhNumber(phone_number)){
            this.phone_number = phone_number;
            return;
        }
        System.out.println("please enter a valid phone number with country code");
    }
    public boolean isValidFirstName(String firstName){
        String test = "^[A-Z][a-zA-z]{2,}$";
        return firstName.matches(test);
    }

    public boolean isValidEmail(String email){
        String test = "^[a-z]+(\\.[a-z]+)*@([a-z]+\\.)+[a-z]{2,7}";
        return email.matches(test);
    }

    public boolean isValidPhNumber(String phone_number){
        return false;
    }
    public void displayUser(){
        System.out.println("Name: "+firstName+" "+lastname);
        System.out.println("Email: "+email);
    }

    public static void main(String[] args) {
        UserRegistration user = new UserRegistration();
        user.setFirstName("Anushka");
        user.setLastName("Amar");
        user.setEmail("anushka.amar@java.gmail.com");
        user.displayUser();
    }
}
