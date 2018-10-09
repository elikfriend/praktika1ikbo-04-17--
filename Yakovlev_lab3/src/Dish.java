public abstract class Dish {

    //private int amount;
    private String name;
    private boolean dirty;

    public String getName(){
        return name;
    }

    public boolean checkDirt(){
        return dirty;
    }

    public void Clean(){
        this.dirty = false;
    }

    public void getDirty(){
        this.dirty = true;
    }

    public Dish(String name, boolean dirty){
        this.name = name;
        this.dirty = dirty;
    }

    public void displayInfo(){
        if (this.dirty == true){
            System.out.println("The "+getName()+" is dirty\n");
        }
        else{
            System.out.println("The "+getName()+" is clean\n");
        }
    }
}
