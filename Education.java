public class Education{
    private String SchoolName;
    private String Location;
    private String year;
    
    public Education(String SchoolName,String Location,String year)
    {
        this.SchoolName = SchoolName;
        this.Location = Location;
        this.year = year;
    }
    public String getSchoolName(){
        return SchoolName;
    }
    public String getLocation(){
        return Location;
    }   
    public String year(){
        return year;
    }
    public String toString(){
        return "                           " + year +"\n" + 
        "School Name: " + SchoolName + "\n" + "Location: " + Location + "\n";
    }
}