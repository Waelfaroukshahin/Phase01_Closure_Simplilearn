package com.vodafone.phase01Closure.sup;

import com.vodafone.phase01Closure.entities.Directory;

import phase01Closurescreen.FileOptionsScreen;
import phase01Closurescreen.Screen;
import phase01Closurescreen.FirstScreen;


public class ScreenService {
	


	public static FirstScreen FirstScreen = new FirstScreen();
    public static FileOptionsScreen FileOptionsScreen = new FileOptionsScreen();
    
    

    public static Screen CurrentScreen = FirstScreen;

    
    public static Screen getCurrentScreen() {
        return CurrentScreen;
    }

    
    public static void setCurrentScreen(Screen currentScreen) {
        CurrentScreen = currentScreen;
    }
    
    
    
}
