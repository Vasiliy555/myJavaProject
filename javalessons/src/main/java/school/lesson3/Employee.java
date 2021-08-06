package school.lesson3;

public class Employee {
//    1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата,
//возраст.
    private String name;
    private String position;
    private String email;
    private String phone;
    private int wage;
    private int age;

//2. Конструктор класса должен заполнять эти поля при создании объекта.

    public Employee(String name, String position, String email, String phone, int wage, int age){
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.wage = wage;
        this.age = age;

    }
// прописываем геттеры и сеттеры.

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getPosition(){
        return position;
    }
    public void setPosition(String position){
        this.position = position;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getPhone(){
        return phone;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    public int getWage(){
        return wage;
    }
    public void setWage(int wage){
        this.wage = wage;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

//    3. Внутри класса «Сотрудник» написать метод, который выводит информацию об
//объекте в консоль.

    public void getInfo(){
        System.out.printf("Ф.И.О : %s, Должность: %s, e-mail: %s, телефон: %s, зарплата: %d, возраст: %d",
                getName(), getPosition(),getEmail(),getPhone(),getWage(),getAge());
        System.out.println();
    }


}
