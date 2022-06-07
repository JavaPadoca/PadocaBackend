package models;

public class EmployeeModel {
    
	private int EmployeeId;
    private String Name, Email, Password;
    private boolean AccountType;
    
    public EmployeeModel() {
    }
    
    public EmployeeModel(int Id, String Name, String Password, String Email) {
    	this.EmployeeId = Id;
    	this.Name = Name;
    	this.Email = Email;
    	this.Password = Password;    	
    }

	public int getEmployeeId() {
		return EmployeeId;
	}


	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}


	public String getPassword() {
		return Password;
	}


	public void setPassword(String password) {
		Password = password;
	}


	public boolean isAccountType() {
		return AccountType;
	}


	public void setAccountType(boolean accountType) {
		AccountType = accountType;
	}

    
    
    public void updateUser(int Id, String Name, String Password, String Email){
        try {
        //    [pmDB].db();
        //    [pmDB].stat.executeUpdate("update [tbEmployee] set"
        //            + " password='"+Password+"',"
        //            + " name='"+Name+"',"
        //            + " email='"+Email+"'"
        //            + " where employeeId='"+Id+"'");

        } catch (Exception e) {
            System.out.println(e);

        }
    }


    
}