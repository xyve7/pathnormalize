import java.util.Arrays;
import java.io.IOException;
/**
 * There should be a library like argparse (Python) or clap (Rust) in Java,
 * however for now I'm not going to use it.
 */
import java.nio.file.*;

class Main {
  public static void main(String[] args) {
    try {
      // Check if the correct number of arguments were passed
      if (args.length > 0) {
        // Instantiate the class which normalizes the entire path
        String newPath = PathNormalize.normalizeAll(args[0], args[1].charAt(0));
        System.out.println(args[0]);
        System.out.println(newPath);
        Files.move(Paths.get(args[0]), Paths.get(newPath));
      } else {
        System.err.println(Arrays.toString(args));
        System.err.println("pathnormalize: insufficent number of arguments");
      }
    } catch (IOException ex) {
      System.err.println(ex);
    }
  }
}
