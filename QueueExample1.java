
import java.util.*;
 class _1QueExample {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        q.add( "Apple");
        q.add( "Banana");
        q.add( "orang");
        q.add( "Mango");
        q.add( "Watermelon");
        q.add( "Blueberry");
        System.out.println(q);
     
         System.out.println(q.peek());//first add karenge jo show karega
         System.out.println(q.element());
         
         System.out.println(q.offer("Sonam mam"));//last me add hoga 
         System.out.println(q);

          q.poll();//first value remove
          System.out.println(q);

          q.remove();
          System.out.println(q);

            
        
    }
    
}
