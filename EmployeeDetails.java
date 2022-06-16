package week1.Day2;

public class EmployeeDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDetails obj =new EmployeeDetails();
		obj.printEmployeeName("Testleaf",217);
		obj.getEmployeeAddress(null);
		obj.printEmployeeSalary(0);
		obj.printEmployeeMobileNumber(9922337744L);
		

	}
  public void printEmployeeName(String empName ,int empId) {
		
		EmployeeDetails obj;
		// TODO Auto-generated method stub
		System.out.println(empName+empId);
	}
 private void getEmployeeAddress (String add) {
		System.out.println("Chennai");
		
	}
 
   double printEmployeeSalary(double empSalary) {
	    System.out.println(3500000);
		return empSalary;
   }
   
   private void printEmployeeMobileNumber(long mobNum) {
	   System.out.println(mobNum);
   }

}
