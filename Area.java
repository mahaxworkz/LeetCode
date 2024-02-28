import java.util.Scanner;
 class Rectangle{
    int breadth;
    int height;
     
    public Rectangle( int breadth,int height){
    this.breadth= breadth;
    this.height= height;
    }
    public void getDim( Rectangle rect){
     System.out.println("breadth value is" + rect.breadth);
      System.out.println(" height value is" + rect.height);
    }
    public int getArea( Rectangle rect){
        return rect.breadth*rect.height;
    }
}

public class Area {
    
    public static void main(String[] args) {
         
        // Print the result
        Rectangle rec= new Rectangle(20,40);
        rec.getDim(rec);
        int area= rec.getArea(rec);
         
        System.out.println("area is " + area);
        
    }
}
