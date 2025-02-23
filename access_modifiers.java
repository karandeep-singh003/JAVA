package Start;
class Person {
    public String name; 
    private int age;      
    protected String city;
    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }


    public int getAge() {
        return age;
    }
}

public class access_modifiers{
	public static void main(String[] args) {
        Person p = new Person("John", 25, "New York");

        System.out.println("Name: " + p.name);  
        System.out.println("City: " + p.city);  
        System.out.println("Age: " + p.getAge()); 
    }

}