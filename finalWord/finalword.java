package finalWord;

public class finalword {

        public static void main(String[] args) {
            // father f = new father();
            son s = new son();
             
            System.out.println(s.gender);
            s.print();
            
        }
    
    }
    
    
    class father{
    
      // final variable cannot change
       final char gender='m';
        
        // final cannot override
        final void print(){
            System.out.println("parent class");
        }
    }
    
    

    class son extends father{

  
    
       }
    
    
    
    
    
    
        
    
    
        
    
    
    


    

