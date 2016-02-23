package pl.themolka.iserverquery.text;

import pl.themolka.iserverquery.util.Encodable;

/**
 * http://media.teamspeak.com/ts3_literature/TeamSpeak%203%20Server%20Query%20Manual.pdf
 */
public class QueryTextEncoding implements Encodable<String> {
    public static final char[] CHAR_ARRAY = new char[] {
            92, // backslash
            47, // slash
            32, // whitespace
            124, // pipe
            7, // bell
            8, // backspace
            12, // formfeed
            10, // new line
            13, // carriage return
            9, // horizontal tab
            11 // vertical tab
    };
    public static final char[] QUERY_ARRAY = new char[] {
            92, // backslash
            47, // slash
            115, // whitespace
            112, // pipe
            97, // bell
            98, // backspace
            102, // formfeed
            110, // new line
            114, // carriage return
            116, // horizontal tab
            118 // vertical tab
    };
    public static final char QUERY_PREFIX = 92;

    @Override
    public String decode(String decode) {
        for (int i = 0; i < CHAR_ARRAY.length; i++) {
            decode = decode.replace(String.valueOf(QUERY_PREFIX) + String.valueOf(QUERY_ARRAY[i]), String.valueOf(CHAR_ARRAY[i]));
        }
        return decode;
    }

    @Override
    public String encode(String encode) {
        for (int i = 0; i < CHAR_ARRAY.length; i++) {
            encode = encode.replace(String.valueOf(CHAR_ARRAY[i]), String.valueOf(QUERY_PREFIX) + String.valueOf(QUERY_ARRAY[i]));
        }
        return encode;
    }
}
