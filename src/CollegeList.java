import java.util.ArrayList;

public class CollegeList
{
    private String name;
    private College[] colleges;
    private int count = 0;
    private ArrayList<College> recColleges;

    public void addCollege(College c)
    {
        colleges[count] = c;
        count++;
    }

    public College filter(College c, int pPrice, int pAccRate, double pGpa, int pRating)
    {
        //method filters off of user's preferences
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
            return null;
    } //end filter method


}
