public class Vector3d extends AbstractVector {
    private double a;
    private double b;
    private double c;

    public Vector3d(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void get_sum2d(AbstractVector abstractVector) {
    }

    public void get_sub2d(AbstractVector abstractVector) {
    }

    public void get_scalar_mult2d(AbstractVector abstractVector) {
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public void get_sum3d(AbstractVector abstractVector) {
        Vector3d vector3d_2 = (Vector3d)abstractVector;
        double sum_a = this.a + vector3d_2.a;
        double sum_b = this.b + vector3d_2.b;
        double sum_c = this.c + vector3d_2.c;
        System.out.println("The Sum of two 3d vectors is [" + sum_a + " ; " + sum_b + " ; " + sum_c + "]");
    }

    public void get_sub3d(AbstractVector abstractVector) {
        Vector3d vector3d_2 = (Vector3d)abstractVector;
        double diff_a = this.a - vector3d_2.a;
        double diff_b = this.b - vector3d_2.b;
        double diff_c = this.c - vector3d_2.c;
        System.out.println("The difference of two 3d vectors = [" + diff_a + " ; " + diff_b + " ; " + diff_c + "]");
    }

    public void get_vector_mult3d(AbstractVector abstractVector) {
        Vector3d vector3d_2 = (Vector3d)abstractVector;
        double mult1 = this.b * vector3d_2.c - this.c * vector3d_2.b;
        double mult2 = this.a * vector3d_2.c - this.c * vector3d_2.a;
        double mult3 = this.a * vector3d_2.b - this.b * vector3d_2.a;
        System.out.println("The vector multiplication of two 3d vectors = [" + mult1 + " ; " + -mult2 + " ; " + mult3 + "]");
    }

    public void get_scalar_mult3d(AbstractVector abstractVector) {
        Vector3d vector3d_2 = (Vector3d)abstractVector;
        double multA = this.a * vector3d_2.a;
        double multB = this.b * vector3d_2.b;
        double multC = this.c * vector3d_2.c;
        System.out.println("The scalar multiplication of two 3d vectors = [" + multA + " ; " + multB + " ; " + multC + "]");
    }
}

