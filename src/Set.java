public class Set {
    private Node root;

    public void set(int val) {
        if (root != null) {
            root.set(val);
        } else {
            root = new Node(val);
        }
    }

    public boolean get(int val) {
        if (root == null) {
            return false;
        } else {
            return root.get(val);
        }
    }

    public int size() {
        if (root == null) {
            return 0;
        } else {
            return root.size();
        }
    }

    public void remove(int val) {
        if (root != null) {
            root = root.removeRec(val);
        }
    }

    @Override
    public String toString() {
         return "" + (root == null ? "" : root);
    }

    public static void main(String[] args) {
        Set s = new Set();

        s.set(3);
        s.set(5);
        s.set(12);

//        System.out.println(s.get(12));
//        System.out.println(s.size());

        System.out.println(s);
        s.remove(5);
        System.out.println(s);
    }
}
