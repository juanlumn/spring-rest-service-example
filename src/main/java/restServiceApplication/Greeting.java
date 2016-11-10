package restServiceApplication;

/**
 * Greeting class
 */
public class Greeting {

    private final long id;
    private final String content;

    /**
     * Constructor
     *
     * @param id long param increased each time
     * @param content String value, by default 'World'
     */
    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
