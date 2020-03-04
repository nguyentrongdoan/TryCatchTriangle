import java.util.Scanner;

public class TriangleException {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("nhap canh a: ");
            int a = input.nextInt();
            System.out.println("nhap canh b: ");
            int b = input.nextInt();
            System.out.println("nhap canh c: ");
            int c = input.nextInt();
            checkTriangle(a, b, c);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void checkTriangle(int a, int b, int c){
        if ((a + b) > c && (a+c)>b && (b+c)>a)
            System.out.println("tam giac");
        else
            System.out.println("ko phai tam giac");
    }
}
