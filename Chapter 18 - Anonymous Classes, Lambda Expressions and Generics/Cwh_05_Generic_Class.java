class Generic<T1, T2> { // you can add more than one generic separated by a comma
    int val;
    private T1 t1;
    private T2 t2;

    public Generic(T1 t1, int val, T2 t2) {
        this.t1 = t1;
        this.val = val;
        this.t2 = t2;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }

}

public class Cwh_05_Generic_Class {
    public static void main(String[] args) {
        Generic<String, Integer> g = new Generic<>("MyString is my String ", 23, 9669);
        String str = g.getT1();
        Integer int1 = g.getT2();
        System.out.println(str + int1);
    }
}
