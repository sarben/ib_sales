public class SalesPerson {

    private String id;
    private Sales[] salesHistory = new Sales[5]; // details of the different sales
    private int count = 0;    // number of sales made

    // constructor for a new salesperson
    public SalesPerson(String id) {
        this.id = id;

    }
// constructor for a salesperson transferred (together with
// their sales details) from another branch

    public SalesPerson(String id, Sales[] s, int c) {
        this.id = id;
    }

    public int getCount() {
        return count;
    }

    public String getId() {
        return id;
    }

    public void setSalesHistory(Sales s) {
        salesHistory[count] = s;
        count = count + 1;
    }

    public Sales getSalesHistory(int n){
        return salesHistory[n];
    }

    public double calcTotalSales() {
        //calculates the total value of the sales for a specific SalesPerson object.	[5]
        //The salesPeople array contains '100 instantiated objects.
        //iterate through saleshistory, add up value from sales object
        double count = 0;
        for (int i = 0; i < salesHistory.length; i++){
            count = count + (salesHistory[i].getValue()) * salesHistory[i].getQuantity();
        }
        return count;
    }
}