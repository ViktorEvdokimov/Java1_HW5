public class workers {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private String age;

    public void getFullInfo(){
        System.out.println("Full name: " + fullName);
        System.out.println("Position: " + position);
        System.out.println("EMAIL: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Salary: " + salary);
        System.out.println("Age: " + age);
    }


    public workers(String fullName, String surname, String patronymic, String position, String email, String phone, double salary, String age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }


    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public double getSalary() {
        return salary;
    }

    public String getAge() {
        return age;
    }
}
