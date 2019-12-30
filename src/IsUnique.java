import java.util.HashMap;

/* Given a String, determine if it has all unique characters
*/
public class IsUnique {

    public static void main(String[] args)
    {
        if(args.length==0) {
            System.out.println("Please provide an input");
            return;
            }
        System.out.print("Is this unique:"+args[0]+":"+IsUnique.isUnique(args[0]));
    }

    static boolean isUnique(String str)
    {
        HashMap<Character,Boolean> m=new HashMap<Character,Boolean>();
        for(int i=0;i<str.length();i++)
        {
            char c= str.charAt(i);
            if(m.containsKey(c))
                return false;
            m.put(c,true);
        }

    return true;
    }
}
