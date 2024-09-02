/**
 * Imaginary Numbers
 *
 * @author (Rachit Jha)
 * @version (3/24/24)
 */
public class ImaginaryNumber extends ComplexNumber
{
    public ImaginaryNumber(double d){
        super(d, 0.0);
    }   
    public String toString(){
        return getImaginary() + "i";
    }
}


