package enums;

/**
 * Created by alexanderboffin on 26/05/17.
 */
public enum  performantiePageExpectedElements {
    HEATHER("Performantie"),
    SLOGAN("Zijn je IT-applicaties traag en ergert je dat?");

    private String expected_;

    performantiePageExpectedElements(String expected){
        this.expected_=expected;
    }

    public String getExpected(){return expected_;}
}
