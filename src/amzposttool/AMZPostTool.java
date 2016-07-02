/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amzposttool;

/**
 *
 * @author Kailin Huang
 */
/*
v0.1.0 initial release
v0.1.1 bug fix compare and baseline changed

*/
public class AMZPostTool {
    public String version = "v0.1.1";

    /**
     * @param args the command line arguments
     */
    
    public AMZPostTool() {
        
    }


    public static void main(String[] args) {
        // TODO code application logic here
        
        ToolBasicFrame basicFrame= new ToolBasicFrame();
        basicFrame.setVisible(true);
        System.out.println("Hello World!!!!!!!!!!");
    
    }
    
}
