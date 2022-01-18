package task1;

public class PersonBuilder {

    private String name;
    private String surname;
    private int age;
    private String address;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(Integer age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {

        if (name == null || surname == null) {
            throw new IllegalArgumentException("Not name or surname");
        }
        if (age < 0) {
            throw new IllegalArgumentException("Not correct age");
        }

        return new Person(name, surname, age, address);
    }
}



