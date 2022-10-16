
/*Write a class with the name Wall. The class needs two fields (instance variables) with name width and height of type double. The class needs to have two constructors. The first constructor does not have any parameters (no-arg constructor). The second constructor has parameters width and height of type double and it needs to initialize the fields. In case the width is less than 0 it needs to set the width field value to 0, in case the height parameter is less than 0 it needs to set the height field value to 0. Write the following methods (instance methods): * Method named getWidth without any parameters, it needs to return the value of width field. * Method named getHeight without any parameters, it needs to return the value of height field. * Method named
setWidth with one parameter of type double, it needs to set the value of the width field.
If the parameter is less than 0 it needs to set the width field value to 0.
*  * Method named setHeight with one parameter of type double,
it needs to set the value of the height field.
If the parameter is less than 0 it needs to set the height field value to 0.
* Method named getArea without any parameters, it needs to return the area of the wall.
TEST EXAMPLE → TEST CODE: (Write bellow code
 into main method and run and compare result with OUTPUT) Wall wall = new Wall (5, 4);
System.out.println("area= " + wall.getArea()); wall.setHeight(-1.5);
System.out.println("width= " + wall.getWidth());
 System.out.println("height= " + wall.getHeight());
System.out.println("area= " + wall.getArea()); →
OUTPUT:
 area= 20.0
 width= 5.0
 height= 0.0
 area= 0.0
NOTE:
All methods should be defined as public NOT public static.
NOTE: In total, you have to write 5 methods and 2 constructors.
 */
public class Program15 {
    double width, height;

    public static void main(String[] args) {
        Program15 wall = new Program15(5, 4);

        System.out.println("OUTPUT :");
        System.out.println("area=" + wall.getarea());
        wall.setHeight(-1.5);
        System.out.println("width=" + wall.getWidth());
        System.out.println("height=" + wall.getHeight());
        System.out.println("area=" + wall.getarea());

    }

    public Program15() {//constructor 1
    }

    public Program15(double width, double height) {//constructor 2
        this.width = width;
        this.height = height;
        if (width < 0) {
            this.width = 0;
        }
        if (height < 0) {
            this.height = 0;
        }
    }

    //getters
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    //setters
    public void setWidth(double width) {//method with 1 parameter of type double
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;

        } else {
            this.height = height;
        }
    }

    public double getarea() {//method without any parameter with return type
        return (this.height * this.width);//area of the wall
    }


}
