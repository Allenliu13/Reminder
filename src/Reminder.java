import java.util.Scanner;
public class Reminder
{
    public static void showList()
    {
        System.out.println("1. full-size car.");
        System.out.println("2. mid-size car.");
        System.out.println("3. compact car.");
        System.out.println("4. SUV.");
        System.out.println("What is your choice: ");
    }
    public static void ifElse()
    {
        int choice=0;
        Scanner input = new Scanner(System.in);
        choice=input.nextInt();
        if(choice>=1||choice<=4)
        {
            if (choice == 1)
            {
                System.out.println("Your choice is a full-size car and the price is $175 per week.");
            }
            else if (choice == 2)
            {
                System.out.println("Your choice is a mid-size car and the price is $175 per week.");
            }
            else if (choice == 3)
            {
                System.out.println("Your choice is a compact car and the price is $160 per week.");
            }
            else if (choice == 4)
            {
                System.out.println("Your choice is a SUV and the price is $200 per week.");
            }
            else
            {
                System.out.println("You don't choose any car, so the price is $0.");
            }
            System.out.println("Do you want add premium sound package?\n1 is yes, 2 is no");
            choice=input.nextByte();
            if(choice==1)
            {
                System.out.println("The premium sound package adds $30 to the rental cost.");
            }
            else
            {
                System.out.println("You are all sit.");
            }
        }
        else
        {
            System.out.println("You don't choose any car, so the price is $0.");
        }
    }

    public static void main(String[] args)
    {
        showList();
        ifElse();


    }
}
