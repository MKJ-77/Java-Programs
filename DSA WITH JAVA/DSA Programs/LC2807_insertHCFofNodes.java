import LinkedList.ListNode;

//public class ListNode {
//    int val;
//    LinkedList.ListNode next;
//
//    ListNode() {
//    }
//
//    ListNode(int val) {
//        this.val = val;
//    }
//
//    ListNode(int val, LinkedList.ListNode next) {
//        this.val = val;
//        this.next = next;
//    }
//}
class LC2807_insertHCFofNodes {

    ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next == null)
            return head;
        ListNode temp = head;
        while(temp.next!=null){
            int a = temp.val;
            int b = temp.next.val;
            int hcf = findHCF(a,b);
            ListNode mid = new ListNode(hcf, temp.next.next);
            temp.next = mid;
            temp = mid.next;
        }
        return head;
    }
    public int findHCF(int a, int b){
        int hcf=Math.min(a,b);
        for(;hcf!=1;hcf--){
            if(a % hcf == 0 && b % hcf == 0){
                return hcf;
            }
        }
        return hcf;
    }
}
