import java.util.Random;
import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {
    public Integer[] createRandom() {
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Danh sach phan tu cua mang: ");
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.println(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsException arrExample = new ArrayIndexOutOfBoundsException();
        Integer[] arr = arrExample.createRandom();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao chi so cua 1 phan tu bat ky: ");
        int x = sc.nextInt();
        try {
            System.out.print("Gia tri cua phan tu co chi so : " + x + " la :" + arr[x]);
        } catch (IndexOutOfBoundsException e){
            System.out.println("Chi so vuot qua gioi han cua mang!!!");
        }
    }
}
