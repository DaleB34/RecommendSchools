public class Main {
    public static void main(String[] args)
    {
        String[] floppaMajors = {"Flopping", "Idk"};
        PrivateUni floppaU = new PrivateUni("FloppaU", "FloppaLand", 12345.67, 1000.0
                                            , 0.2, 0.0, 0.0, 10000
                                            , 999, 0.0, 0.0, floppaMajors);
        //floppaU on top
        String[] stanMajors = {"Law", "Engineering", "Medicine"};
        PrivateUni stanford = new PrivateUni("Stanford University", "Stanford, California", 56169.23
                                            ,3.9, 3.9, 56169.23, 825.91, 57
                                            ,9, 96.32, 23692.51, stanMajors);

        UC sanDiego = new UC("UC San Diego", "San Diego, California", 14700.0, 34.2, 3.4
                            ,44454.21, 1101.34, 3900, 7,17039.90);

        UC la = new UC("UCLA", "Los Angeles, California", 13401.53, 10.77, 3.4
                        ,43473.23, 1574.59, 125, 9, 15374.76);
        CalState usd = new CalState("San Diego State University", "San Diego, California", 8136.42, 46.9
                                    ,3.0, 20016.81, 1079.43, 86, 10, 30.9);
    }
}