import java.util.Optional;

class Snippets {

    // @start region="example"
    private String snippet;

    public Snippets(String snippet) {}
    // @end

    // @start region = other-example
    public Optional<String> getSnippet() {
        return Optional.of(snippet);
    }
    // @end

}
