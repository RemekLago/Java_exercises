package basics;
public class Loops {
    public static void main(String[] args) {

    String[] course = 
        {
            "Java", 
            "Java Apps", 
            "Java Apps 2",
            "Java Advance", 
            "Java Android",
            "C#", 
            "C# Create Apps",
            "C# LINQ",
            "Pascal"
        };
     
        // loop FOR

        for(int i = 0; i < course.length; i++)
        {           
            System.out.println(course[i]);           
        }

        // loop ENHANCED FOR

        for(String course_name: course)
        {           
            System.out.println(course_name);           
        }

        
        // loop WHILE
        int i = 0;
        while (i < course.length)
        {
            System.out.println(course[i]);
            i += 1;
        }
    
    
        // loop DO
        i = 1;
        do
        {
            System.out.println(course[i]);
            i +=1; 
        } 
        while(i < course.length);  
    }
}
