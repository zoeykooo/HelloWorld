package com.hsp.regexp;

import com.sun.source.tree.WhileLoopTree;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexp_ {
    public static void main(String[] args) {
        String content ="61歳のhug女性は大卒後、一般企業に就職し、" +
                "30代後半で結婚もしたが、3年後に離婚。" +
                "職場での人間関係にもbig行き詰まり、メンタル不調により40代前半で退職。" +
                "その後、外出もままならないひきこもりc状態が10年間続き、" +
                "その間に最愛の両親がhuge他界。50代後半から再び働き始め、" +
                "親の遺産もある女性だが、身元保証人のない境遇が不安でならない――。";

        Pattern pattern= Pattern.compile("[a-zA-Z]+");
        Matcher matcher = pattern.matcher(content);

       while (matcher.find()){
           System.out.println("find:"+matcher.group(0));
       }


    }
}
