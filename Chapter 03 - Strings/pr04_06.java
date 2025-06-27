public class pr04_06 {
    public static void main(String[] args) {
        String id = "Hey there this is a double space  and this is a triple   ";
        System.out.println(id.indexOf("  "));
        System.out.println(id.indexOf("   "));
        // if any will be absent, the output will be -1
    }
}
