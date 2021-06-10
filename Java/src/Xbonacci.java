public class Xbonacci {

  public double[] tribonacci(double[] s, int n) {

    double[] result = new double[n];

    if (n == 0)
      return result;

    double a = s[0];
    double b = s[1];
    double c = s[2];
    double d;

    int i = 0;
    result[i] = a;
    i++;

    if (n == 1)
      return result;

    result[i] = b;
    i++;

    if (n == 2)
      return result;

    result[i] = c;
    i++;

    if (n == 3)
      return result;

    for (int j = 3; j < n; j++) {
      d = a + b + c;
      a = b;
      b = c;
      c = d;
      result[i] = c;
      i++;
    }
    return result;
  }
}