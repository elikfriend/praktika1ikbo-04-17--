public class Circle {
    private float x_position;
    private float y_position;
    private float radius;

    public Circle (float x, float y, float r){
        x_position = x;
        y_position = y;
        radius = r;
    }

    public float getXpos(){
        return this.x_position;
    }
    public float getYpos(){
        return this.y_position;
    }
    public float getRadius(){
        return this.radius;
    }

    public void setPos(float x, float y){
        x_position = x;
        y_position = y;
    }
    public void setRadius(float r){
        radius = r;
    }
}