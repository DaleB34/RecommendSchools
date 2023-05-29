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

    public College filter(College c, int pPrice, int pRate, double pGpa, int pRating)
    {
        int conditions = 0; //count number of conditions met, 3+/4 means it goes into list

        if(c.totalPrice() >= pPrice)
            conditions++;
        
        if(c.)
    }
}
