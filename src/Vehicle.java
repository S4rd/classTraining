/**
 * base class Vehicle
 * created by Ilker Korkmaz.
**/

public class Vehicle {
    private String model; // instance variables
    private double price;

    public void setModel(String myModel) {
        model = myModel;
    }
    public String getModel() {
        return model;
    }
    public void setPrice(double myPrice) {
        if (myPrice < 0.0)  // input validation
            myPrice = 0.0;
        price = myPrice;
    }
    public double getPrice() {
        return price;
    }
    public void output() { // to display the information
        System.out.println("Model is " + getModel());
        System.out.println("Price is " + getPrice());
    }
    public Vehicle() { // non-parameterized constructor
        setModel("notKnown");
        setPrice(0.0);
        System.out.println("non-parameterized constructor of Vehicle is called");
    }
    public Vehicle(String myModel, double myPrice) { // parameterized constructor
        setModel(myModel);
        setPrice(myPrice);
        System.out.println("parameterized constructor of Vehicle is called");
    }
} // end of class Vehicle
