import java.util.Scanner;

public class BSTimplement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BST bst = new BST();

        int choice, key;
        while (true) {
            System.out.println("Binary Search Tree Operations:");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Search");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the key to insert: ");
                    key = sc.nextInt();
                    bst.insert(key);
                    System.out.println(key + " inserted into the BST.");
                    break;
                case 2:
                    System.out.print("Enter the key to delete: ");
                    key = sc.nextInt();
                    if (bst.search(key)) {
                        bst.delete(key);
                        System.out.println(key + " deleted from the BST.");
                    } else {
                        System.out.println(key + " not found in the BST.");
                    }
                    break;
                    case 3:
                    System.out.print("Enter the key to search: ");
                    key = sc.nextInt();
                    if (bst.search(key)) {
                        System.out.println(key + " found in the BST.");
                    } else {
                        System.out.println(key + " not found in the BST.");
                    }
                    break;
                case 4:
                    System.out.print("Enter order : ");
                    int order = sc.nextInt();
                    
                            System.out.print("Inorder Traversal of BST: ");
                            bst.inOrder();
                            break;
                       
                        
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
            System.out.println();
        }
                }
}

class BST{
    private static class node{
        int data;
        node left,right;

        node(int data){
            this.data=data;
            left=right=null;
        }
    }
    private node root;
    public BST(){
        root=null;
    }
    public void insert(int data){
        root = insertRec(root,data);
    }
    private node insertRec(node root,int data){
        if (root == null) {
            root = new node(data);
            return root;
        }
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }
        return root;
    }
    public void delete(int key) {
        root = deleteRec(root, key);
    }

    private node deleteRec(node root, int key) {
        if (root == null) {
            return root;
        }
        if (key < root.data) {
            root.left = deleteRec(root.left, key);
        } else if (key > root.data) {
            root.right = deleteRec(root.right, key);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
        
        root.data = minValue(root.right);
        root.right = deleteRec(root.right, root.data);
    }
    return root;
}
private int minValue(node root) {
    int minv = root.data;
    while (root.left != null) {
        minv = root.left.data;
        root = root.left;
    }
    return minv;
}

public boolean search(int key) {
    return searchRec(root, key);
}

private boolean searchRec(node root, int key) {
    if (root == null) {
        return false;
    }
    if (root.data == key) {
        return true;
    }
    if (root.data < key) {
        return searchRec(root.right, key);
    }
    return searchRec(root.left, key);
}

public void inOrder() {
    inOrderRec(root);
    System.out.println();
}

private void inOrderRec(node root) {
    if (root != null) {
        inOrderRec(root.left);
        System.out.print(root.data + " ");
        inOrderRec(root.right);
    }
}

}
