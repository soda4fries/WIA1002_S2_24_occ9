package week5.slist;

public class SList<E>  {
    SNode<E> head, tail;
    SList(){head = tail = null;}

    public void appendEnd (E e){
        if (head == null)
        {
            SNode<E> p = new SNode<>(e);
            head = p;
            head.n = null;
            tail = head;
        }
        else{
            tail.n = new SNode<>(e);
            tail = tail.n;
        }
    }
    public E removeInitial(){
        if (head != null){
            E copy = head.item;
            head = head.n;
            return copy;
        } else {
            return null;
        }
        
    }
    public boolean contains(E e){
        SNode<E> ptr = head;
        while (ptr != null){
            if (ptr.item.equals(e))
            return true;
            ptr =ptr.n;
        }
        return false;
    }
    public void clear(){head = tail = null;}
    public void display(){
        SNode<E> ptr = head;
        while(ptr != null){
            System.out.print(ptr.item.toString() + " ");
            ptr = ptr.n;
        }
        System.out.println();
    }



}
