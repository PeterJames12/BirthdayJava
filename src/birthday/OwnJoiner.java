package birthday;


import java.util.StringJoiner;

public class OwnJoiner {

    public static void main(String[] args) {

        StringJoiner stringJoiner = new StringJoiner(" | ");

        stringJoiner.add("Hello");
        stringJoiner.add("Hello");
        stringJoiner.add("Hello");
        System.out.println(stringJoiner);

        MyJoiner myJoiner = new MyJoiner(" | ");

        myJoiner.add("Hello");
        myJoiner.add("Hello");
        myJoiner.add("Hello");

        System.out.println(myJoiner.result);
    }
}

class MyJoiner {

    private String source;
    public String result;

    public MyJoiner(String source) {
        this.source = source;
        this.result = "";
    }

    public void add(String letter) {

        result += letter + source;
    }
}
