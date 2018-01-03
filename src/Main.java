public class Main {
    static SalesPerson[] salesPeople = new SalesPerson[6];
    public static void main (String[] args){
    salesPeople[0] = new SalesPerson("100");
    salesPeople[1] = new SalesPerson("101");
    salesPeople[2] = new SalesPerson("102");
    salesPeople[0].setSalesHistory(new Sales("A100",300.00,10));
    salesPeople[0].setSalesHistory(new Sales("A200",1000.00,2));
    salesPeople[1].setSalesHistory(new Sales("A300",2550.40,10));
    System.out.println(salesPeople[2].getId());
    System.out.println(salesPeople[0].getCount());
    System.out.println(salesPeople[1].getSalesHistory(0).getValue());
    System.out.println(salesPeople[0].calcTotalSales());
    }

    public static void addSales (Sales s, String id){
        //add a new Sales object s, to the salesperson with a specified ID
        for(int i = 0; i<salesPeople.length; i++ ){
            if(salesPeople[i].getId() == id){
                salesPeople[i].setSalesHistory(s);
            }

        }


    }
    public String highest(){
        //returns the ID of the salesperson whose sales have the largest total value.
        double highestSale = 0;
        int count = 0;
        for(int s=0; s < salesPeople.length; s++){
            if(salesPeople[s].calcTotalSales() > highestSale){
                highestSale = salesPeople[s].calcTotalSales();
                count = s;
            }
        }
        return salesPeople[count].getId();
    }


}