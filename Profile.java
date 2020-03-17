public class Profile{
    private String name;
    private String email;
    private String address;
    private String phonenumber;
    
    public Profile(String name, String email,String address,String phonenumber)
    {
        this.name = name;
        this.email = email;
        this.address = address;
        this.phonenumber = phonenumber;
    }

    public String getName()
    {
        return name;
    }
    
    public String getAddress()
    {
        return address;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public String getPhonenumber()
    {
        return phonenumber;
    }
    
    public String toString()
    {
        return "Profile:\nName : " + name + "\nEmail : "+ email + "\nAddress: " + address + "\nPhone Number : " + phonenumber+"\n";
    }
}