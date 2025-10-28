package Concepts;

public class ToStringMethod {

	String name;
    int age;

    public ToStringMethod(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }

    public static void main(String[] args) {
    	ToStringMethod p1 = new ToStringMethod("Alice", 30);
        System.out.println(p1); // Implicitly calls p1.toString()
    }
}

//provides string representation of object 