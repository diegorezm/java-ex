package triangulo;

public class Triangulo {
  private float x, y, z;

  public Triangulo(float x, float y, float z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  public boolean ehTriangulo() {
    int tipoTriangulo = 1;
    if (x + y <= z || x + z <= y || y + z <= x) {
      tipoTriangulo = 0;
    }
    return tipoTriangulo == 0 ? false : true;
  }

  public float getX() {
    return x;
  }

  public void setX(float x) {
    this.x = x;
  }

  public float getY() {
    return y;
  }

  public void setY(float y) {
    this.y = y;
  }

  public float getZ() {
    return z;
  }

  public void setZ(float z) {
    this.z = z;
  }

  public byte getTipoTriangulo() {
    byte tipoTriangulo = 0;
    if (!ehTriangulo()) {
      return 0;
    }
    if (x == y && y == z) {
      tipoTriangulo = 1;
    } else if (x == y || x == z || y == z) {
      tipoTriangulo = 2;
    } else {
      tipoTriangulo = 3;
    }
    return tipoTriangulo;
  }
}