
public class Vector3D {
    double xComponent;
    double yComponent;
    double zComponent;

    public Vector3D(double xComponent, double yComponent, double zComponent) {
        this.xComponent = xComponent;
        this.yComponent = yComponent;
        this.zComponent = zComponent;
    }

    public String toString() {
        return "(" + Math.round(xComponent * 100) / 100 + ", " + Math.round(yComponent * 100) / 100 + ", " + Math.round(zComponent * 100) / 100 + ")";
    }

    public Double getMagnitude() {
        return Math.sqrt((xComponent * xComponent) + (yComponent * yComponent) + (zComponent * zComponent));
    }

    public Vector3D normalize() {
        double magnitude = getMagnitude();
        if (magnitude == 0.0) {
            throw new IllegalStateException("Cannot normalize a vector with zero magnitude.");
        }
        return new Vector3D(xComponent / magnitude, yComponent / magnitude, zComponent / magnitude);
    }
    
    public Vector3D add(Vector3D other) {
        return new Vector3D(this.xComponent + other.xComponent,
                this.yComponent + other.yComponent,
                this.zComponent + other.zComponent);
    }


    public double multiply(Vector3D vector, double constant) {
        double multipliedValue;
        multipliedValue = (vector.xComponent * constant + vector.yComponent * constant + vector.zComponent * constant);
        return multipliedValue;
    }


}

