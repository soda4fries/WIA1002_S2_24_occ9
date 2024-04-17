
package L2Q3;

import java.util.Random;

public class Array implements ADT {
    public String name;
    public int drawtimes;

    public Array(String name, int drawtimes) {
        this.name = name;
        this.drawtimes = drawtimes;
    }
    
    public void draw(){
        Random r = new Random();
        String[] arr = new String[drawtimes];
     
        for (int i=0; i<arr.length; i++){ 
            int color = r.nextInt(4);
            int act = r.nextInt(14);
            int spe = r.nextInt(2);
            
            if (r.nextBoolean()){
                arr[i] = colour[color] + " " + action[act];
            } else {
                arr[i] = special[spe];
            }
        }
        System.out.println(toString(arr));
        
    }
    
    
    public String toString(String[] a){
        StringBuilder sb = new StringBuilder();
        sb.append("Array Implementation\n" + name + " draws " + drawtimes + " times\n");
        for (int i=0; i<a.length; i++){
            sb.append(a[i] + " :: ");
        }
        return sb.toString(); 
    }
}
