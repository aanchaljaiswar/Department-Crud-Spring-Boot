package emp.department.entities;

public class EmployeeDto {
    private int empId;
    private int deptId;
    private String deptName;

   public EmployeeDto(int empId, int deptId, String deptName) {
        this.empId = empId;
        this.deptId = deptId;
        this.deptName = deptName;
    }

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	
}

