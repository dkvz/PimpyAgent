/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package UI;

import pimpy.*;
import conversationModel.*;

/**
 *
 * @author Alain
 */
public class AnsweringThread extends Thread {

    PimpyController controller = null;
    JFrameConversation convers = null;
    String submitted = "";

    public AnsweringThread(PimpyController controller, JFrameConversation convers, String submitted) {
        this.controller = controller;
        this.convers = convers;
        this.submitted = submitted;
    }

    @Override
    public void run() {
        try {
            convers.setStatus(convers.getAgentName() + " is typing a message...");
            String answer = controller.getAnswer(submitted);
            if (answer == null) {
                answer = "...";
            }
            convers.appendMessage(convers.getAgentName(), answer, true);
        } catch (TalkerNotInitializedException ex) {
            convers.notifyFailure(ex);
        }
        convers.setStatus(convers.getAgentName() + " is listening.");
    }

}
