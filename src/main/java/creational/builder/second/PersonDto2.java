package creational.builder.second;

public class PersonDto2 {
    private String firstname;
    private String lastname;
    private String age;

    public PersonDto2() {
    }

    public String getFirstname() {
        return firstname;
    }

    public PersonDto2 setFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public String getLastname() {
        return lastname;
    }

    public PersonDto2 setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public String getAge() {
        return age;
    }

    public PersonDto2 setAge(String age) {
        this.age = age;
        return this;
    }
}
