public class LC223_RectangleArea {
    static int ax1, ax2, ay1, ay2;
    static int bx1, bx2, by1, by2;

    public static void main(String[] args) {
        LC223_RectangleArea ob = new LC223_RectangleArea();
        System.out.println(ob.Area());
    }

    int Area() {
        int area = 0, l1 = Math.abs(ay2 - ay1), l2 = Math.abs(by2 - by1), b1 = Math.abs(ax2 - ax1), b2 = Math.abs(bx2 - bx1);
        if (bx1 >= ax1 || bx2 <= ax1)
            area = l1 * b1 + l2 * b2;
        else if (ax1 <= bx1 && bx1 <= ax2 && ax1 <= bx2 && bx2 <= ax2 && ay1 <= by1 && by1 <= ay2 && ay1 <= by2 && by2 <= ay2) {
            area = l1 * b1;
        } else if (bx1 <= ax1 && ax1 <= bx2 && bx1 <= ax2 && ax2 <= bx2 && by1 <= ay1 && ay1 <= by2 && by1 <= ay2 && ay2 <= by2) {
            area = l2 * b2;
        }
            return area;
    }
}
