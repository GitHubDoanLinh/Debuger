package Triangle;

public class TriangleEdgesChec {
    // Kiem tra tam giac hop le
    public void checkingTriangle(double a, double b, double c) throws TriangleEdgesException {
        if (a + b <= c || a + c <= b || b + c <= a) {     //Quăng lỗi cho hàm TriangleEdgesException() xử lý
            throw new TriangleEdgesException("Error! Tam giac khong hop le!");
        } else {
            System.out.println("Tam giac hop le");
        }
    }
}
