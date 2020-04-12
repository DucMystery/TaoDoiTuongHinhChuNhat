public class Rectangle {

    double width;
    double height;

    public Rectangle(){
        width =1;
        height =1;
    }

    public Rectangle(double width,double height){
        this.width =width;
        this.height =height;
    }

    public void setRectangle(double width,double height){
        if (width>0 && height>0){
            this.width =width;
            this.height =height;
        }
    }

    public double getArea(){
        return this.width*this.height;
    }

    public double getPerimeter(){
        return this.width*2+this.height*2;
    }
}
