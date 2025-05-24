public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAdult() {
        if (this.age >= 18) {
            return true;
        }
        return false;
    }

    public void helloWorld() {
        System.out.println("Hello World!");
    }
}
