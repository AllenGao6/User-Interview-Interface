public class Job{
    private String JobTitle;
    private String CompanyName;
    private String Location;
    private String Month;
    private String Month2;
    private String Des;
    
    public Job(String JobTitle,String CompanyName,String Location,String Month,String Month2,String Des)
    {
        this.JobTitle =JobTitle;
        this.CompanyName = CompanyName;
        this.Location = Location;
        this.Month = Month;
        this.Month2 = Month2;
        this.Des = Des;
    }
    public String getJobTitle(){
        return JobTitle;
    }
    public String getCompanyName(){
        return CompanyName;
    }
    public String toString(){
        return "                           " + Month +"\n" + "                           " + Month2 +"\n"
         + "Job Title: " + JobTitle + "\nCompany Name: " + CompanyName + "\n" + "Location: " + Location + 
         "\n"+ "Job description: " + Des + "\n";
    }
}