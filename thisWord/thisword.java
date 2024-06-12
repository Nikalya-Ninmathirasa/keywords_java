package thisWord;

public class thisword {


    
    public static void main(String[] args) {
        father f = new father();
      //  daughter d = new daughter();
         f.print('m', 50);
         System.out.println(f.gender);
         System.out.println(f.age);
       
        
    }

}


class father{

    char gender;
    int age;
    
     void print(char gender, int age){
        //this
        this.gender = gender;
        this.age = age;
      
    }
}



class daughter extends father{

         char gender;
   


   }


