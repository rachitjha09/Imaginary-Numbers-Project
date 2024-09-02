/**
 * Real Numbers
 *
 * @author (Rachit Jha)
 * @version (3/24/24)
 */
public class RealNumber extends ComplexNumber
{
    public RealNumber(double r){
        super(0.0, r);
    }
    public String toString(){
        return getReal() + "";
    }
}


