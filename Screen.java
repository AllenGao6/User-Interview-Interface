import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import java.net.URL;

import java.awt.image.BufferedImage;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import java.util.ListIterator;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class Screen extends JPanel implements ActionListener{
        //Profile
        private JTextField Name;
        private JTextField Email;
        private JTextField Address;
        private JTextField Phonenumber;
        //education
        private JTextField SchoolName;
        private JTextField Location;
        private JTextField year;
        private JTextField DeleteEdu;
        private JButton DeleteEduButton;
        //Job
        private JTextField JobTitle;
        private JTextField CompanyName;
        private JTextField Location2;
        private JTextField month;
        private JTextField month2;
        private JTextField Des;
        private JTextField DeleteJob;
        private JButton DeleteJobButton;
        
        private JButton ProfileButton;
        private JButton EducationButton;
        private JButton JobButton;
        
        private BufferedImage PhotoImage;
        
        private JButton SubmitButton;
        private JButton SubmitButton2;
        private JButton SubmitButton3;
        private int motion = 1;
        
        private JTextArea textArea;
        private String text;;        
        private ArrayList<Profile> resume; 
        private ArrayList<Education> resume2;
        private ArrayList<Job> resume3;
        
        private ListIterator<Profile> list1;
        private ListIterator<Education> list2;
        private ListIterator<Job> list3;
        
        //private String record = "";
        //private int time = 0;
    
    public Screen(){
        this.setLayout(null);
        this.setFocusable(true);
        
        resume = new ArrayList<Profile>();
        resume2 = new ArrayList<Education>();
        resume3 = new ArrayList<Job>();
        list1 = resume.listIterator();
        list2 = resume2.listIterator();
        list3 = resume3.listIterator();
        // set text
        
        
        //textarea
        textArea = new JTextArea(); //sets the location and size
		textArea.setBounds(510,80,330,600);
		textArea.setEditable(false);
		textArea.setFont(new Font("Courier New",Font.BOLD,11));
		System.out.println("text: " + text);
		//text = "Profile: \n"  ;
		textArea.setText(text);
		this.add(textArea);
		
		//JScrollPane
		JScrollPane scrollPane = new JScrollPane(textArea); 
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(510,80,300,600);
		this.add(scrollPane);
		
		this.setFocusable(true);
        //Input name
        Name = new JTextField(20);
        Name.setBounds(100,250, 150, 30);
        //Name.setText("name");
        this.add(Name);
        //Input email
        Email = new JTextField(20);
        Email.setBounds(100,310, 150, 30);
        this.add(Email);
        //Email.setText("Email");
        //input 
        Address = new JTextField(20);
        Address.setBounds(100,370, 150, 30);
        //Address.setText("Address");
        this.add(Address);
        
        SchoolName = new JTextField(20);
        SchoolName.setBounds(100,250, 150, 30);
        this.add(SchoolName);
        SchoolName.setVisible(false);
        //SchoolName.setText("SchoolName");
        //Input email
        //----------------------------------
        JobTitle = new JTextField(20);
        JobTitle.setBounds(100,250, 150, 30);
        //Name.setText("name");
        this.add(JobTitle);
        JobTitle.setVisible(false);
        //Input email
        CompanyName = new JTextField(20);
        CompanyName.setBounds(100,310, 150, 30);
        this.add(CompanyName);
        CompanyName.setVisible(false);
        //Email.setText("Email");
        //input 
        Location2 = new JTextField(20);
        Location2.setBounds(100,370, 150, 30);
        //Address.setText("Address");
        this.add(Location2);
        Location2.setVisible(false);
        
        month = new JTextField(50);
        month.setBounds(100,430,150, 30);
        this.add(month);
        month.setVisible(false);
        
        month2 = new JTextField(50);
        month2.setBounds(100,490,150, 30);
        this.add(month2);
        month2.setVisible(false);
        
        Des = new JTextField(50);
        Des.setBounds(100,550,150, 30);
        this.add(Des);
        Des.setVisible(false);
        
        DeleteJob = new JTextField(50);
        DeleteJob.setBounds(260,250,150, 30);
        this.add(DeleteJob);
        DeleteJob.setVisible(false);
        
        DeleteJobButton = new JButton("Delete");
        DeleteJobButton.setBounds(260,300,80, 25); //sets the location and size
        DeleteJobButton.addActionListener(this); //add the listener
        this.add(DeleteJobButton);
        DeleteJobButton.setVisible(false);
        //-----------------------------------
        DeleteEdu = new JTextField(50);
        DeleteEdu.setBounds(260,250,150, 30);
        this.add(DeleteEdu);
        DeleteEdu.setVisible(false);
        
        DeleteEduButton = new JButton("Delete");
        DeleteEduButton.setBounds(260,300,80, 25); //sets the location and size
        DeleteEduButton.addActionListener(this); //add the listener
        this.add(DeleteEduButton);
        DeleteEduButton.setVisible(false);
        
        
        
        Location = new JTextField(20);
        Location.setBounds(100,310, 150, 30);
        this.add(Location);
        Location.setVisible(false);
        //Location.setText("Location");
        //input 
        year = new JTextField(20);
        year.setBounds(100,370, 150, 30);
        this.add(year);
        //year.setText("year");
        year.setVisible(false);
        
        Phonenumber = new JTextField(50);
        Phonenumber.setBounds(100,430,150, 30);
        this.add(Phonenumber);
        
        //submit Button
        SubmitButton = new JButton("Submit");
        SubmitButton.setBounds(150,500,80, 25); //sets the location and size
        SubmitButton.addActionListener(this); //add the listener
        this.add(SubmitButton);
        
        SubmitButton2 = new JButton("Submit");
        SubmitButton2.setBounds(150,500,80, 25); //sets the location and size
        SubmitButton2.addActionListener(this); //add the listener
        this.add(SubmitButton2);
        SubmitButton2.setVisible(false);
        
        SubmitButton3 = new JButton("Submit");
        SubmitButton3.setBounds(150,600,80, 25); //sets the location and size
        SubmitButton3.addActionListener(this); //add the listener
        this.add(SubmitButton3);
        SubmitButton3.setVisible(false);
        
        ProfileButton = new JButton("Profile");
        ProfileButton.setBounds(90,135,80, 25); //sets the location and size
        ProfileButton.addActionListener(this); //add the listener
        this.add(ProfileButton);
        
        EducationButton = new JButton("Education");
        EducationButton.setBounds(170,135,100, 25); //sets the location and size
        EducationButton.addActionListener(this); //add the listener
        this.add(EducationButton);
        
        JobButton = new JButton("Job");
        JobButton.setBounds(270,135,80, 25); //sets the location and size
        JobButton.addActionListener(this); //add the listener
        this.add(JobButton);
        
        //import background image
        try {
                PhotoImage = ImageIO.read(new File("WallPaper.jpg"));
        } catch (Exception e) {
                e.printStackTrace();
        }
        
    }
    @Override
    public Dimension getPreferredSize(){
		return new Dimension(1024,768);
	}
	
	public void paintComponent(Graphics g){
        g.drawImage(PhotoImage, 0, 0, null);
        
        g.setColor(Color.black);
        if(motion == 1){
        g.drawString("Name (First name + last name):",100,240);
        g.drawString("Email:",100,300);
        g.drawString("Address:",100,360);
        g.drawString("Phone number:",100,420);
        }
        else if(motion == 2){
            g.drawString("Delete a Education Information:",260,210);
            g.drawString("(Input the School Name)",260,230);
            g.drawString("School Name:",100,240);
            g.drawString("Location:",100,300);
            g.drawString("Month and Year of graduation (YYYY-MM):",100,360);
        }
        else if(motion == 3){
            g.drawString("Delete a Job Information:",260,210);
            g.drawString("(Input the Company Name)",260,230);
            g.drawString("Job Title:",100,240);
            g.drawString("Company Name:",100,300);
            g.drawString("Location:",100,360);
            g.drawString("The Start Month and Year (YYYY-MM):",100,420);
            g.drawString("The End Month and Year (YYYY-MM):",100,480);
            g.drawString("Job description:",100,540);
        }
        Font fontLarge = new Font("Courier New",Font.BOLD,27);
        g.setFont(fontLarge);
		//Font fontSmall = new Font("Courier New",Font.BOLD,11);
		g.drawString("User Interview",50,50);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == SubmitButton) 
        {
            System.out.println("Submit(Profile) Button clicked");
            //long l = Long.parseLong(Phonenumber.getText());
            resume.add(new Profile(Name.getText(),Email.getText(),Address.getText(),Phonenumber.getText()));
            list1 = resume.listIterator();
            while(list1.hasNext()){
                System.out.println(list1.next());
            }
            text = " ";
            list1 = resume.listIterator();
            while(list1.hasNext()){
                text += list1.next();
            }
            text += "\n---------------------------------\nEducation:\n";
            list2 = resume2.listIterator();
            while(list2.hasNext()){
            text += list2.next();
            } 
            text += "\n---------------------------------\nJob:\n";
            list3 = resume3.listIterator();
            while(list3.hasNext()){
                text += list3.next();
            }
            text += "\n---------------------------------\n";
            textArea.setText(text);
            repaint();
        }
        if (e.getSource() == SubmitButton2) 
        {
            
            System.out.println("Submit(Education) Button clicked");
            resume2.add(new Education(SchoolName.getText(),Location.getText(),year.getText()));
            //list2 = resume2.listIterator();
            text = " ";
            list1 = resume.listIterator();
            while(list1.hasNext()){
                text += list1.next();
            }
            text += "\n---------------------------------\nEducation:\n";
            list2 = resume2.listIterator();
            while(list2.hasNext()){
            text += list2.next();
            } 
            text += "\n---------------------------------\nJob:\n";
            list3 = resume3.listIterator();
            while(list3.hasNext()){
                text += list3.next();
            }
            text += "\n---------------------------------\n";
            textArea.setText(text);
            repaint();
        }
        if (e.getSource() == SubmitButton3) 
        {
            
            System.out.println("Submit(Job) Button clicked");
            resume3.add(new Job(JobTitle.getText(),CompanyName.getText(),
            Location2.getText(),month.getText(),month2.getText(),Des.getText()));
            //list2 = resume2.listIterator();
            text = " ";
            list1 = resume.listIterator();
            while(list1.hasNext()){
                text += list1.next();
            }
            text += "\n---------------------------------\nEducation:\n";
            list2 = resume2.listIterator();
            while(list2.hasNext()){
            text += list2.next();
            } 
            text += "\n---------------------------------\nJob:\n";
            list3 = resume3.listIterator();
            while(list3.hasNext()){
                text += list3.next();
            }
            text += "\n---------------------------------\n";
            textArea.setText(text);
            repaint();
        
        }
        if(e.getSource() == DeleteJobButton)
        {
            list3 = resume3.listIterator();
            while(list3.hasNext()){
                if(list3.next().getCompanyName().equals(DeleteJob.getText())){
                    list3.previous();
                    list3.remove();
                }
            }
             text = " ";
            list1 = resume.listIterator();
            while(list1.hasNext()){
                text += list1.next();
            }
            text += "\n---------------------------------\nEducation:\n";
            list2 = resume2.listIterator();
            while(list2.hasNext()){
            text += list2.next();
            } 
            text += "\n---------------------------------\nJob:\n";
            list3 = resume3.listIterator();
            while(list3.hasNext()){
                text += list3.next();
            }
            text += "\n---------------------------------\n";
            textArea.setText(text);
            repaint(); 
        }
        if(e.getSource() == DeleteEduButton)
        {
            list2 = resume2.listIterator();
            while(list2.hasNext()){
                if(list2.next().getSchoolName().equals(DeleteEdu.getText())){
                    list2.previous();
                    list2.remove();
                }
            }
             text = " ";
            list1 = resume.listIterator();
            while(list1.hasNext()){
                text += list1.next();
            }
            text += "\n---------------------------------\nEducation:\n";
            list2 = resume2.listIterator();
            while(list2.hasNext()){
            text += list2.next();
            } 
            text += "\n---------------------------------\nJob:\n";
            list3 = resume3.listIterator();
            while(list3.hasNext()){
                text += list3.next();
            }
            text += "\n---------------------------------\n";
            textArea.setText(text);
            repaint(); 
        }
        if(e.getSource() == ProfileButton)
        {
            motion = 1;
            DeleteEduButton.setVisible(false);
            DeleteEdu.setVisible(false);
            DeleteJobButton.setVisible(false);
            DeleteJob.setVisible(false);
            month2.setVisible(false);
            Des.setVisible(false);
            SchoolName.setVisible(false);
            Location.setVisible(false);
            year.setVisible(false);
            Name.setVisible(true);
            Email.setVisible(true);
            Address.setVisible(true);
            Phonenumber.setVisible(true);
            SubmitButton2.setVisible(false);
            SubmitButton3.setVisible(false);
            SubmitButton.setVisible(true);
            JobTitle.setVisible(false);
            CompanyName.setVisible(false);
            Location2.setVisible(false);
            month.setVisible(false);
            repaint();
        }
        if(e.getSource() == EducationButton)
        {
            motion = 2;
            DeleteEduButton.setVisible(true);
            DeleteEdu.setVisible(true);
            DeleteJobButton.setVisible(false);
            DeleteJob.setVisible(false);
            month2.setVisible(false);
            Des.setVisible(false);
            Name.setVisible(false);
            Email.setVisible(false);
            Address.setVisible(false);
            Phonenumber.setVisible(false);
            SchoolName.setVisible(true);
            Location.setVisible(true);
            year.setVisible(true);
            SubmitButton.setVisible(false);
            SubmitButton2.setVisible(true);
            SubmitButton3.setVisible(false);
            JobTitle.setVisible(false);
            CompanyName.setVisible(false);
            Location2.setVisible(false);
            month.setVisible(false);
            repaint();

        }
        if(e.getSource() == JobButton)
        {
            motion = 3;
            DeleteEduButton.setVisible(false);
            DeleteEdu.setVisible(false);
            DeleteJobButton.setVisible(true);
            DeleteJob.setVisible(true);
            //System.out.println("Not done yet");
            Name.setVisible(false);
            Email.setVisible(false);
            Address.setVisible(false);
            Phonenumber.setVisible(false);
            SchoolName.setVisible(false);
            Location.setVisible(false);
            year.setVisible(false);
            SubmitButton2.setVisible(false);
            SubmitButton.setVisible(false);
            SubmitButton3.setVisible(true);
            JobTitle.setVisible(true);
            CompanyName.setVisible(true);
            Location2.setVisible(true);
            month.setVisible(true);
            month2.setVisible(true);
            Des.setVisible(true);
            repaint();
        }
        
    
    
    }

}