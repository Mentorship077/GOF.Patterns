package creational.builder;

import creational.builder.first.PersonDto1;
import creational.builder.first.GenericBuilder;
import creational.builder.second.PersonDto2;

public class Main {
    public static void main(String[] args) {

        // approach 1
        PersonDto1 value = GenericBuilder.of(PersonDto1::new)
                .with(PersonDto1::setFirstname, "Otto")
                .with(PersonDto1::setAge, 5).build();

        // fit approach 2
        PersonDto2 personDto2 = new PersonDto2();
        personDto2
                .setFirstname("vfd")
                .setLastname("vfd");

    }
}
