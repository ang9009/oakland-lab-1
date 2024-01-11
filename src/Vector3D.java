public class Vector3D {
    double x;
    double y;
    double z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return y;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public String toString() {
        return "(" + String.format("%.2f", x) + ", " + String.format("%.2f", y) + ", " + String.format("%.2f", z) + ")";
    }

    public double getMagnitude() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public Vector3D normalize() {
        double magnitude = getMagnitude();

        if(magnitude == 0) throw new IllegalStateException("Magnitude is 0");

        return new Vector3D(x / magnitude, y / magnitude, z / magnitude);
    }

    public Vector3D add(Vector3D otherVector) {
        return new Vector3D(x + otherVector.getX(), y + otherVector.getY(), z + otherVector.getZ());
    }

    public Vector3D multiply(int k) {
        return new Vector3D(k * x, k * y, k * z);
    }
}
//apoihewrwe3qrqwerqwre