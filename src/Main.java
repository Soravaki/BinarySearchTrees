import org.w3c.dom.Node;
import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    Main left, right;
    int data;

    public Main (int data){
        this.data = data;
    }

    public void insert(int value){
        if (value <= data) {
            if (left == null){
                left = new Main(value);
            } else {
                left.insert(value);
            }
        } else {
            if (right == null) {
                right = new Main(value);
            } else {
                right.insert(value);
            }
        }
    }

    public boolean contains(int value) {
        if (value == data) {
            return true;
        } else if (value < data) {
            if (left == null) {
                return false;
            } else {
                return left.contains(value);
            }
        } else {
            if (right == null) {
                return false;
            } else {
                return right.contains(value);
            }
        }
    }

    public void printPreOrder(){
        if ((left || right) == )
        System.out.print(data +" ");
        if (left != null) {
            left.printPreOrder();
        }
        if (right != null){
            right.printPreOrder();
        }
    }

    public void printInOrder() {
        if (left != null) {
            left.printInOrder();
        }
        System.out.print(data +" ");
        if (right != null){
            right.printInOrder();
        }
    }

    public void printPostOrder(){
        if (left != null){
            left.printPostOrder();
        }
        if (right != null){
            right.printPostOrder();
        }
        System.out.print(data +" ");
    }

    public void printLevelOrder(){
        Queue<Integer> q = new LinkedList<>();
        q.add(data);
        while (!q.isEmpty()){
            data = q.remove();
        }
        System.out.print(data +" ");
        if (left != null){
            left.printLevelOrder();
        }
        if (right != null){
            right.printLevelOrder();
        }
    }
}
