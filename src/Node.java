public class Node {
    private int value;
    private Node left;
    private Node right;

    public Node(int value) {
        this.value = value;
    }

    public void set(int val) {
        if (val > value) {
            if (right != null) {
                right.set(val);
            } else {
                right = new Node(val);
            }
        } else if (val < value) {
            if (left != null) {
                left.set(val);
            } else {
                left = new Node(val);
            }
        }
    }

    public boolean get(int val) {
        if (val == value) {
            return true;
        } else {
            if (val > value) {
                if (right != null) {
                    return right.get(val);
                } else {
                    return false;
                }
            } else {
                if (left != null) {
                    return left.get(val);
                } else {
                    return false;
                }
            }
        }
    }

    public int size() {
        if (left == null && right == null) {
            return 1;
        } else if (left == null) {
            return 1 + right.size();
        } else if (right == null) {
            return 1 + left.size();
        } else {
            return 1 + left.size() + right.size();
        }
    }

    public Node removeRec(int value) {
        if (value < this.value) {
            if (left != null) {
                left = left.removeRec(value);
            }
        } else if (value > this.value) {
            if (right != null) {
                right = right.removeRec(value);
            }
        } else {
            if (left == null) return right;
            else if (right == null) return left;

            Node minValueNode = right;
            while (minValueNode.left != null) {
                minValueNode = minValueNode.left;
            }

            this.value = minValueNode.value;
            right = right.removeRec(this.value);
        }
        return this;
    }

    @Override
    public String toString() {
        return (left == null ? "" : left + " ") + value + (right == null ? "" : " " + right);
    }

    public void fill(Set res) {
        res.set(value);
        if (left != null) {
            left.fill(res);
        }
        if (right != null) {
            right.fill(res);
        }
    }

    public void print() {
        if (left != null) {
            left.print();
            System.out.print(" ");
        }

        System.out.print(value);

        if (right != null) {
            System.out.print(" ");
            right.print();
        }
    }
}
