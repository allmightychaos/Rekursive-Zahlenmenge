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

    public Set clone() {
        Set res = new Set();
        if (root != null) {
            root.fill(res);
        }
        return res;
    }

    public void print() {
        if (root != null) {
            root.print();
        }
        System.out.println();
    }

    public Set intersect(Set s2) {
        Set s3 = new Set();
        if (root != null) {
            root.intersect(s2.root, s3);
        }
        return s3;
    }

    public Set union(Set s2) {
        Set s3 = new Set();
        if (root != null) {
            root.fill(s3);
        }
        if (s2.root != null) {
            s2.root.fill(s3);
        }
        return s3;
    }

//    public Set diff(Set s2) {}

//    public Set range(int from, int to) {}

    public static void main(String[] args) {
        Set s = new Set();

        s.set(3);
        s.set(5);
        s.set(12);

//        System.out.println(s.get(12));
//        System.out.println(s.size());

//        s.print();
//        s.remove(5);
//        s.print();

//        Set copy = s.clone();
//        copy.print();

        Set s2 = new Set();
        s2.set(3);
        s2.set(5);
        s2.set(7);

        Set s3 = s.intersect(s2);
        Set s4 = s.union(s2);

        s.print();
        s2.print();
        s3.print();
        s4.print();
    }
}
