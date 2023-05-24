package Triangle;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TriangleEdgesChec check = new TriangleEdgesChec();

        // nhap du lieu
        try{
            System.out.println("Nhap vao canh thu nhat");
            int a = sc.nextInt();
            System.out.println("Nhap vao canh thu hai");
            int b = sc.nextInt();
            System.out.println("Nhap vao canh thu ba");
            int c = sc.nextInt();
            try {
                check.checkingTriangle(a,b,c);
            }catch (TriangleEdgesException ex){
                System.out.println(ex.getMessage());
            }
        }catch (Exception e){
            System.out.println("Sai!. Khong dung dinh dang.");
        }
    }

}
