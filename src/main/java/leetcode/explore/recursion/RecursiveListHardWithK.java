package leetcode.explore.recursion;

public class RecursiveListHardWithK {
    public ListNodeK swapPairs(ListNodeK head, int k) {

        if(checkIsPossible(head,k)){
            return swapPairs(reverseForKNodes(head,k), k);
        }
//        if (head != null && head.next != null) {
//            if (head.next.next != null) {
//                ListNodeK tmp = head.next;
//                head.next = swapPairs(tmp.next);
//                tmp.next = head;
//                return tmp;
//            }
//            ListNodeK tmp1 = head.next;
//            ListNodeK tmp2 = head;
//            head = tmp1;
//            tmp1.next = tmp2;
//            tmp1.next.next = null;
//            return head;
//        }
        return head;
    }

    private ListNodeK reverseForKNodes(ListNodeK h, int k){
        if(k!=1){
            k--;
            h = reverseForKNodes(h.next, k);

        }else {
            ListNodeK tmpEnd = h.next.next;
            ListNodeK tmp1 = h.next;
            ListNodeK tmp2 = h;
            h = tmp1;
            tmp1.next = tmp2;
            tmp1.next.next = tmpEnd;
        }
        return h;
    }

    private boolean checkIsPossible(ListNodeK head, int k){
        boolean res = true;
        for (int i = 0; i < k; i++) {
            if(res){
                res = head != null;
                head = head.next;
                i++;
            } else {
                break;
            }
        }
        return res;
    }

    public static class ListNodeK {
        int val;
        ListNodeK next;
        ListNodeK(int x) {
            val = x;
        }
    }

    public void addNewNod(ListNodeK node, int val){
        node.next = new ListNodeK(val);
    }

    public static void main(String[] args) {
        RecursiveListHardWithK rs = new RecursiveListHardWithK();
        ListNodeK head = new ListNodeK(1);
        ListNodeK node = new ListNodeK(2);
        head.next = node;
        int i = 2;
        while (i != 10){
            i++;
            rs.addNewNod(node, i);
            node = node.next;
        }
//        head.next = new ListNodeK(2);
//        head.next.next = new ListNodeK(3);
//        head.next.next.next = new ListNodeK(4);
//        head.next.next.next.next = new ListNodeK(5);
//        head.next.next.next.next = new ListNodeK(5);
        rs.swapPairs(head, 3);
    }
}
