package staff;

public abstract class Employee {

    private String name;
    private String ni;
    private Double salary;

    public Employee(String name, String ni, Double salary){
        this.name = name;
        this.ni = ni;
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }

    public String getNi(){
        return this.ni;
    }

    public Double getSalary(){
        return this.salary;
    }

    public void raiseSalary(Double raiseAmount){
        this.salary += raiseAmount;
    }

    public Double payBonus(){
        return this.salary * 0.01;
    }


}
