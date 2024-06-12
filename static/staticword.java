public class staticword{

            public static void main(String[] args) {
                // father f = new father();
                // son s = new son();
                 son.gender = 'f';
                System.out.println(father.gender);
              //  son.print();
                
            }
        
        }
        
        
        class father{
        
          static  char gender='m';

            //static
           static void print(){
                System.out.println("parent class");
            }
        }
        
        

        class son extends father{

            // static void print(){
            //     System.out.println("hello");
            // }
        
           }
        
        
        
        
        
        
            
        
        
            
        
        
        

    