
package classes;

import javax.swing.JOptionPane;

/**
 *
 * @author Cristiano
 */
public class Resistor {
    private float resistor1, resistor2;

    public Resistor(float resistor1, float resistor2) {
        this.resistor1 = resistor1;
        this.resistor2 = resistor2;
    }

    

    public Resistor() {
       
    }
    
    

    public float getResistor1() {
        return resistor1;
    }

    public void setResistor1(float resistor1) {
        this.resistor1 = resistor1;
    }

    public float getResistor2() {
        return resistor2;
    }

    public void setResistor2(float resistor2) {
        this.resistor2 = resistor2;
    }

    
    public float serie(){
        return resistor1+resistor2;
    }
    
    public float paralelo(){
        float resistoreq=0;
        float res=0;
        resistoreq = (1/resistor1)+(1/resistor2);
        res = 1/resistoreq;
        
        return res;
    }
}
