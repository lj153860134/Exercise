package cn.lingjian_1;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @author lingjian
 * @date 2019/10/9 - 7:46 下午
 */
public class StringDemo1 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s="你好";
        byte[] bys=s.getBytes();
        System.out.println(Arrays.toString(bys));

//        String ss=new String(bys,"GBK");
        String ss=new String(bys,"UTF-8");
        System.out.println(ss);
    }
}
