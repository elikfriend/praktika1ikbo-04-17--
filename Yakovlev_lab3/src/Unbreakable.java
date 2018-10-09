class Unbreakable extends Dish {

    public Unbreakable(String name, boolean dirty){
        super(name, dirty);
    }

    public void Break(){
        System.out.println("The "+super.getName()+" is unbreakable\n");
    }

    public void displayInfo() {
        super.displayInfo();
    }
}
