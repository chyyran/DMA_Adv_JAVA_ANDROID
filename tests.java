import Can

public class tests{
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
    }
