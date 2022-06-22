
public class book {
    private String name;
    private int str;
    private String author;

    public book(String n, int s, String a) {
        name = n;
        str = s;
        author = a;
    }

    public book(String n, int s) {
        name = n;
        str = s;
        author = "Unknown";
    }

    public book() {
        name = "Unknown name";
        str = 100;
        author = "Unknown";
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public int getStr() {
        return str;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public void output() {
        System.out.println(name + " " + str + " str. " + "by " + author);
    }
}
