package utils;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class StorePrintStream extends PrintStream {

    public static List<String> printlnList = new LinkedList<String>();
    public static List<String> printfList = new LinkedList<String>();
    public static List<String> printList = new LinkedList<String>();

    public StorePrintStream(PrintStream org) {
        super(org);

        printlnList.clear();
        printfList.clear();
        printList.clear();
    }

    @Override
    public void println(String line) {
        printlnList.add(line);
        super.println(line);
    }

    @Override
    public PrintStream printf(String format, Object... args) {
        printfList.add(format + "," + Arrays.toString(args));
        return super.printf(format, args);
    }

    @Override
    public void print(String s) {
        printList.add(s);
        super.print(s);
    }

    public void println(int line) {
        this.println(String.valueOf(line));
    }

}
