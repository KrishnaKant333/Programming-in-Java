package JavaDocs;

/**
 * This class is used to demonstrate what java doc is and how it is used in the Java industry<p>Jindagi sawar du ik nayi bahar du</p>
 * @author Krishnakant (KKS)
 * @version 0.1
 * @since 2002
 * @see <a href="https://docs.oracle.com/en/java/javase/21/docs/api/index.html" target="_blank">Java Docs</a>
 */
// target="_blank" for opening in new tab
// javadocs me html render hoti h so whatever u'll write with Html tags, it will render..
public class Cwh_01_Documentation_Tags {
    public void add(int a, int b){
        System.out.println("The sum is : " + a+b);
    }
    public static void main(String[] args) {
        System.out.println("This is my main method");
    }
}