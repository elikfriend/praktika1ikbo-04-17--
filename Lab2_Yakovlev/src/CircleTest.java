public class CircleTest {
    public static void main(String[] args){
        Circle crcl = new Circle(10.2f, 16.8f, 5);
        System.out.println("The cirle's coordinates are:\n"+crcl.getXpos()+" and "+crcl.getYpos()+"\nThe circle's radius is:\n"+crcl.getRadius());
        crcl.setPos(13,3);
        crcl.setRadius(3);
        System.out.println("The cirle's coordinates are:\n"+crcl.getXpos()+" and "+crcl.getYpos()+"\nThe circle's radius is:\n"+crcl.getRadius());
    }
}
