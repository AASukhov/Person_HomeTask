public class PersonBuilder {
    String name;
    String surname;
    int age;
    String address;


    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (surname == null) throw new IllegalStateException("Не указана фамилия");
        if (age < 0) throw new IllegalArgumentException("Возраст указан неверно");
        return new Person(name, surname, age, address);
    }

}

