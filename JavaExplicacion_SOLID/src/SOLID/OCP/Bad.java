
package SOLID.OCP;


public class Bad {
    
    
    class Rectangle {
        public double width;
        public double height;
    }

    class AreaCalculator {
        public double calculateRectangleArea(Rectangle rectangle) {
            return rectangle.width * rectangle.height;
        }
    }
    
}
