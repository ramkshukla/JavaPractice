class Box{
    double width;
    double height;
    double depth;

    Box(double w, double h, double d){
        System.out.println("This is a constructor for the box");
        width = w;
        height = h;
        depth = d;
    }
    double volume(){
        return width * height * depth;
    }
}

class BoxDemo{
    public static void main(String[] args) {
        Box box1 = new Box(10, 20,15);
        Box box2 = new Box(20, 20, 15);

        //Find the volume of the box
        double vol1 = box1.volume();
        double vol2 = box2.volume();

        System.out.println("Volume is " + vol1);
        System.out.println("Volume is " + vol2);
    }
}