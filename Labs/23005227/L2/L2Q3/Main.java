
package L2Q3;

public class Main {
    public static void main(String[] args) {
        Array a = new Array("Player 1", 7);
        a.draw();
        Array b = new Array("Player 2", 7);
        b.draw();
        
        System.out.println("");
        Link m = new Link("Player 1",7);
        m.draw();
        Link n = new Link("Player 2",7);
        n.draw();
    }
    
}
