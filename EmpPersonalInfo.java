public class EmpPersonalInfo {
    private String ename;
    private String emailId;
    private String resaddr;
    private int mobileno;

    public static void main(String args[]) 
    {
        
    }

    public String getEname() 
    {
        return ename;
    }

    public void setEname(String ename) 
    {
        this.ename = ename;

}

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getResaddr() {
        return resaddr;
    }

    public void setResaddr(String resaddr) {
        this.resaddr = resaddr;
    }

    public int getMobileno() {
        return mobileno;
    }

    public void setMobileno(int mobileno) {
        this.mobileno = mobileno;
    }

    @Override
    public String toString()
    {
        return "EmpPersonalInfo [ename=" + ename + ", emailId=" + emailId + ", resaddr=" + resaddr + ", mobileno="
                + mobileno+"]";
}
}