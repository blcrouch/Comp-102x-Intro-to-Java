//This requires the comp102x library, available from https://courses.edx.org/courses/HKUSTx/COMP102x/2T2014/e1ac0d84b6a946278c98e4636a6f830f/
import comp102x.IO;

public class Lab02
{
    
    public static void multiply()
    {
        int x;
        int y;
        int calculatedAnswer;
        
        IO.output("Enter an integer, x: ");
        x = IO.inputInteger();
        IO.output("Enter an integer, y: ");
        y = IO.inputInteger();
        
        calculatedAnswer = x * y;
        
        IO.outputln("Answer = " + calculatedAnswer);       
    }
    
    public static void calculateTriangleArea()
    {
        double height;
        double width;
        double calculatedAnswer;
        
        IO.output("Enter the width of the triangle: ");
        width = IO.inputDouble();
        IO.output("Enter the height of the triangle: ");
        height = IO.inputDouble();
        
        calculatedAnswer = width * height / 2.0;
        
        IO.outputln("The triangle area = " + calculatedAnswer); 
    }
    
    public static void solveQuadraticEquation()
    {
        double a;
        double b;
        double c;
        double firstx;
        double secondx;
        
        IO.output("Enter a: ");
        a = IO.inputDouble();
        IO.output("Enter b: ");
        b = IO.inputDouble();
        IO.output("Enter c: ");
        c = IO.inputDouble();
        
        firstx = (-b + Math.sqrt((b*b)-(4*a*c)))/(2*a);
        secondx = (-b - Math.sqrt((b*b)-(4*a*c)))/(2*a);
        
        IO.outputln("First solution for x = " + firstx); 
        IO.outputln("Second solution for x = " + secondx); 
    }
}
