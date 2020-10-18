package com.jeesite.common.callback;

public class x {
    private final static String STRBUF = "sb5";
    public static void main(String[] args) {
        StringBuffer STRBUF = new StringBuffer();
        STRBUF.append("readonly a");
        STRBUF.append("\n");
        STRBUF.append("\n");
        STRBUF.append("unset variable_name");
        /*STRBUF.append("your_name='abc'");
        STRBUF.append("\n");
        STRBUF.append("echo $your_name");*/
        /*STRBUF.append("^\\d{5,12}$");
        STRBUF.append("\\d{5,12}");
        STRBUF.append("\\d+");
        STRBUF.append("\\b\\w{6}\\b");
        STRBUF.append("\\ba\\w*\\b");*/
//        STRBUF.append("0\\d{2}-\\d{8}");
//        STRBUF.append("\bhi\b.*\blucy\b");
//        STRBUF.append("\bhi\b");
//        sb3.append("http://tool.oschina.net/regex");
        StringBuffer sb2 = new StringBuffer();
        sb2.append("'|'");
        //echo "hello1234"|grep 'hello'
        StringBuffer sb = new StringBuffer();
        sb.append("chmod");
        sb.append(" ");
        sb.append("777");
        for (int j = 1;j<=10;j++) {
            for (int i = 0;i<=10000;i++) {
              System.out.println(STRBUF.toString());
//            System.out.println(sb3.toString());
//            System.out.println(sb2.toString());
//            System.out.println(sb.toString());
            }
        }
    }
}
