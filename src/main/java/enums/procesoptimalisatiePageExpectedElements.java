package enums;

/**
 * Created by alexanderboffin on 26/05/17.
 */
public enum procesoptimalisatiePageExpectedElements {
    HEATHER("Procesoptimalisatie"),
    SLOGAN("Zijn je IT-processen traag en complex?");

    private String expected_;

    procesoptimalisatiePageExpectedElements(String expected){
        this.expected_=expected;
    }

    public String getExpected(){return expected_;}
}
