public class TestRectangle {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();

        rectangle1.setRectangle(4,5);

        System.out.printf("Dien tich cua hinh chu nhat co %f va %f la %f",rectangle1.width,rectangle1.height,rectangle1.getArea());
        System.out.println("\n");
        System.out.printf("Chu vi cua hinh chu nhat co %f va %f la %f",rectangle1.width,rectangle1.height,rectangle1.getPerimeter());
        System.out.println("\n");
        Rectangle rectangle2 = new Rectangle(2,5);
        System.out.printf("Dien tich cua hinh chu nhat co %f va %f la %f",rectangle2.width,rectangle2.height,rectangle2.getArea());
        System.out.println("\n");
        System.out.printf("Chu vi cua hinh chu nhat co %f va %f la %f",rectangle2.width,rectangle2.height,rectangle2.getPerimeter());
    }
}
