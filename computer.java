// - Create a Computer class that has 3 variables. The first variable will have a name. The second variable will be the year of the computer. Last variable will be the cost of the computer.

// - All 3 variables should be private instance variables and must use getters to retrieve the data and setters to set the variables.
// package getset;


public class computer{

   public static void main(String[] args) {

        getset comp1 = new getset();

        comp1.setName("Apple");
        comp1.setYear(2020);
        comp1.setCost(999);

        System.out.println(comp1.getName());
        System.out.println(comp1.getYear());
        System.out.println(comp1.getCost());

        
    }
}