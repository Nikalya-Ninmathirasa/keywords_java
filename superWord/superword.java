package superWord;

public class superword {

    
    public static void main(String[] args) {
       // father f = new father();
        daughter d = new daughter();
         
       // System.out.println(d.gender);
        d.print();
        
    }

}


class father{

    char gender='m';
   // int age;
    
     void print(){
        System.out.println("parent class");
    }
}



class daughter extends father{

    char gender='f';

    void print(){
        super.print();
    }


   }






    


    

