/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package UI;

import pimpy.*;

/**
 *
 * @author Alain
 */
public class InitThread extends Thread {

    PimpyController controller = null;
    JFrameInit initFrame = null;

    public InitThread(PimpyController controller, JFrameInit initFrame) {
        this.controller = controller;
        this.initFrame = initFrame;
    }

    @Override
    public void run() {
        try {
            // Configure the debug object.
            controller.getDebugLogger().setDebugMode(false);
            controller.getDebugLogger().setLogToStdOut(false);
            controller.initializeTalker();
        } catch (Exception ex) {
            // Initialization failed.
            initFrame.notifyFailure(ex);
        }
    }

}
