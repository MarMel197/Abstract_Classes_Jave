package staff.techStaff;

import staff.Employee;

public class Developer extends Employee {
    private String deptName;
    public Developer(String deptName){

        super("John", "PY12345", 25000);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }
}
