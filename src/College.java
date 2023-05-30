public class College
{
    //instance variables
    private String name;
    private String location;
    private Double avgTuition;
    private Double accRate; //in percent
    private Double minGpa;
    private Double outOfStatePrice;
    private Double bookPrice;
    private int majorsOffered;
    private int campusRating;
    // end instance variables

    public College(String name, String location, Double avgTuition, Double accRate,
                   Double minGpa, Double outOfStatePrice, Double bookPrice, int majorsOffered, int campusRating)
    {
        this.name = name;
        this.location = location;
        this.avgTuition = avgTuition;
        this.accRate = accRate;
        this.minGpa = minGpa;
        this.outOfStatePrice = outOfStatePrice;
        this.bookPrice = bookPrice;
        this.majorsOffered = majorsOffered;
        this.campusRating = campusRating;
    }

    //getters

    public Double getAccRate()
    {
        return accRate;
    }

    public Double getGpa()
    {
        return minGpa;
    }

    public int getRating()
    {
        return campusRating;
    }

    //end getters

    //brain methods
    public Double totalPrice()
    {
        return avgTuition + bookPrice;
    }

    public String isWorth(boolean inState)
    {
        if(inState)
        {
            if(totalPrice() >= 10000 && campusRating < 5)
            {
                return name + " is not worth to go to without a scholarship.";
            }
            else if(totalPrice() < 10000)
            {
                return name + " is worth to go to.";
            }
            else if(campusRating <= 10 && campusRating >= 7)
            {
                return name + " is worth to go to.";
            }
            else
            {
                return " It is up to you if it is worth to go to " + name;
            }


        }//end inState responses

        else // out of state responses
        {
            if(totalPrice() >= 20000 && campusRating <= 6)
                return name + " is not worth to go to";
            else if(totalPrice() <15000)
                return name + " is worth to go to";
            else if (campusRating >= 7)
                return name + "is worth to go to";
            else
            {
                return "It is up to you if it is worth to go to " + name;
            }
        }// end out of state responses
    }

    //end brain methods

    //toString
    public String toString()
    {
        String output = name + "\nLocated in:  " + location + "\nAverage Tuition for 4 years: $" + avgTuition +
                        "\nBook Price: $" + bookPrice + "\nAcceptance Rate: %" + accRate +
                        "\nOut of State Price: $" + outOfStatePrice +  "\nMinimum GPA: " + minGpa +
                        "\nAmount of Majors: " + majorsOffered + "\nRating: " + campusRating + "/10";
        return output;
    }
}
