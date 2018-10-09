class Breakable extends Dish {

    private boolean broken;

    public Breakable(String name, boolean dirty, boolean broken){
        super(name, dirty);
        this.broken = broken;
    }

    public void Restore(){
        this.broken = false;
    }

    public void Break(){
        this.broken = true;
    }

    public void displayInfo(){
        if (this.broken == true){
            System.out.println("The "+super.getName()+" is broken\n");
        }
        else{
            System.out.println("The "+super.getName()+" is NOT broken and\n");
            super.displayInfo();
        }

    }
}
