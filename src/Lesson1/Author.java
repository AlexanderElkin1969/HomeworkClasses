package Lesson1;

public class Author {
    private String lastName;
    private String firstName;
    private String middleName;
    public Author(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getMiddleName() {
        return middleName;
    }
    public String getFullName() {
        return lastName+" "+firstName+" "+middleName;
    }
    public String getName() {
        return lastName+" "+firstName.charAt(0)+"."+middleName.charAt(0)+".";
    }
}
