import java.util.Collections;
import java.util.PriorityQueue;

class Student implements Comparable<Student> {
    int rank;
    String name;

    public Student(String name, int rank) {
        this.name = name;
        this.rank = rank;
    }

    @Override
    public int compareTo(Student  s2) {
        return this.rank - s2.rank; // smaller rank = higher priority
    }
}

class PriorityExample {
    public void getTopStudent() {
        PriorityQueue<Student> p = new PriorityQueue<>(Collections.reverseOrder());
        p.add(new Student("a", 4));
        p.add(new Student("b", 2));
        p.add(new Student("c", 40));
      while(!p.isEmpty()){
         System.out.println(p.peek().name +" "+ p.remove().rank);
      }
    }
}

public class pq {
    public static void main(String[] args) {
        PriorityExample obj = new PriorityExample();
        obj.getTopStudent();
    }
}
