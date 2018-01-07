public class Area
{
  public static void main (String args[])
  {
    new Area ();
  }
  
  
  public Area ()
  {
    char more = 'y';
    
    while (more == 'Y' || more == 'y')
    {
      printmenu ();
      int answer = IBIO.inputInt ("Which object do you have? (1-5) ");
      double area = -1;
     
      if (answer == 1)
        area = circle ();
      else if (answer == 2)
        area = rectangle ();
      else if (answer == 3)
        area = triangle ();
      else if (answer == 4)
        area = square ();
      else if (answer == 5)
        area = sphere ();
      
      if (area == -1)
        System.out.println ("You must choose 1 to 5.");
      else
        System.out.println ("The area is " + area);
      
      System.out.println ("");
      more = IBIO.inputChar ("Do you want to find the area of anything else? (y/n) ");
    } 
    
    while (more == 'Y' || more == 'y')
      printmenu ();
    System.out.println ("Goodbye!");
  } //constructor
  
  
  public void printmenu ()
  {
    System.out.println ("*** Menu ***");
    System.out.println ("1. Circle");
    System.out.println ("2. Rectangle");
    System.out.println ("3. Triangle");
    System.out.println ("4. Square");
    System.out.println ("5. Sphere");
    
 
  }
  
  
  public double circle ()
  { 
    double radius = IBIO.inputDouble ("Enter a radius.");
      
      return Math.PI*Math.pow (radius,2);
  } 
  
  
  public double rectangle ()
  { 
    double length = IBIO.inputDouble ("Enter a length.");
    double width = IBIO.inputDouble ("Enter a width.");
    return length*width;
  } 
  
  
  public double triangle ()
  {
    double base = IBIO.inputDouble ("Enter a value for the base.");
    double height = IBIO.inputDouble ("Enter a value for the height.");
    return (base*height)/2;
  } 
  
  
  public double square ()
  {  
    double length = IBIO.inputDouble ("Enter a length.");

    return Math.pow (length,2);
    
  } 
  
  
  public double sphere ()
  { 
    double radius = IBIO.inputDouble ("Enter a radius.");
    return 4*Math.PI*Math.pow (radius,2);
  } 
}