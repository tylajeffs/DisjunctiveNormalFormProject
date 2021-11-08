import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        //set variables
        String line1;
        String trash;
        ArrayList<String> otherLines = new ArrayList<String>();
        ArrayList<String> linesToDo = new ArrayList<String>();


        //create scanner to read file
        Scanner s = new Scanner(System.in);


        //read in the variables from the first line
        line1 = s.nextLine();

        //split the first line into the variables and store in array
        String[] variables = line1.split(" ");

        //get rid of the second line
        trash = s.nextLine();


        //calculate the amount of lines
        double lineNumber = Math.pow(2, (variables.length - 1));

        //go through the rest of the lines and store them in an arraylist
        for (int i = 0; i < (lineNumber); i++) {
            //add the next line to the arraylist
            otherLines.add(s.nextLine());
        }


        //close scanner
        s.close();


        //go through each of the lines and see if they have a 1 in the last position
        for (String line : otherLines) {
            //check if there is a 1 in the line
            if (line.lastIndexOf("1") == (line.length() - 1)) {
                //add the line to the lines to do array
                linesToDo.add(line);
            }

        }


        //print a new line
        System.out.println(" ");


        //go through each line that contains a 1 and calculate the truth
        for (String line : linesToDo) {

            //split the line into the characters
            String[] truthPieces = line.split(" ");


            //go through each of the truth pieces and check if they are a 1
            //also print everything
            for (int i = 0; i < (truthPieces.length - 1); i++) {
                //print the variable (a, b, c)
                System.out.print(variables[i]);

                //check if it is a 1
                if (truthPieces[i].contains("1")) {
                    //don't print a '
                    System.out.print(" ");
                } else {
                    //add a '
                    System.out.print("' ");
                }
            }

            //if it's the end, don't print anything
            if (linesToDo.indexOf(line) == (linesToDo.size() - 1))
            {
                //print nothing
                System.out.print("");
            }
            else
            {
                //print a plus sign
                System.out.print("+ ");
            }

        }
    }
}