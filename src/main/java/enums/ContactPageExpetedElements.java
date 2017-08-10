package enums;

/**
 * Created by alexanderboffin on 23/05/17.
 */
public enum ContactPageExpetedElements {
    EXPECTEDMAILADRESSFOREVOLANEQUESTIONS("info@evolane.be");


    private String expected_;

    ContactPageExpetedElements(String expected) { this.expected_=expected; }

    public String getExpected(){return expected_;}
}
