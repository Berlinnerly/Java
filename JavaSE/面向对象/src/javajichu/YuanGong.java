package javajichu;
public class YuanGong {
    public static void main(String[] args) {
        Employee a = new Employee("xiaohu","001",10000);
        a.work();
    }
}

/*
    定义一个员工类Employee
    成员变量：
        姓名：name;
        工号：id;
        工资：salary;
    构造方法：无参，有参；
            getxxx() setXxx();
            显示所有成员信息的方法；
 */

class Employee {
    private String name;
    private String id;
    private double salary;

    public Employee() {} //空参
    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void work() {
        System.out.println("我的姓名是：" + name + "，我的工号是：" + id + "，我的工资是：" + salary);
    }
}
