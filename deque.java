package git_practice;
import java.util.*;

public class deque {

    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>() ;
            dq.addFirst(1);
            dq.addFirst(2);

        System.out.println(dq);
    }
}
