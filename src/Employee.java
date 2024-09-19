public class Employee {
    private int id;
    private String name;
    private int leaveBalance;

    public Employee(int id, String name, int leaveBalance) {
        this.id = id;
        this.name = name;
        this.leaveBalance = leaveBalance;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getLeaveBalance() {
        return leaveBalance;
    }

    public void deductLeave(int days) {
        if (days <= leaveBalance) {
            leaveBalance -= days;
        } else {
            System.out.println("Not enough leave balance.");
        }
    }

    public void addLeave(int days) {
        leaveBalance += days;
    }
}
