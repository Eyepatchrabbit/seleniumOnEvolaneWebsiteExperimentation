package enums;

/**
 * Created by alexanderboffin on 26/05/17.
 */
public enum  platformPageExpectedElements {
    HEATHER("Platform"),
    SLOGAN("Is je IT-infrastructuur een noodzakelijk kwaad?");

    private String expected_;

    platformPageExpectedElements(String expected){
        this.expected_=expected;
    }

    public String getExpected(){return expected_;}
}
