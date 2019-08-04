public class MoveablePoint extends Point{
    private float xSpeed =0.0f;
    private float ySpeed=0.0f;
    public MoveablePoint(){
    }
    public MoveablePoint(float xSpeed, float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public   MoveablePoint( float x, float y,float xSpeed, float ySpeed){
        super(x,y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public float[] Speed(){
        float[] speed = {this.xSpeed, this.ySpeed};
        return speed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public MoveablePoint move(){
        float x = super.getX();
        float y = super.getY();
        x += this.xSpeed;
        y += this.ySpeed;
        super.setX(x);
        super.setY(y);
        return this;
    }
    @Override
    public  String toString (){
        return super.toString() + "," + "(" + this.xSpeed + "," + this.ySpeed + ")";
    }
    }

