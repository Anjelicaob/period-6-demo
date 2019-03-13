
/**
 * A guess the password program.
 *
 * @author Anjelica Ortiz
 * @version 11/20/18
 */
public class reverse
{
    public static final String SECRET_PASSWORD = "FiveBirds";
    
    static String obfuscate(String input)
    {
        
        return input.replace('e', 'p').replace('f', 'i');
    }
    
    public static void main(String[] args)
    {
        if(args.length != 1)
        {
            System.out.println("Wrong! You have to run this program with one argument :\njava Reverse <argument>");
            return;
        }
        
        if(args[0].equals(obfuscate(SECRET_PASSWORD)))
        {
            System.out.println("You win, congrats!");
        } 
        else
        {
            System.out.println("Wrong password, try again!");
        }
        
    }
}
