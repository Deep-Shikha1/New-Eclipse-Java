import java.util.Scanner;

public class percentage1 {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        //find average
        System.out.println("Enter your no. ");
        int phy = sc.nextInt();
        int chem = sc.nextInt();
        int math = sc.nextInt();
        int eng = sc.nextInt();
        int hindi = sc.nextInt();
        float Total = phy + chem + math + eng + hindi;
        System.out.println("Total marks: " + ((Total) / 500) *100) ;

        //print name
        /*System.out.println("Enter your name:" );
        String name = sc.nextLine();
        System.out.println("Hello " + name);
        */


        //convert Killometers in Miles
       /* System.out.println("Enter your KM: ");
        float a = sc.nextFloat();
        System.out.println("Convert into miles: " + a*1.60934);
        */

        //detect no. is integer or not
       /* System.out.println("Enter your no:");
        System.out.println(sc.hasNextInt());
*/



    }
}
