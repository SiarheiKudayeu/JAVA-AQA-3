package utils.urls;

public enum Links {
    GUINNESS_APPLICATION_PAGE("https://www.guinnessworldrecords.com/records/"),
    AUTOMATION_PRACTICE("http://www.automationpractice.pl/index.php?controller=contact"),
    GUINNESS_SEARCH("https://www.guinnessworldrecords.com/search?term=%2A"),
    AUTO_COMPARE_PAGE("http://www.automationpractice.pl/index.php?id_category=3&controller=category#"),
    LOGIN_PAGE("https://www.guinnessworldrecords.com/account/login");
    private String link;

    public String getLink() {
        return link;
    }

    Links(String link) {
        this.link = link;
    }
}
