/**
 * Complex Numbers
 *
 * @author (Rachit J)
 * @version (3/24/24)
 */
public class ComplexNumber
{
    private double imaginary;
    private double real;
    public ComplexNumber(double i, double r){
        imaginary=i;
        real=r;
    }
    public double getImaginary(){
        return imaginary;
    }
    public double getReal(){
        return real;
    }
    public String add(ComplexNumber num){
        double i=0.0;
        double r=0.0;   
        if(num instanceof ImaginaryNumber){
            i=num.getImaginary() + imaginary;
            return i + "i";
        }
        if(num instanceof RealNumber){
            r=num.getReal() + real;   
            return r + "";
        }
        if(num instanceof ComplexNumber){
            r=num.getReal() + real;
            i=num.getImaginary() + imaginary;   
            return r + "" + " + " + i + "i";
        }
        return "error";
    }
    public String multiply(ComplexNumber num){
        double i=0.0;
        double r=0.0;
        String str="";
        if(num instanceof ImaginaryNumber){
            i=num.getImaginary() * imaginary;
            return (i*-1) + "";
        }
        if(num instanceof RealNumber){
            r=num.getReal() * real;   
            return r+"";
        }
        if(num instanceof ComplexNumber){
            r=num.getReal() * real;
            i=num.getImaginary() * imaginary * -1;
            if(r==0){
                r=num.getReal();
            }
            if(i==0){
                str=num.getImaginary() + "i";
                return r + "" + " + " + str;
            }   
            return r + "" + " + " + i;
        }
        return "error";   
    }
    public String toString(){
        return imaginary + " " + " + " + real;
    }
}

