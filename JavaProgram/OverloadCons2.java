class Box{
    double width;
    double height;
    double depth;

    Box(Box ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
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
        return width*height*depth;
    }
}

class  OverloadCons2{
    public static void main(String[] args) {
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mybox3 = new Box(7);

        Box myclone = new Box(mybox1); // create copy of mybox1
        double vol;

        // get volume of the first box
        vol = mybox1.volume();
        System.out.println("Volume of the box1 " + vol);

        vol = mybox2.volume();
        System.out.println("Volume of the box2 " + vol);

        vol = mybox3.volume();
        System.out.println("Volume of the box3 " + vol);

        vol = myclone.volume();
        System.out.println("Volume of the clone is " + vol);
    }
}