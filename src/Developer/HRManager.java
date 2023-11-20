package Developer;

import java.util.Arrays;

public class HRManager extends Employee {
    private JuniorDeveloper[] juniors;
    private MidDeveloper[] mids;
    private SeniorDeveloper[] seniors;

    public HRManager(long id, String name, JuniorDeveloper[] juniors,
                     MidDeveloper[] mids, SeniorDeveloper[] seniors) {
        super(id, name);
        this.juniors = juniors;
        this.mids = mids;
        this.seniors = seniors;
    }
    @Override
    public void work(){

        System.out.println(getName()+"Employee starts to working as a HRManager");
        setSalary(60000);
    }
    public void addEmployee(int index,JuniorDeveloper junior){
        try{
            if(juniors[index]==null){
                juniors[index]=junior;
            }
            else{
                System.out.println("Index is full");
            }
        }
        catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
            System.out.println("Index not found: "+index);
    }
    }
    public void addEmployee(int index,SeniorDeveloper senior){
        try{
            if(seniors[index]==null){
                seniors[index]=senior;
            }
            else{
                System.out.println("Index is full");
            }
        }
        catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
            System.out.println("Index not found: "+index);
        }
    }
    public void addEmployee(int index,MidDeveloper mid){
        try{
            if( mids[index]==null){
                mids[index]=mid;
            }
            else{
                System.out.println("Index is full");
            }
        }
        catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
            System.out.println("Index not found: "+index);
        }
    }
    @Override
    public String toString() {
        return super.toString() + " HRManager{" +
                "juniors=" + Arrays.toString(juniors) +
                ", mids=" + Arrays.toString(mids) +
                ", seniors=" + Arrays.toString(seniors) +
                '}';
    }
}
