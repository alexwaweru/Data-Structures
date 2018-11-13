public class TreeTraversals{


    public class Node{
        private String data = null;
        private node leftchild;
        private node rightchild;

        Node(String data, Node lchild, Node rchild){
            this.data = data;
            this.leftchild = lchild;
            this.rightchild = rchild;
        }

        Node(String data){
            this.data = data;
            this.leftchild = null;
            this.rightchild = null;
        }

        Node(){
            this.data = null;
            this.leftchild = null;
            this.rightchild = null;
        }

        public Node getLeftChild(){
            return this.leftchild
        }

        public Node setLeftChild(Node node){
            this.leftchild = node;
        }

        public Node getRightChild(){
            return this.rightchild;
        }

        public Node setRightChild(Node node){
            this.rightchild = node;
        }
    }


    public class Tree{
        private Node root;

        Tree(Node node){
            this.root = node;
        }

        Tree(){
            this.root = null;
        }

        public Node getRoot()System.out.println(this.getRoot().data){
            return this.root;
        }

        public void setRoot(Node node){
            this.root = node;
        }

        public boolean isEmpty(){
            if (this.root == null){
                return true;
            }
            return false;
        }

        public void preorder(){
            if (this.getRoot().data != null){
                System.out.println(this.getRoot().data);
                if (this.root.getLeftChild() != null){
                    this.preorder();
                }
                if (this.root.getRightChild() != null){
                    this.preorder();
                }
            }
        }

        public void postorder(){
            if (this.getRoot().data != null){
                if (this.root.getLeftChild() != null){
                    this.preorder();
                }
                if (this.root.getRightChild() != null){
                    this.preorder();
                }
                System.out.println(this.getRoot().data);
            }
        }

        public void inorder(){
            if (this.getRoot().data != null){
                if (this.root.getLeftChild() != null){
                    this.preorder();
                }
                System.out.println(this.getRoot().data);
                if (this.root.getRightChild() != null){
                    this.preorder();
                }
            }
        }
    }


    public static void main(String[] args){
        Node l = new Node("Chapter1");
        Node r = new Node("Chapter2");
        Node ll = new Node("Section 1.1");
        Node lr = new Node("Section 1.2");
        Node rl = new Node("Section 2.1");
        Node rr = new Node("Section 2.2");
        Node lrl = new Node("Section 1.2.1");
        Node lrr = new Node("Section 1.2.2");
        Node rrl = new Node("Section 2.2.1");
        Node rrr = new Node("Section 2.2.2");
        Node root = new Node("Book");
        root.setLeftChild(l);
        root.setRightChild(r);
        root.getLeftChild.setLeftChild(ll);
        root.getLeftChild.setRightChild(lr);
        root.getRightChild.setRightChild(rr);
        root.getRightChild.setLeftChild(rl);
        root.getLeftChild.getRightChild.setLeftChild(lrl);
        root.getLeftChild.getRightChild.setRightChild(lrr);
        root.getRightChild.getRightChild.setLeftChild(rrl);
        root.getRightChild.getRightChild.setRightChild(rrr);
        Tree bookTree = new Tree(root);
        bookTree.preorder();
        bookTree.postorder();
        bookTree.inorder();
    }
}