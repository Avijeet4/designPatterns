package behavioural.memento;

public class EmpOriginator {
	private int empId;
    private String empName;
    private String empPhoneNo;
    private String empDesignation;
	public EmpOriginator(int empId, String empName, String empPhoneNo, String empDesignation) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empPhoneNo = empPhoneNo;
		this.empDesignation = empDesignation;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpPhoneNo() {
		return empPhoneNo;
	}
	public void setEmpPhoneNo(String empPhoneNo) {
		this.empPhoneNo = empPhoneNo;
	}
	public String getEmpDesignation() {
		return empDesignation;
	}
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	public EmpMemento saveToMemento() {
		return new EmpMemento(this);
	}
	public void undoFromMemento(EmpMemento empMemento) {
		this.empId = empMemento.getEmpId();
		this.empName = empMemento.getEmpName();
		this.empPhoneNo = empMemento.getEmpPhoneNo();
		this.empDesignation = empMemento.getEmpDesignation();
	}
	public void printInfo()
    {
        System.out.println("ID: "+ this.empId);
        System.out.println("Name: "+ this.empName);
        System.out.println("Phone Number: "+ this.empPhoneNo);
        System.out.println("Designation: "+ this.empDesignation);
    }
}
