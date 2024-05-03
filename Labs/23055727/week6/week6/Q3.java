package week6;

public class Q3 {
    public int findSum(MyStack<Integer> d){
        int x = 0;
        MyStack<Integer> s = d.clone();
        while(!s.isEmpty())
            x += s.pop();

        return x;
    }
}
