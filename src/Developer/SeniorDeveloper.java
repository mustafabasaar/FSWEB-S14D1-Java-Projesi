package Developer;

public class SeniorDeveloper extends Employee{
    public SeniorDeveloper(long id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        setSalary(55000);
        System.out.println(getName() + " senior has start to working...");
    }
}
