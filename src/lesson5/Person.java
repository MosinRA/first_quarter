package lesson5;



public class Person {
    String name;
    String position;
    String email;
    int phoneNumber;
    int salary;
    int age;

    public Person (String name, String position, String email, int phoneNumber, int salary, int age){
        this.name = name;
        this.position = position;
        this. email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }
    public Person (String name, String position, String email, int phoneNumber, int salary){
        this (name, position, email, phoneNumber, salary, 0);
    }

    public Person (String name, String position, String email, int phoneNumber){
        this (name, position, email, phoneNumber, 0, 0);
    }
    public Person (String name, String position, String email){
        this (name, position, email, 0, 0, 0);
    }
    public Person (String name, String position){
        this (name, position, null, 0, 0, 0);
    }
    public Person (String name){
        this (name, null, null, 0, 0, 0);
    }

    @Override
    public String toString() {
        return "Сотрудник: {" +
                "ФИО: '" + name + '\'' +
                ", Должность: '" + position + '\'' +
                ", E-mail: '" + email + '\'' +
                ", Номер телеофона: " + phoneNumber +
                ", Заработная плата: " + salary +
                ", Возраст: " + age +
                '}';
    }
   /* public void printInfo(){
        System.out.println("ФИО: " + "Должность: " + "E-mail: " + "Номер телеофона: " + "Заработная плата: " + "Возраст: ");
    }*/
}
