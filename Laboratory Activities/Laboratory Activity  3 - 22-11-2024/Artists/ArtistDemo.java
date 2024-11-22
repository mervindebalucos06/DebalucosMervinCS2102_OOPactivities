public class ArtistDemo {
  public static void main(String[] args) {
      // instance of Artist
      Artist artist = new Artist("Charlie Puth", "American", 32, "Music");
      artist.displayInfo();

      System.out.println();

      Singer singer = new Singer("Nayeon Im", "Korean", 29, "Music", Genre.POP);
      singer.displayInfo();

      System.out.println();

      Dancer dancer = new Dancer("Lisa", "Thai", 27, "Dance", DanceStyle.HIPHOP);
      dancer.displayInfo();

      System.out.println();

      Writer writer = new Writer("Jose Rizal", "Filipino", 30, "Writing", WritingStyle.FICTION);
      writer.displayInfo();

      System.out.println();

      Painter painter = new Painter("Leonardo da Vinci", "Italian", 39, "Painting", Medium.OIL);
      painter.displayInfo();

  }
}