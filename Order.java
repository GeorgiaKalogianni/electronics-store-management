import java.util.Date;

class Order {
    private int orderCode;
    private Device device;
    private String customerName;
    private String customerPhone;
    private String orderDate;
    private String expdate;
    private int quantity;
    private double totalCost;
    private int discount;
    private double discounted_price;

    public Order(int orderCode, Device device,String customerName, String customerPhone, String expdate, int quantity, String orderDate, double totalCost) {
        this.orderCode = orderCode;
        this.device = device;
        this.customerName = customerName;
        this.customerPhone = customerPhone;
        this.orderDate = orderDate;
        this.expdate = expdate;
        this.quantity = quantity;
        this.totalCost = totalCost;
    }

    public int getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(int orderCode) {
        this.orderCode = orderCode;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public String getExpdate() {
        return expdate;
    }

    public void setExpdate(String expdate) {
        this.expdate = expdate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    @Override
    public String toString() {
        return "Order Code: " + orderCode + "\nDevice: " + device + "\nName: " + customerName +
        "\nPhone: " + customerPhone + "\nDate: " + orderDate +  "\nTotal cost: " + totalCost + "\n---------------";
    }
}

