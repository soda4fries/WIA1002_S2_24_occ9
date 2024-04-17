
package L2Q1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class NonDuplicate <T extends Number>{
    private int n;
    
    public NonDuplicate(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }


    public LinkedList linked(int n){
        LinkedList <Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++){
            int randNum = (int)(Math.random()*101);
            if (!list.contains(randNum)){
                list.add(randNum);
            } else {
                i--;
            }
        }
        Collections.sort(list);
        return list;
    }
    
    public ArrayList array(int n){
        ArrayList <Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++){
            int randNum = (int)(Math.random()*101);
            if (!arr.contains(randNum)){
                arr.add(randNum);
            } else {
                i--;
            }
        }
        Collections.sort(arr);
        return arr;
    }
}
