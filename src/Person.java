public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello," + this.name + ", nice to see you!");
    }

    public static void main(String[] args) {


        Person person = new Person("Becca");
        person.sayHello();
        person.setName("Alex");
        System.out.println(person.getName());
    }

}




