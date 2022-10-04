package m1;

public class Marketing  extends Employee{
	private String emailId;

	public Marketing() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Marketing(String name, int id, int salary) {
		super(name, id, salary);
		// TODO Auto-generated constructor stub
	}
	
	public Marketing(String name, int id, int salary,String emailId) {
		super(name, id, salary);
		this.emailId = emailId;
		// TODO Auto-generated constructor stub
	}


	public Marketing(String emailId) {
		super();
		this.emailId = emailId;
	}
	
	
	public void workingOnemailId()
	{
		System.out.println(" working on emailId "+emailId);
	}

	public String getemailId() {
		return emailId;
	}

	public void setFileName(String emailId) {
		this.emailId = emailId;
	}

	
}

	


