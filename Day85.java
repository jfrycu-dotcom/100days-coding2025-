public class Day085_ {
    public static void main(String[] args) {
        int max = 0;
        int a[] = {1,2,3};
        for (int i = 0; i < a.length; i++) {if (a[i] > max) max = a[i];}
        System.out.println(max);
    }
}
