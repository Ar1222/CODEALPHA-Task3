public class Main {
    public static void main(String[] args) {
        LeaveManagementSystem system = new LeaveManagementSystem();

        // Create employees
        Employee emp1 = new Employee(1, "Alice", 15);
        Employee emp2 = new Employee(2, "Bob", 10);

        // Add employees to the system
        system.addEmployee(emp1);
        system.addEmployee(emp2);

        // Request leave
        LeaveRequest request1 = new LeaveRequest(emp1, 5);
        LeaveRequest request2 = new LeaveRequest(emp2, 12);

        system.requestLeave(request1);
        system.requestLeave(request2);

        // Process leave requests
        system.processLeaveRequests();

        // Print leave balances
        system.printLeaveBalances();
    }
}
