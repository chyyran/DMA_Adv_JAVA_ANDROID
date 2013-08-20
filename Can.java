import java.util.Random;
 
public class Can {
        private final String material;
        private String contents;
        private boolean isCreatedFromHuman; //Do not set defaults by internal class, instead use overloads
        private boolean isFull;
        
        //below is redundant
        //private boolean isEmpty = false;
        
        public Can(String material, String contents, boolean isCreatedFromhuman, boolean isFull){
                this.material = material;
                this.contents = contents;
                this.isCreatedFromhuman = isCreatedFromhuman;
                this.isFull = isFull;
        }
        
        public Can(String material, String contents){
                return new Can(material, contents, true, true) //this is an overload
        }
        
        
        public void drink(){
                isFull = false;
        }
        
        public String getMaterial(){
                return material;
        }
        
        public void fill(){
                isFull = true;
        }
       
        public static Can canMaker(){
                String a;
                String b;
               
                //Do not initialize new String class like this
                //String s = new String("this is a string");
               
                String s = "this is a string"
                Random r = new Random(100);
                a = ((Integer) r.nextInt()).toString();
                b = ((Integer) r.nextInt()).toString();
                // int  Integer
               
                return new Can(a,b, true, true);
        }
       
       
}
