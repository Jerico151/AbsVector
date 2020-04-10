public class Vector2d extends AbstractVector  {
    private double x;
    private double y;

    public Vector2d(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public void get_vector_mult3d(AbstractVector abstractVector) {
    }

    public void get_sum3d(AbstractVector abstractVector) {
    }

    public void get_sub3d(AbstractVector abstractVector) {
    }

    public void get_scalar_mult3d(AbstractVector abstractVector) {
    }

    public void get_sum2d(AbstractVector abstractVector) {
        Vector2d vector2d_2 = (Vector2d)abstractVector;
        double sum_x = this.x + vector2d_2.x;
        double sum_y = this.y + vector2d_2.y;
        System.out.println("The sum is [" + sum_x + " ; " + sum_y + "]");
    }

    public void get_sub2d(AbstractVector abstractVector) {
        Vector2d vector2d_2 = (Vector2d)abstractVector;
        double diff_x = this.x - vector2d_2.x;
        double diff_y = this.y - vector2d_2.y;
        System.out.println("The difference is [" + diff_x + " ; " + diff_y + "]");
    }

    public void get_scalar_mult2d(AbstractVector abstractVector) {
        Vector2d vector2d_2 = (Vector2d)abstractVector;
        double mult = this.x * vector2d_2.x + this.y * vector2d_2.y;
        System.out.println("The miltiplication is " + mult);
    }
}

