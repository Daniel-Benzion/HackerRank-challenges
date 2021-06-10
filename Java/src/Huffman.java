public class Huffman {

    static class Node {
        public char data;
        public Node left, right;
    }

    static void decode(String s, Node root) {

        Node current = root;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
        

            if (s.charAt(i) == '0') {

                current = current.left;
                
                if (current.left == null && current.right == null) {
                    sb.append(current.data);
                    current = root;
                } 
            } else {

                current = current.right;

                if (current.left == null && current.right == null) {
                    sb.append(current.data);
                    current = root;
                } 
            }

        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {

        Node root = new Node();

        root.left = new Node();
        root.left.left = new Node();
        root.left.left.data = 'B';
        root.left.right = new Node();
        root.left.right.data = 'C';
        root.right = new Node();
        root.right.data = 'A';

        decode("1001011", root);
    }

}
