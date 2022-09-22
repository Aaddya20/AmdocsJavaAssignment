package day2_2;

public class FactoryEmp {

	public Employee getEmployee(String employeeType)
	{
		if(employeeType == null)
		{
			return null;
		}
		if(employeeType.equalsIgnoreCase("Permanent Employee"))
		{
			return new PermanentEmployee();
		}
		else if(employeeType.equalsIgnoreCase("Contractual Employee"))
		{
			return new ContractualEmployee();
		}
		return null;
	}
}
