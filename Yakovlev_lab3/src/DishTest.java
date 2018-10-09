public class DishTest {
    public static void main(String[] args){
        Breakable plate = new Breakable("plate", false, false);
        Unbreakable teapot = new Unbreakable("silver teapot", true);
        plate.displayInfo();
        plate.getDirty();
        plate.displayInfo();
        plate.Break();
        plate.displayInfo();
        plate.Restore();
        plate.displayInfo();

        teapot.getDirty();
        teapot.displayInfo();
        teapot.Break();
        teapot.Clean();
        teapot.displayInfo();
    }
}
