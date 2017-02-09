/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pimpyagent;

import UI.*;
import pimpy.*;

/**
 *
 * @author Alain
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PimpyController controller = new PimpyController(PimpyDatabase.SQLITE_MODE);
//        JFrameConversation convers = new JFrameConversation(controller);
//        convers.setLocationRelativeTo(null);
//        convers.setVisible(true);
        JFrameInit init = new JFrameInit(controller);
        init.setLocationRelativeTo(null);
        init.setVisible(true);
    }

}
