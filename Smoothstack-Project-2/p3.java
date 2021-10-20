interface Shape {
    public void calculateArea();
    public void display();

}

class Triangle implements Shape {
    double b = 5;
    double h = 7;
    double area;

    public void calculateArea() {
        this.area =  b * h / 2;
    }

    public void display() {
        calculateArea();
        System.out.println("The area of the Triangle is: " + this.area);
    }
}

class Circle implements Shape {
    double r = 6;
    double area;

    public void calculateArea() {
        this.area = r * r * Math.PI;
    }

    public void display() {
        calculateArea();
        System.out.println("The area of the Circle is: " + this.area);
    }
}

class Rectangle implements Shape {
    double b = 8;
    double h = 7;
    double area;

    public void calculateArea() {
        this.area = b * h;
    }

    public void display() {
        calculateArea();
        System.out.println("The area of the Rectangle is: " + this.area);
    }

    public static void main(String[] args) {
        Triangle myTriangle = new Triangle();
        myTriangle.display();

        Circle myCircle = new Circle();
        myCircle.display();
        
        Rectangle myRectangle = new Rectangle();
        myRectangle.display();
    }
}