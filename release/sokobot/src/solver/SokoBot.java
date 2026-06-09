package solver;

public class SokoBot {

  public String solveSokobanPuzzle(int width, int height, char[][] mapData, char[][] itemsData) {
    System.out.println("Width: " + width + " Height: " + height);
    System.out.println("Map Data:");
    for (int y = 0; y < height; y++) {
      for (int x = 0; x < width; x++) {
        System.out.print(mapData[y][x]);
      }
      System.out.println();
    }
    System.out.println("Items Data:");
    for (int y = 0; y < height; y++) {
      for (int x = 0; x < width; x++) {
        System.out.print(itemsData[y][x]);
      }
      System.out.println();
    }
    try {
      Thread.sleep(100);
    } catch (Exception ex) {
      ex.printStackTrace();
    }
    return "lrlrlrlrlrlrlrlrlrlrlrlrlrlrlrlrlrlrlrlrlrlrlrlrlrlrlrlrlrlrlrlrlrlrlrlrlrlr";
  }

}
