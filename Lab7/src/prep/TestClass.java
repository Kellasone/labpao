package prep;

import java.io.Serializable;

public class TestClass implements Serializable {
    String string;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public TestClass(String string) {
        this.string = string;
    }
}
