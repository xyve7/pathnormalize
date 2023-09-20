import java.util.stream.Collectors;

public class PathNormalize {
    private PathNormalize() {
    }

    public static String normalizeAll(String path, char delim) {
        StringBuilder pathNormalizerBuffer = new StringBuilder(path);
        return pathNormalizerBuffer.chars()
                .mapToObj(ch -> (char) ch)
                .map(ch -> ch == delim ? " " : ch)
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}
