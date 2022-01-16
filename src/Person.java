public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String address;

    public Person (String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person (String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person (String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public boolean hasAge() {
        if (age == 0 || age < 0)
            return false;
            else return true;
    }

    public boolean hasAddress(){
        if (address == null) return false;
        else return true;
    }

    public String getName () {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge(){
        return age;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString () {
        return name;
    }

    @Override
    public int hashCode() {
        int result = name == null ? 0 : name.hashCode();
        result = 31 * result + surname.hashCode();
        result = 31 * result + age;
        return result;
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder builder = new PersonBuilder();
        builder.setAge(5);
        builder.setSurname(surname);
        builder.setAddress(address);
        return builder;
    }




}
