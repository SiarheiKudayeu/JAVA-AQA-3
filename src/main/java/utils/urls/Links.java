package utils.urls;

public enum Links {
    GUINNESS_APPLICATION_PAGE("https://www.guinnessworldrecords.com/records/"),
    AUTOMATION_PRACTICE("http://www.automationpractice.pl/index.php?controller=contact"),
    GUINNESS_SEARCH("https://www.guinnessworldrecords.com/search?term=%2A"),
    AUTO_COMPARE_PAGE("http://www.automationpractice.pl/index.php?id_category=3&controller=category#"),
    LOGIN_PAGE("https://www.guinnessworldrecords.com/account/login"),
    DRAG_AND_DROP_PAGE("https://www.signesduquotidien.org/"),
    ANDERSEN("https://andersenlab.com/"),
    DOUBLE_AND_CONTEXT("https://demo.guru99.com/test/simple_context_menu.html"),
    IFRAME_PAGE("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width"),
    SELECT_PAGE("https://testautomationpractice.blogspot.com/");
    private String link;

    public String getLink() {
        return link;
    }

    Links(String link) {
        this.link = link;
    }
}
