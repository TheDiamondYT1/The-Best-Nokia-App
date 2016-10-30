/*
 * OH MY GOD WHY ARE YOU EVEN HERE NOKIA IS THE WORST
 * SERIOUSLY GO GET AN ANDROID OR IOS NOW
 * MADE WITH <3 BY THEDIAMONDYT MUHAHHAHHAHAHHAHAH
 */
package the_best_nokia_app;

import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;

/**
 * @author luke DA BEAST
 */
public class HelloMIDlet extends MIDlet implements CommandListener {
    
    private boolean midletPaused = false;

    private Command exitCommand;
    private Form form;
    private StringItem stringItem;

    public HelloMIDlet() {
    }

// OMG I HAD TO REMOVE SO MUCH USELESS COMMENTS BEFORE PUSHING THIS
    private void initialize() {
stringItem = new StringItem("", "Move to Android.", Item.PLAIN);
}

     /*
	  * STARTS THE BLOODY APP
	  */
    public void startMIDlet() {
switchDisplayable(null, getForm()); // IDEK WHAT THIS DOES


	/*
	  * DOES SOME STUFF
	  */
    public void resumeMIDlet() {
		
	}	
    /**
     * THIS USED TO BE A LONG DESCRIPTION BUT I SHORTENED IT TO SAY
	 * IDEK WHAT THIS DOES WOW 
     */
    public void switchDisplayable(Alert alert, Displayable nextDisplayable) {
Display display = getDisplay();
        if (alert == null) {
            display.setCurrent(nextDisplayable);
        } else {
            display.setCurrent(alert, nextDisplayable);
        }
	}      
	
	/**
     * CALLED BY THE SYSTEM APPARENTLY 
	 */
    public void commandAction(Command command, Displayable displayable) {
if (displayable == form) {
            if (command == exitCommand) {
				// I ACTUALLY STOLE THIS FROM A STACKOVERFLOW ANSWER
                Alert ExitAlrt = new Alert("Yo, nokia user.", // AHAHAHHAHA
                "Get outta here and buy an Android", null, AlertType.INFO);
        ExitAlrt.addCommand(new Command("Sure", Command.EXIT, 1)); 
        
        ExitAlrt.setCommandListener(new CommandListener() {
            public void commandAction(Command c, Displayable d) {
                System.out.println("Yes, he left!"); 
 
exitMIDlet();
            }
        });
        getDisplay().setCurrent(ExitAlrt);
}
        }
}


    /**
     * RETURNS SOMETHING.
	 * IM GONNA LEAVE THE AUTO GENERATED COMMENTS FROM NOW ON
     */
    public Command getExitCommand() {
        if (exitCommand == null) {
             
exitCommand = new Command("Exit", Command.EXIT, 0); // EXIT THIS AWESOME APP
            // write post-init user code here
}//GEN-BEGIN:|18-getter|2|
        return exitCommand;
    }
//</editor-fold>//GEN-END:|18-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: form ">//GEN-BEGIN:|14-getter|0|14-preInit
    /**
     * Returns an initialized instance of form component.
     *
     * @return the initialized component instance
	 *
	 * P.S. DONALD TRUMP IS GONNA KILL US ALL
     */
    public Form getForm() {
        if (form == null) {
//GEN-END:|14-getter|0|14-preInit
            // write pre-init user code here
form = new Form("Sup", new Item[]{stringItem});//GEN-BEGIN:|14-getter|1|14-postInit
            form.addCommand(getExitCommand());
            form.setCommandListener(this);//GEN-END:|14-getter|1|14-postInit
            // write post-init user code here
}//GEN-BEGIN:|14-getter|2|
        return form;
    }
//</editor-fold>//GEN-END:|14-getter|2|



 // WHITE SPACE HAHAHAHHAHAHHA SCROLL DOWN FOR MORE BAD CODE







 


    /**
     * Returns a display instance.
     *
     * @return the display instance.
     */
    public Display getDisplay() {
        return Display.getDisplay(this);
    }

    /**
     * Exits MIDlet.
     */
    public void exitMIDlet() {
        switchDisplayable(null, null);
        destroyApp(true);
        notifyDestroyed();
    }

    /**
     * Called when MIDlet is started. Checks whether the MIDlet have been
     * already started and initialize/starts or resumes the MIDlet.
     */
    public void startApp() {
        if (midletPaused) {
            resumeMIDlet();
        } else {
            initialize();
            startMIDlet(); // OK M8
        }
        midletPaused = false;
    }

    /**
     * Called when MIDlet is paused.
     */
    public void pauseApp() {
        midletPaused = true;
    }

    /**
     * Called to signal the MIDlet to terminate.
     *
     * @param unconditional if true, then the MIDlet has to be unconditionally
     * terminated and all resources has to be released.
     */
    public void destroyApp(boolean unconditional) {
    } // FINALLY ITS DESTORYED NOW ENJOY MORE WHITESPACE
    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
