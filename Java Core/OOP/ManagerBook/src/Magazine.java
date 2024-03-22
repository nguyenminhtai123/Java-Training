public class Magazine extends Document{
    private int issueNumber;
    private int monthIssue;
    public Magazine(String id, String publisher, int number, int issueNumber, int monthIssue) {
        super(id, publisher, number);
        this.issueNumber = issueNumber;
        this.monthIssue = monthIssue;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public int getMonthIssue() {
        return monthIssue;
    }

    public void setMonthIssue(int monthIssue) {
        this.monthIssue = monthIssue;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "issueNumber=" + issueNumber +
                ", monthIssue=" + monthIssue +
                ", id='" + id + '\'' +
                ", publisher='" + publisher + '\'' +
                ", number=" + number +
                '}';
    }
}
