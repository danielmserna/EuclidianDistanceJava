import java.util.ArrayList;
import java.lang.Math;

class Main {
  public static void main(String[] args) {
  int[][] arg = {{10,9},{9,8},{11,12},{3,4}};
  double eu = euclidian(arg);
   System.out.println(String.valueOf(eu));
  }

  public static double euclidian(int[][] p){
    ArrayList<Double> arrayOfDistances = new ArrayList<>();
    for (int i = 0; i < p.length; i++){
      arrayOfDistances.add(distance(p[i][0],p[i][1]));
    } 
    double[] arrayConverted = arrayOfDistances.stream().mapToDouble(d -> d).toArray();
    return getMinValue(arrayConverted);
  }

  public static double distance (int x, int y) { 
    double result = Math.sqrt(y*y +x*x);
    return result;
  }

  public static double getMinValue(double[] array) {
    double minValue = array[0];
    for (int i = 1; i < array.length; i++) {
        if (array[i] < minValue) {
            minValue = array[i];
        }
    }
    return minValue;
  }

}