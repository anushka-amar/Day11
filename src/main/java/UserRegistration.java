public class UserRegistration {

    private String firstName;
    private String lastname;
    private String email;
    private String phone_number;
    private String password;

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

    public void setPassword(String password){
        if(isValidPassword(password)){
            this.password = password;
            return;
        }
        System.out.println("Enter a valid password");
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
        String test = "^([0-9]{2}) ([0-9]{10})$";
        return phone_number.matches(test);
    }

    public boolean isValidPassword(String password){
        String test = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$*&]).{8,}$";
        return password.matches(test);
    }
    public void displayUser(){
        System.out.println("Name: "+firstName+" "+lastname);
        System.out.println("Email: "+email);
        System.out.println("Phone Number: "+phone_number);
        System.out.println("Password: "+password);
    }

    public static void main(String[] args) {
        UserRegistration user = new UserRegistration();
        user.setFirstName("Anushka");
        user.setLastName("Amar");
        user.setEmail("anushka.amar@java.gmail.com");
        user.setPhone_number("91 8969492195");
        user.setPassword("vaLidpw@123");
        user.displayUser();
    }
}
