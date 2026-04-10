public class student {
        String name = "Soumyajit";
        int age;
        double height;
        boolean isstudent;
        student() {
            name = "soumayjit";
            age = 16;
            height = 5.6;
            isstudent = true;
        }
    public static void main(String[] args) {
        student mystudent = new student();
        System.out.println("name:"+ mystudent.name);
        System.out.println("age" + mystudent.age);
        System.out.println("height" + mystudent.height);
        System.out.println("isstudent" + mystudent.isstudent);

    }
}