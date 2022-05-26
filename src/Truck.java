/**
 * derived class Truck
 * created by Ilker Korkmaz.
**/

// IS-A relationship: Truck IS-A Vehicle
public class Truck extends Vehicle {
    private boolean hasDumper; // extra data member

    public void setHasDumper(boolean myDumperCheckPoint) {
        hasDumper=myDumperCheckPoint;
    }
    public boolean getHasDumper() {
        return hasDumper;
    }
    @Override
    public void output() { // the method is overridden
        super.output();
        if(getHasDumper()==true)  // the following is equivalent:  if(getHasDumper())
            System.out.println("The truck has a dumper");
        else
            System.out.println("The truck has no dumper");
    }
    public Truck() { // non-parameterized constructor
        super(); // call the non-parameterized constructor of parent class
        setHasDumper(false);
        System.out.println("non-parameterized constructor of Truck is called");
    }
    public Truck(String myModel, double myPrice, boolean myDumperCheckPoint) {
        super(myModel, myPrice); // call the parameterized constructor of parent class
        setHasDumper(myDumperCheckPoint);
        System.out.println("parameterized constructor of Truck is called");
    }
} // end of class Truck