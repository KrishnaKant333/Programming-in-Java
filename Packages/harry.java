package Java.Packages;

public class harry {
    public static void main(String[] args) {
        System.out.println("I am class harry's main method");
    }
}
// to compile, javac harry.java
// if directory is in parent folder eg vs code, then javac Java/Packages/harry.java
// to run bytecode java Java.Packages.harry
// to compile and add in a package, javac -d . Java/Packages/harry.java
// to compile all available java files into their respecive packages, javac -d . Java/Packages/*.java 
// if u want to create sub packages write the name of the new sub package separated by a dot in the package section after the parent directory name
// if u write anything else in place of . in javac -d . "Java/Packages/harry.java", then package will be made inside the folder having name as the text u wrote 
