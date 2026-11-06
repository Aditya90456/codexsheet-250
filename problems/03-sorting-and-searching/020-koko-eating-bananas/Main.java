// Judged input: one argument per line.
//   line 1: piles (integers, space separated)
//   line 2: h (int)
// Judged output: values separated by single spaces, booleans as true/false.

import java.io.*;
import java.util.*;

class Main {
  static String show(Object value) {
    if (value instanceof int[] array) return Arrays.toString(array).replaceAll("[\\[\\],]", " ").trim().replaceAll("\\s+", " ");
    if (value instanceof double[] array) return Arrays.toString(array).replaceAll("[\\[\\],]", " ").trim().replaceAll("\\s+", " ");
    if (value instanceof Object[] array) return show(Arrays.asList(array));
    if (value instanceof List<?> list) {
      StringJoiner joiner = new StringJoiner(" ");
      for (Object item : list) joiner.add(item instanceof Boolean flag ? String.valueOf(flag).toLowerCase() : String.valueOf(item));
      return joiner.toString();
    }
    if (value instanceof Boolean flag) return flag ? "true" : "false";
    return String.valueOf(value);
  }

  static int[] ints(String line) {
    if (line.isEmpty()) return new int[0];
    String[] parts = line.split(" ");
    int[] values = new int[parts.length];
    for (int index = 0; index < parts.length; index++) values[index] = Integer.parseInt(parts[index]);
    return values;
  }

  static double[] doubles(String line) {
    if (line.isEmpty()) return new double[0];
    String[] parts = line.split(" ");
    double[] values = new double[parts.length];
    for (int index = 0; index < parts.length; index++) values[index] = Double.parseDouble(parts[index]);
    return values;
  }

  static String[] strs(String line) {
    return line.isEmpty() ? new String[0] : line.split(" ");
  }

  // Write your solution below, then Submit to run the judged cases.
  static Object solution(int[] piles, int h) {
    return new int[0];
  }

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String[] lines = reader.lines().toArray(String[]::new);
    int[] piles = ints(lines[0]);
    int h = Integer.parseInt(lines[1]);
    System.out.println(show(solution(piles, h)));
  }
}
