package uname.group.vaqueiro.model;

public class Aboio {
    private final long id;
    private final String content;

    public Aboio(long id, String content) {
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
