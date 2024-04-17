
package L2Q2;

public class Main {
    public static void main(String[] args) {
        TextFileLog t = new TextFileLog("name", 5);
        System.out.println("Create a text file log with maximum record equal to 5 \nText File Log Size 5");
        t.insert("James");
        t.insert("Ahmad");
        t.insert("Siti");
        t.insert("Ramesh");
        t.insert("John");
        t.display();
        
        System.out.println("");
        t.insert("kesha");
        t.exist("Siti");
        t.delete();
        t.getSize();
        


        
        
    }
    
}
