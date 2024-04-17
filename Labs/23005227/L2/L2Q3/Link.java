
package L2Q3;

import java.util.Random;
import java.util.LinkedList;

public class Link implements ADT {
    public String name;
    public int drawtimes;

    public Link(String name, int drawtimes) {
        this.name = name;
        this.drawtimes = drawtimes;
    }
    
    public void draw (){
        Random r = new Random();
        LinkedList <String> list = new LinkedList<>();
        //cannot use list.size() as initially the list is empty
        for (int i=0; i<drawtimes; i++){ 
            int color = r.nextInt(4);
            int act = r.nextInt(14);
            int spe = r.nextInt(2);
            
            if (r.nextBoolean()){
                list.add(colour[color] + " " + action[act]);
            } else {
                list.add(special[spe]);
            }
        }
        System.out.println(toString(list));
        
    }
    
    public String toString(LinkedList<String> a){
        StringBuilder sb = new StringBuilder();
        sb.append("Linked List Implementation\n").append(name).append(" draws ").append(drawtimes).append(" times\n");
        for (int i=0; i<a.size(); i++){
            sb.append(a.get(i)).append(" :: ");
        }
        return sb.toString(); 
    }
    
}
