package phase01Closurescreen;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.vodafone.phase01Closure.sup.DirectoryService;
import com.vodafone.phase01Closure.sup.ScreenService;


public class FirstScreen implements Screen {

    private String startingpoint = "Welcome to Phase01 Closure project ";
    private String authorName = "Wael Farouk";

    private ArrayList<String> options = new ArrayList<>();


    public FirstScreen() {
        options.add("1. Show Files");
        options.add("2. Show File Options Menu");
        options.add("3. Exit program");

    }
    
    public void introWS() {
    	System.out.println(startingpoint);
        System.out.println(authorName);
        System.out.println("\n");
        Show();
       
        
    }
    
    
    
    @Override
    public void Show() {
    	System.out.println("Main Menu");
        for (String s : options)  {
            System.out.println(s);
        }

    }

    public void GetUserInput() {
        int selectedOption  = 0;
        while ((selectedOption = this.getOption()) != 3) {
            this.NavigateOption(selectedOption);
        }
    }

    @Override
    public void NavigateOption(int option) {
        switch(option) {

            case 1: // Show Files in Directory
                this.ShowFiles();
                
                this.Show();
                
                break;
                
            case 2: // Show File Options menu
            	ScreenService.setCurrentScreen(ScreenService.FileOptionsScreen);
                ScreenService.getCurrentScreen().Show();
                ScreenService.getCurrentScreen().GetUserInput();
                
                this.Show();
                
                break;
                
            default:
                System.out.println("Invalid Option");
                break;
        }
        
    }

    public void ShowFiles() {

        //TODO: Get the files from the Directory
    	

        System.out.println("List of Files: ");
    	DirectoryService.PrintFiles();

    }
    
    private int getOption() {
        Scanner in = new Scanner(System.in);

        int returnOption = 0;
        try {
            returnOption = in.nextInt();
        }
        catch (InputMismatchException ex) {

        }
        return returnOption;

    }
}
