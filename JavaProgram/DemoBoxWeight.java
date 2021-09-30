class Box{
    double width;
    double height;
    double depth;

    Box(Box o){
        width = o.width;
        height = o.height;
        depth = o.depth;
    }

    Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
    Box(){
        width = -1;
        height = -1;
        depth = -1;
    }
    Box(double len){
        width = height = depth = len;
    }

    double volume(){
        return width * height* depth;
    }
}

class BoxWeight extends Box{
    double weight;

    BoxWeight(double w, double h, double d, double m){
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}

class DemoBoxWeight{
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.5);
        BoxWeight mybox2 = new BoxWeight(2,3,4,0.076);
        double vol;

        vol = mybox1.volume();
        System.out.println("Volume of the mybox1 " + vol);
        System.out.println("Weight of the mybox1 " + mybox1.weight);

        vol = mybox2.volume();
        System.out.println("Volume of the mybox2 " + vol);
        System.out.println("Weight of the mybx2 " + mybox2.weight);

    }
}
