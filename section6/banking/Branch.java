package section6.banking;

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double initialDeposit) {
        for (Customer customer : customers) {
            if (customer.getName().compareTo(customerName) == 0) {
                return false;
            }
        }
        customers.add(new Customer(customerName, initialDeposit));
        return true;
    }

    public boolean addCustomerTransaction(String customerName, double transaction) {
        for (Customer customer : customers) {
            if (customer.getName().compareTo(customerName) == 0) {
                customer.addTransaction(transaction);
                return true;
            }
        }
        return false;
    }

    private Customer findCustomer(String customerName) {
        for (Customer customer : customers) {
            if (customer.getName().equals(customerName)) {
                return customer;
            }
        }
        return null;
    }
}
