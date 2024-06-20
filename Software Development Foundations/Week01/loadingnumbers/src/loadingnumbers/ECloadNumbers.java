/*
 * NAME: Harvey MacLeary
 * DATE: 7/9/2022
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ECloadNumbers 
{
    public ECloadNumbers() {}

    public Number[] loadData()
    {
        File myFile = new File("Numbers.txt");
        ArrayList<Integer> numArrLst = new ArrayList<>();

        try
        {
            FileReader fr = new FileReader(myFile);
            BufferedReader br = new BufferedReader(fr);

            String data = "";

            while((data = br.readLine()) != null)
            {
                numArrLst.add(Integer.parseInt(data.trim()));
            }
            
            System.out.println("All data loaded");
        }

        catch(IOException e)
        {
            System.out.println("Error loading file");
        }

        Integer[] result = new Integer[numArrLst.size()];
        result = numArrLst.toArray(result);

        return result;
    }
}
