public class Cwh_02_Methods {
    public static void main(String[] args) {
        String name = "Krishna";

        int value = name.length();        
        System.out.println("Lenght : " + value);

        String lstring = name.toLowerCase();
        System.out.println("Lower case : " + lstring);

        String ustring = name.toUpperCase();
        System.out.println("Upper case : " + ustring);

        String nonTrimmedString = "        Krishna         "; // only the leading and trailing spaces are removed
        System.out.println(nonTrimmedString);
        String trimmedString = nonTrimmedString.trim();
        System.out.println(trimmedString);

        System.out.println(name.substring(2)); // It will print the string from index 2 to end
        System.out.println(name.substring(1, 4)); // It will print the string from index 1 to 4 excluding 4

        System.out.println(name.replace('K', 'T')); // It will replace all the 'k' with 't'

        System.out.println(name.replace("rishna", "ant" )); // It will replace all the 'rishna' with 'ant'

        boolean b = name.startsWith("Kr"); // case sensitive
        System.out.println(b);
        System.out.println(name.endsWith("na"));

        System.out.println(name.charAt(3)); // It will print the character at index 3

        System.out.println(name.indexOf("ish")); // It will print the index of the first occurrence of 'ish'

        String name1 = "Krishnana";
        System.out.println(name1.indexOf("na", 6)); // It will print the index of the first occurrence of 'na' from index 6
        // if substring is not found, it will return -1
        System.out.println(name1.lastIndexOf("na")); // It will print the index of the last occurrence of 'na'
        System.out.println(name1.lastIndexOf("na", 6)); // It will print the index of the last occurrence of 'na' from index 6
        
        System.out.println(name.equals("Krishna")); // It will compare the strings
        System.out.println(name.equalsIgnoreCase("kriSHna")); // It will compare the strings ignoring the case

        System.out.println("I am escape sequence \" double quote");
        System.out.println("I am escape sequence \\ backslash");
        System.out.println("I am escape sequence \n new line");
        System.out.println("I am escape sequence \t tab");
        
    }
}
