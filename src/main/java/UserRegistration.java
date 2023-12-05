public class UserRegistration {

    private String firstName;
    private String lastname;
    private String email;

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
    public boolean isValidFirstName(String firstName){
        String test = "^[A-Z][a-zA-z]{2,}$";
        return firstName.matches(test);
    }

    public boolean isValidEmail(String email){
        String test = "^[a-z]+(\\.[a-z]+)*@([a-z]+\\.)+[a-z]{2,7}";
        return email.matches(test);
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
