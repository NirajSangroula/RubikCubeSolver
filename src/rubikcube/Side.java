/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubikcube;

/**
 *
 * @author Administrator
 */
public class Side {

    private String color;
    public static final String DISABLED = "Disabled Color";
    
    public Side(){
        disable();
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public String getColor(){
        return color;
    }

    final void disable() {
        setColor(DISABLED);
    }
}
