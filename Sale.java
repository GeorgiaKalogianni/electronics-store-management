import java.util.Date;

class Sale {
    private int saleCode;
    private Device device;
    private String customerName;
    private String customerPhone;
    private String saleDate;
    private int quantitysale;
    private double totalCost;
    private int discount;
    private double discounted_price;


    public Sale(int saleCode, Device device, String customerName, String customerPhone, String saleDate, int quantitysale, double totalCost) {
        this.saleCode = saleCode;
        this.device = device;
        this.customerName = customerName;
        this.customerPhone = customerPhone;
        this.saleDate = saleDate;
        this.quantitysale = quantitysale;
        this.totalCost = totalCost;
    }

    public int getSaleCode() {
        return saleCode;
    }

    public Device getDevice() {
        return device;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public String getSaleDate() {
        return saleDate;
    }

    public int getquantitysale(){
        return quantitysale;
    }

    public double getTotalCost() {
        return totalCost;
    }

    @Override
    public String toString() {
        return "Sale Code: " + saleCode + "\nDevice: " + device + "\nName: " + customerName + "\nPhone: " + customerPhone +
                "\nDate: " + saleDate +  "\nTotal cost: " + totalCost +"\n---------------";
    }
}
