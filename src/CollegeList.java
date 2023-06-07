import java.util.ArrayList;
import java.util.Scanner;

public class CollegeList
{
    private String name;
    private College[] colleges;
    private int count = 0;
    private int numColleges;
    private ArrayList<College> recColleges = new ArrayList<College>();
    private College blank = new College("", "", 0, 0.0,0.0,0,0,0,0);

    public CollegeList(String name, int numColleges)
    {
        this.name = name;
        this.numColleges = numColleges;
        colleges = new College[numColleges];
    }

    public void addCollege(College c)
    {
        colleges[count] = c;
        count++;
    }

    public College filter(College c, int pPrice, Double pAccRate, double pGpa, int pRating)
    {
        //method filters off of user's preferences
        //only filters a SINGULAR college, so needs to be in a loop
        int conditions = 0; //count number of conditions met, 3+/4 means it goes into list

        if(c.totalPrice() <= pPrice) // good if it is less than your max budget
            conditions++;
        if(c.getAccRate() >= pAccRate) // good if acceptance rate is greater than what you expect
            conditions++;
        if(c.getGpa() <= pGpa) // good if min gpa is lower than what you have
            conditions++;
        if(c.getRating() >= pRating) // good if rating is greater than you prefer
            conditions++;

        if(conditions >= 3)
            return c;
        else
            return blank;
    } //end filter method


    //filters all the colleges
    //needs to be in CollegeList since uhhhhhhhhh 
    //because need to access one set of inputs multiple times
    //and because i said so
    public void filterAll() //start filterAll
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your budget: ");
        int budget = s.nextInt();
        System.out.print("Enter the minimum acceptance rate in percent: ");
        Double aRate = s.nextDouble();
        System.out.print("Enter your GPA: ");
        Double gpa = s.nextDouble();
        System.out.print("Enter the minimum rating you want out of 10: ");
        int rating = s.nextInt();

        //in normal for loop because class inheritance issues could be a problem
        for(int i = 0; i < count; i++)
        {
            //this did not work at first because i forgot to actually
            //add the object to a list
            recColleges.add(filter(colleges[i], budget, aRate, gpa, rating));
        }

    }// end filterAll

    public void printRecs()
    {
        String output = "";
        for(int i = 1; i < recColleges.size(); i++)
        {
            if(recColleges.get(i).getName() != "")
            {
                output += "\n" + recColleges.get(i).toString() + "\n" + recColleges.get(i).isWorth() + "\n";
            }
        }
        System.out.println(output);
    }//end printRecs

}//end class
