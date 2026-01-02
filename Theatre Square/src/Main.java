import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner kbr = new Scanner(System.in);
        long l = kbr.nextInt();
        long w= kbr.nextInt();
        long s = kbr.nextInt();
        System.out.println((long)(Math.ceil(l/(double)s)*Math.ceil(w/(double)s)));
    }
}