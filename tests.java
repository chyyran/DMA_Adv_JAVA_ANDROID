import Can

public class tests{
    public static void main(String[] args){
                //String s; String s is never used. Don't declare unused objects
                
                
                //Don't split declarations into 2 lines.
                //Can c;  //declares a variable of type Can 
                //c = new Can("aluminum","coca-cola");
                
                Can c = new Can("aluminum", "coca-cola", false); //We declare isMadeFromHuman in the object declaration
                    
                Can d = new Can("skin","very strong acid", true); 
                
                //d.isCreatedFromHuman = true; We have already declared it in object declaration
                
                //Do some debugging here
                System.out.println(c.contents);
                
                System.out.println("Can c is "+c.isFull);
                
                c.drink();
                
                System.out.println("Can c is "+c.isFull);
        }
    }
