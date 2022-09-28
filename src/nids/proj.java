package nids;

import java.io.File;
import java.util.Scanner;

public class Proj {
	
    File file_name;
    
    private static final String WELCOME_STRING =
            "\n******************  LockedMe.com  *************************\n"
    +"\n*********** ProjectName: Virtual Key Repository ***********\n"+
                    "\n***************** Nidhi Lunagariya ************************\n";

    private static final String MAIN_MENU_STRING =
            "\nMain Menu - Choose your option: \n"+
                    "1 -> Get file names in ascending order\n"+
                    "2 -> Display the user interface\n"+
                    "3 -> Exit Program";

    private static final String NESTED_MENU_STRING =
            "   \nChoose the operation to do: \n"+
                    "   1 -> Add a file\n"+
                    "   2 -> Delete a file\n"+
                    "   3 -> Search a file\n"+
                    "   4 -> GoBack to Main Menu";

    public Proj() {
            file_name = new File("C:\\Users\\admin\\JavaProject\\");
        if (!file_name.exists())
            file_name.mkdirs();
        
    }
    
    void showMainMenu() {
        System.out.println(MAIN_MENU_STRING);
        try{
            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();
            switch (option){
                case 1 : {
                   
                }
                case 2 : {
                    
                }
                case 3 : {
                    System.out.println("Thanks...");
                    System.exit(0);
                }
                default: {
                	showMainMenu();
                }
            }
        }
        catch (Exception e){
            System.out.println("Please Enter 1, 2 Or 3");
            showMainMenu();
        }
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Proj proj=new Proj();
		proj.showMainMenu();
		
	}

}
