import java.util.Random;
 
public class Can {
        private final String material;
        private String contents;
        private boolean isCreatedFromHuman = false;
        private boolean isFull = true;
        private boolean isEmpty = false;
        public Can(String material, String contents){
                this.material = material;
                this.contents = contents;
        }
        public void drink(){
                isFull = false;
                isEmpty = true;
        }
        public String getMaterial(){
                return material;
        }
        public void fill(){
                isFull = true;
                isEmpty = false;
        }
        public static void main(String[] args){
                String s;
                Can c;  //declares a variable of type Can
                c = new Can("aluminum","coca-cola");
                Can d;
                d = new Can("skin","very strong acid");
                d.isCreatedFromHuman = true;
                
                Can e = new Can("titanium","diamonds");
                e.isCreatedFromHuman = false;
                Can f = new Can("human skull","blood");
                f.isCreatedFromHuman = true;
                
        }
       
       
        public static Can canMaker(){
                String a;
                String b;
               
                String s = new String("this is a string");
               
                Random r = new Random(100);
                a = ((Integer) r.nextInt()).toString();
                b = ((Integer) r.nextInt()).toString();
                // int  Integer
               
                return new Can(a,b);
        }
       
       
}
