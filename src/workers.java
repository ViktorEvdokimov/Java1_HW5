public class workers {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private String age;


    public workers() {
    }

    public workers(String fullName, String surname, String patronymic, String email, String phone, String age) {
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.age = age;
    }

    public workers(String fullName, String surname, String patronymic, String position, String email, String phone, double salary, String age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


    public void setPosition(String position) {
        this.position = position;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setAge(String age) {
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
