public class T01BinaryTrees {
    public class Node {
        int data;
        Nodes left;
        Nodes right;

        public Nodes(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

        public class BinaryTree {
            static int idx = -1;

            public static Node BuildTree(int nodes[]) {
                idx++;
                if(Nodes[idx] == -1) {
                    return null;
                }
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = Buildtree(nodes);
            newNode.right = BuildTree(nodes);

            return newNode;
        }
        

    public static void main(String[] args) {
        int nodes[] = {1 ,2 ,4 ,-1 ,-1 ,5 ,-1 ,-1 ,3 ,-1 ,6 ,-1 ,-1}    
    }
}
