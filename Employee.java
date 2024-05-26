public class Employee
{
    private String ename;
    private String emailId;
    private String resaddr;
    private int mobileno;

    public void setEname(String ename) 
    {
        this.ename = ename;
    }

    public void setEmailId(String emailId) 
    {
        this.emailId = emailId;
    }

    public void setResaddr(String resaddr) 
    {
        this.resaddr = resaddr;
    }

    public void setMobileno(int mobileno) 
    {
        this.mobileno = mobileno;
    }
    
    public String toString() 
    {
        return "Employee Name: " + ename + ", Email: " + emailId + ", Address: " + resaddr + ", Mobile No: " + mobileno;
    }
    
    public static void main(String[] args)
    {
        Employee de = new Employee();

        de.setEname("Jainil");
        de.setEmailId("jainil123@gmail.com");
        de.setResaddr("Ahemdabad");
        de.setMobileno(994786795);

        System.out.println(de);

        Employee ed1 = new Employee();

        ed1.setEname("Yash");
        ed1.setResaddr("Surat");

        System.out.println(ed1);
    }
}