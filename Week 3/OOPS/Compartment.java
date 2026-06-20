package OOPSwithJAVA;
import java .util.*;
 public abstract class Compartment {
    public abstract String notice();
}
class FirstClass extends Compartment{
    public String notice(){
        return "First class compartment";
    }
}
class Ladies extends Compartment{
    public String notice(){
        return "Ladies compartment";
    }

}
class General extends Compartment{
    public String notice(){
        return "General compartment";
    }

}
class Luggage extends Compartment{
    public String notice(){
        return "Luggage compartment";
    }

}
 class TestCompartment{
    public static void main(String[] args) {
       Compartment[] arr=new Compartment[10];
       Random r=new Random();
       for(int i=0;i<arr.length;i++){
           int n=r.nextInt(4)+1;
           switch(n){
               case 1:
                   arr[i]=new FirstClass();
                   break;
               case 2:
                   arr[i]=new Ladies();
                   break;
               case 3:
                   arr[i]=new General();
                   break;
               case 4:
                   arr[i]=new Luggage();
                   break;
           }

       }
       for(int i=0;i<arr.length;i++){
           System.out.println(arr[i].notice());
       }

    }
}
