package enums;

/**
 * Created by alexanderboffin on 26/05/17.
 */
public enum  protectiePageExpectedElements {
    HEATHER("Protectie"),
    SLOGAN("Worden je IT-applicaties geteisterd door ongewenste bezoekers?");

    private String expected_;

    protectiePageExpectedElements(String expected){
        this.expected_=expected;
    }

    public String getExpected(){return expected_;}
}
