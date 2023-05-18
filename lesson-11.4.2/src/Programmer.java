/*
Зарплата
*/

public class Programmer {
    private int salary = 1000;

    //напишите тут ваш код


    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = Math.max(this.salary, salary);
    }
}