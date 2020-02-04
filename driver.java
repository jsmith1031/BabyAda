import java.nio.*;
import java.io.*;

class driver{
    public static void main(String[] args){
        CharBuffer charbuffer = new CharBuffer();
        charbuffer.put("x := 25");
        Reader reader = new Reader(charbuffer);
        Lexer lexer = new Lexer(reader);
        System.out.println(lexer.nextToken());

        Parser parser = new Parser();
    }
}