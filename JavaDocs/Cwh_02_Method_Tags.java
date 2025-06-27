package JavaDocs;

/**
 * This file is used to show the different types of tags to describe methods in a javadoc
 * @author Krishnakant
 * @version 0.1
 * @since 2025
 * @see <a href="file:///D:/VS%20Code/Java/JavaDocs/Cwh_01/JavaDocs/Cwh_01_JavaDocs_Documentation_Tags.html" target="_blank"> Click here to view the first of the JavaDoc file contatning only documentation tags.</a>
 */
public class Cwh_02_Method_Tags {
    /**
     * This is the main method
     * @param args These are the arguments supplied to the command line
     */
    public static void main(String[] args) {
        System.out.println("I am main method");
    }

    /**
     * This is a method to add two integers
     * @param i This is the first number to add
     * @param j This is the second number to add
     * @return Sum of the two numbers as an integer
     * @throws Exception if i is 0
     * @deprecated This method is deprecated please use the + operator
     */
    public int add(int i, int j) throws Exception{
        if(i==0){
            throw new Exception();
        }
        int c;
        c = i + j;
        return c;
    }
}
