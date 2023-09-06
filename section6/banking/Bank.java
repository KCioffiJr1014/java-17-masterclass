package section6.banking;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        branches = new ArrayList<>();
    }

    public boolean addBranch(String branchName) {
        for (Branch branch : branches) {
            if (branch.getName().equals(branchName)) {
                return false;
            }
        }
        branches.add(new Branch(branchName));
        return true;
    }

    public boolean addCustomer(String branchName, String customerName, double initialDeposit) {
        Branch branch = findBranch(branchName);

        if (branch == null || branch.getCustomers() == null) {
            return false;
        }

        for (Customer customer : branch.getCustomers()) {
            if (customer.getName().compareTo(customerName) == 0) {
                return false;
            }
        }
        branch.newCustomer(customerName, initialDeposit);
        return true;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch branch = findBranch(branchName);

        if (branch == null) {
            return false;
        }

        for (Customer customer : branch.getCustomers()) {
            if (customer.getName().compareTo(customerName) == 0) {
                branch.addCustomerTransaction(customerName, transaction);
                return true;
            }
        }
        return false;
    }

    private Branch findBranch(String branchName) {
        for (Branch branch : branches) {
            if (branch.getName().equals(branchName)) {
                return branch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean printTransactions) {
        Branch branch = findBranch(branchName);
        if (branch == null) {
            //   System.out.println("Branch with name "+ branchName + " doesn't exist");
            return false;
        }

        ArrayList<Customer> branchCustomers = branch.getCustomers();
        System.out.println("Customer details for branch " + branch.getName());
        if (printTransactions) {

            for (int i = 0; i < branchCustomers.size(); i++) {
                Customer customer = branchCustomers.get(i);
                System.out.println("Customer: " + customer.getName() + "[" + (i + 1) + "]");
                ArrayList<Double> customerTransactions = customer.getTransactions();
                System.out.println("Transactions");
                for (int t = 0; t < customerTransactions.size(); t++) {
                    double transaction = customerTransactions.get(t);
                    System.out.println("[" + (t + 1) + "]" + "  Amount " + transaction);
                }
            }
        } else {
            for (int i = 0; i < branchCustomers.size(); i++) {
                Customer customer = branchCustomers.get(i);
                System.out.println("Customer: " + customer.getName() + "[" + (i + 1) + "]");
            }
        }
        return true;
    }
}
