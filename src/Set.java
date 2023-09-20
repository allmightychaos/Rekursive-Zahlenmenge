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
        System.out.print("{ ");
        if (root != null) {
            root.print();
        }
        System.out.print(" }");
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

    public Set diff(Set s2) {
        Set s3 = new Set();
        if (root != null) {
            root.diff(s2.root, s3);
        }
        return s3;
    }

    public Set range(int from, int to) { //iefert alle Zahlen, die im Bereich zwischen from und to liegen, als neue Menge (Bereichsgrenzen jeweils eingeschlossen >=, <=)
        Set s3 = new Set();
        if (root != null) {
            root.range(from, to, s3);
        }
        return s3;
    }

    public static void main(String[] args) {
        Set s1 = new Set();
        s1.set(-9); s1.set(-5); s1.set(-4); s1.set(-3); s1.set(0); s1.set(2); s1.set(4); s1.set(10);

        Set s2 = new Set();
        s2.set(-5); s2.set(-3); s2.set(0); s2.set(1); s2.set(2); s2.set(7); s2.set(9);

        s1.print();
        s2.print();

        System.out.println();

        Set s3 = new Set();
        s3 = s1.union(s2); s3.print();
        s3 = s1.intersect(s2); s3.print();
        s3 = s1.range(0, 10); s3.print();
        s3 = s2.range(-10, 0); s3.print();
        s2.remove(0); s2.print();
        s2.remove(2); s2.print();
        s3 = s1.intersect(s2); s3.print();
        s3 = s1.diff(s2); s3.print();
    }
}
