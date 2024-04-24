package week5.slist;

 class TestSList {

    public static void main(String[] args) {
        SList<String> list = new SList<>();
   list.appendEnd("Linked list");
   list.appendEnd("is");
   list.appendEnd("easy");

   list.display();

   System.out.println(list.removeInitial());

   if(list.contains("difficult")){
    System.out.println("list contains \"difficult\"");
   }
   else {
    System.out.println("list does not contain \"difficult\"");
   }

   list.clear();

   list.display();
    }
   
    
}
