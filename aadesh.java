class colourtype{
    String colour;
}
class shape extends colourtype{
   String shape;
}
class random extends shape{
   
}
public class aadesh{ 
public static void main(String [] args ){
   //creating object
   random r1=new random();
   r1.colour="red";
   r1.shape="rectangele";
   System.out.println(r1.colour);
   System.out.println(r1.shape);
}
}