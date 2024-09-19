public class LeaveRequest {
    private Employee employee;
    private int daysRequested;
    private boolean approved;

    public LeaveRequest(Employee employee, int daysRequested) {
        this.employee = employee;
        this.daysRequested = daysRequested;
        this.approved = false;
    }

    public Employee getEmployee() {
        return employee;
    }

    public int getDaysRequested() {
        return daysRequested;
    }

    public boolean isApproved() {
        return approved;
    }

    public void approve() {
        this.approved = true;
    }

    public void reject() {
        this.approved = false;
    }
}
