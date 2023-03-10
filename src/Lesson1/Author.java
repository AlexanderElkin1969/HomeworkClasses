package Lesson1;

public class Author {
    private String lastName;
    private String firstName;
    private String middleName;
    public static int size = 0;
    public Author(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        size ++;
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
    public int getSize() {
        return size;
    }
    public String getName() {
        return lastName+" "+firstName.charAt(0)+"."+middleName.charAt(0)+".";
    }
    @Override
    public String toString() {
        return lastName+" "+firstName+" "+middleName;
    }
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        return this.toString().equals(other.toString());
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(lastName);
    }
}
