public class Newspaper extends Document{
    private int dayIssue;
    public Newspaper(String id, String publisher, int number, int dayIssue) {
        super(id, publisher, number);
        this.dayIssue = dayIssue;
    }

    public int getDayIssue() {
        return dayIssue;
    }

    public void setDayIssue(int dayIssue) {
        this.dayIssue = dayIssue;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "dayIssue=" + dayIssue +
                ", id='" + id + '\'' +
                ", publisher='" + publisher + '\'' +
                ", number=" + number +
                '}';
    }
}
