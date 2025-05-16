public class mkj_BillSplit {
    int k, n; // k=index of item Anna Did
    int[] price; // Storing Price of Each Item
    int b; // Charged Bill from Anna

    void input() {
        k = 1;
        n = 4;
        price = new int[n];
        price[0] = 3;
        price[1] = 10;
        price[2] = 2;
        price[3] = 9;
        b = 12;
    }

    public void Split() {
        int actBill = 0;
        int chaBill = b;
        for (int i = 0; i < n; i++) {
            if (i != k)
                actBill += price[i];
        }
        int x = chaBill - (actBill / 2);
        if (x > 0) {
            System.out.println("OverCharged");
        } else if (x == 0) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println("UnderCharged");
        }
        System.out.println(x);
    }

    public static void main(String[] args) {
        mkj_BillSplit ob = new mkj_BillSplit();
        ob.input();
        System.out.println(ob.n + " " + ob.k);
//        System.out.println(ob.price.toString());
        System.out.println(ob.b);
        ob.Split();
    }
}
