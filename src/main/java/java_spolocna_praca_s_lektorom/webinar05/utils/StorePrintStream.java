package java_spolocna_praca_s_lektorom.webinar05.utils;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class StorePrintStream extends PrintStream {

    public static List<String> printList = new LinkedList<String>();
    public static List<String> printfList = new LinkedList<String>();

    public StorePrintStream(PrintStream org) {
        super(org);
    }

    @Override
    public void println(String line) {
        printList.add(line);
        super.println(line);
    }

    @Override
    public PrintStream printf(String format, Object... args) {
        printfList.add(format + "," + Arrays.toString(args));
        return super.printf(format, args);
    }

    public void println(int line) {
        this.println(String.valueOf(line));
    }

}
