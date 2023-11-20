package Developer;

public class HRManager extends Employee {
    public HRManager(int id,String name,double salary){
        super(id,name,salary);
    }
    @Override
    public void work(){
        System.out.println("Employee starts to working as a HRManager");
        setSalary(salary);
    }

}
