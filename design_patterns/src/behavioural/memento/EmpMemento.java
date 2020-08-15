package behavioural.memento;

public class EmpMemento {
	private int empId;
    private String empName;
    private String empPhoneNo;
    private String empDesignation;
	public int getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public String getEmpPhoneNo() {
		return empPhoneNo;
	}
	public String getEmpDesignation() {
		return empDesignation;
	}
	public EmpMemento(EmpOriginator empOriginator) {
		super();
		this.empId = empOriginator.getEmpId();
		this.empName = empOriginator.getEmpName();
		this.empPhoneNo = empOriginator.getEmpPhoneNo();
		this.empDesignation = empOriginator.getEmpDesignation();
	}
    
    
}
