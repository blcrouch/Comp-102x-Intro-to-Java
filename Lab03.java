//This requires the comp102x library, available from https://courses.edx.org/courses/HKUSTx/COMP102x/2T2014/e1ac0d84b6a946278c98e4636a6f830f/
import comp102x.ColorImage;
import comp102x.Canvas;

public class Lab03
{  
    public void loadAnImage() 
    {
        // Please write your code after this line
        ColorImage image1 = new ColorImage(); //Default image
        Canvas canvas = new Canvas(image1.getWidth(), image1.getHeight()); //Create a canvas for ColorImage
        canvas.add(image1, 0,0);
    }
    
    public void loadTwoImagesOnTheSameCanvas()
    {
        // This assumes image1 has greater or equal height, and that image1 and image2 have the same width
        ColorImage image1 = new ColorImage(); 
        ColorImage image2 = new ColorImage();
        Canvas canvas = new Canvas(2*image1.getWidth(), image1.getHeight());
        canvas.add(image1, 0,0);
        canvas.add(image2, image1.getWidth(),0);
    }
    
    public void imageAddition() 
    {    
        // This assumes image1 has greater or equal height, and that image1 and image2 have the same width
        ColorImage image1 = new ColorImage(); 
        ColorImage image2 = new ColorImage();
        ColorImage image3 = ColorImage.add(image1, image2);
        Canvas canvas = new Canvas(3*image1.getWidth()+20, image1.getHeight());
        canvas.add(image1, 0,0);
        canvas.add(image2, image1.getWidth()+10,0);
        canvas.add(image3, image1.getWidth()+10+image2.getWidth()+10,0);
    }
   
    public void imageMultiplication() 
    {
        // This assumes image1 has greater or equal height, and that image1 and image2 have the same width
        ColorImage image1 = new ColorImage(); 
        ColorImage image2 = new ColorImage();
        ColorImage image3 = ColorImage.multiply(image1, image2);
        Canvas canvas = new Canvas(3*image1.getWidth()+20, image1.getHeight());
        canvas.add(image1, 0,0);
        canvas.add(image2, image1.getWidth()+10,0);
        canvas.add(image3, image1.getWidth()+10+image2.getWidth()+10,0);
    }
    
    public void changeColor()
    {
        ColorImage image = new ColorImage();
        image.increaseRed(40);
        Canvas canvas = new Canvas(image.getWidth(), image.getHeight());
        canvas.add(image);
        
        //image.save();
    }
}
