public class Cwh_02_Operations {
    public static void main(String[] args) {
        int [] marks = {100, 60, 70, 80, 90};
        int n = marks.length;
        System.out.println("Length of the array: "+n);

        System.out.println("Array elements:");
        for(int i = 0; i<n; i++){
            System.out.println(marks[i]);
        }

        System.out.println("Array elements in reverse order:");
        for(int i = n-1; i>=0; i--){
            System.out.println(marks[i]);
        }
    }
}
