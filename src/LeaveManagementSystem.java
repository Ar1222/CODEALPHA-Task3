
import java.util.ArrayList;
import java.util.List;

public class LeaveManagementSystem {
    private List<Employee> employees;
    private List<LeaveRequest> leaveRequests;

    public LeaveManagementSystem() {
        employees = new ArrayList<>();
        leaveRequests = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void requestLeave(LeaveRequest request) {
        leaveRequests.add(request);
    }

    public void processLeaveRequests() {
        for (LeaveRequest request : leaveRequests) {
            if (request.getDaysRequested() <= request.getEmployee().getLeaveBalance()) {
                request.getEmployee().deductLeave(request.getDaysRequested());
                request.approve();
                System.out.println("Leave approved for " + request.getEmployee().getName());
            } else {
                request.reject();
                System.out.println("Leave rejected for " + request.getEmployee().getName() + " due to insufficient balance.");
            }
        }
        leaveRequests.clear(); // Clear processed requests
    }

    public void printLeaveBalances() {
        for (Employee employee : employees) {
            System.out.println(employee.getName() + ": " + employee.getLeaveBalance() + " days remaining.");
        }
    }
}
