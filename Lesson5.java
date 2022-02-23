class Lesson5 {
    public static void main(String[] args) {
    User[] user = new User[5];
        user[0] = new User("Ivan Ivanov", "Engineer", "ivanov@mail.ru", "89101235225",5000,45);
        user[1] = new User("Lev Novikov", "Doctor", "novikov@yandex.ru", "89152582356",50000,30);
        user[2] = new User("Elena Kulagina", "Teacher", "elena@rambler.ru", "89205289645",12000,41);
        user[3] = new User("Gleb Giglov", "Policeman", "giglov@gmail.com", "89152658",5000,21);
        user[4] = new User("Semen Gorbunkov", "Physicist", "semen@inbox.com", "8991123455",15000,39);
    
        for (int i = 0; i < user.length; i++) 
            if(user[i].getAge() > 40) 
                System.out.println(user[i]);
    }
}
class User {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;
    
    User(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    
    public int getAge() {
        return age;
	}
    
    @Override
    public String toString() {
        return name + ", " + position + ", " + email + ", " + phone+ ", " + salary+ "$, " + age;
    }
    
     
}