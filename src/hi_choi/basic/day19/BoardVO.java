package hi_choi.basic.day19;

public class BoardVO {

    protected String bdno;   // 글번호
    protected String title;   // 제목
    protected String userid;  // 작성자
    protected String regdate; // 작성일
    protected String views; // 조회수
    protected String thumbup; // 추천수
    protected String contents; // 본문

    public BoardVO(String bdno, String title, String userid, String regdate, String views, String thumbup, String contents) {
        this.bdno = bdno;
        this.title = title;
        this.userid = userid;
        this.regdate = regdate;
        this.views = views;
        this.thumbup = thumbup;
        this.contents = contents;
    }

    public String getBdno() {
        return bdno;
    }

    public void setBdno(String bdno) {
        this.bdno = bdno;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getRegdate() {
        return regdate;
    }

    public void setRegdate(String regdate) {
        this.regdate = regdate;
    }

    public String getViews() {
        return views;
    }

    public void setViews(String views) {
        this.views = views;
    }

    public String getThumbup() {
        return thumbup;
    }

    public void setThumbup(String thumbup) {
        this.thumbup = thumbup;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
}
