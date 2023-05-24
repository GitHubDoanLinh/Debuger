import java.util.Scanner;

public class ExceptionOfCalculatorNumber {
    private void calculate(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("tong cua x+y = "+a);
            System.out.println("hieu cua x-y = "+b);
            System.out.println("Tich cua x*y = "+c);
            System.out.println("Thuong cua x/y = "+d);
        } catch (Exception ex){
            System.out.println("Xay ra ngoai le: "+ex.getMessage());
            //ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao gia tri x: ");
        int x = sc.nextInt();
        System.out.print("Nhap vao gia tri y: ");
        int y = sc.nextInt();
        ExceptionOfCalculatorNumber calc = new ExceptionOfCalculatorNumber();
        calc.calculate(x,y);
    }
}
