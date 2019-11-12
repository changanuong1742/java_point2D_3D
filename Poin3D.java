public class Poin3D extends Point2D {

    private float z = 0.0f;


    public Poin3D() {
    }

    public Poin3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }


    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }


    public void setXYZ(float x, float y, float z) {
    }

    public float[] getXYZ() {
        float[] xyz = new float[3];
        xyz[0] = this.getX();
        xyz[1] = this.getY();
        xyz[2] = this.z;
        return xyz;

    }


    public String toString() {
        for (int i = 0; i < getXYZ().length; i++) {

            System.out.println(getXYZ()[i]);
        }
        return  getXYZ() + "Mang";
    }

}
