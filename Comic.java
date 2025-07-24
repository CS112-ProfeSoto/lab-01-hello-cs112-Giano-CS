public class Comic {
    //INSTANCE VARIABLES
    private String writer;
    private String illustrator;
    private String colorist;
    private String title;
    private int issueNum;

    //CONSTRUCTORS
    public Comic(String writer, String illustrator, String colorist, String title, int issueNum) {
        this.setWriter(writer);
        this.setIllustrator(illustrator);
        this.setColorist(colorist);
        this.setTitle(title);
        this.setIssueNum(issueNum);
    }

    public Comic() {
        this("Jane", "John", "Mr. Placeholder", "Comic", 0)
    }




    //MUTATORS AND ACCESSORS
    public String getIllustrator() {
        return illustrator;
    }

    public String getWriter() {
        return writer;
    }

    public String getColorist() {
        return colorist;
    }

    public String getTitle() {
        return title;
    }

    public int getIssueNum() {
        return issueNum;
    }

    public void setIllustrator(String illustrator) {
        this.illustrator = illustrator;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public void setColorist(String colorist) {
        this.colorist = colorist;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setIssueNum(int issueNum) {
        this.issueNum = issueNum;
    }


    // toString method
    @Override
    public String toString() {
        return "Comic{" +
                "title='" + title + '\'' +
                ", issueNum=" + issueNum +
                ", illustrator='" + illustrator + '\'' +
                ", writer='" + writer + '\'' +
                ", colorist='" + colorist + '\'' +
                '}';
    }

    public boolean equals(Comic other) {
       if (other == null) {
            return false;
        }
       
        return this.title.equals(other.title) &&
               this.issueNum == other.issueNum &&
               this.illustrator.equals(other.illustrator) &&
               this.writer.equals(other.writer) &&
               this.colorist.equals(other.colorist);
    }


}
