public class Student {
    public String name;
    public int age;
    public Student (){
        name = "";
        age = 0;
    }
    public Student(String a, int b) {
        name = a;
        age = b;
    }
    public void printStudentnfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
