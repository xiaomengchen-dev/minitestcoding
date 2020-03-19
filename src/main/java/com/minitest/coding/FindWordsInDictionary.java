package com.minitest.coding;

import java.util.*;

public class FindWordsInDictionary {
    private  List<String> list = new ArrayList<>();

    public  void findWordsInPubDic(String[] dictionary,String[] myDictionary,String sentence,int flag){
        //stage1
        if (flag==1){
            collectSentence(dictionary,sentence,"");
        }else if(flag==2){
            //stage2
            if (myDictionary!=null&&myDictionary.length>0)
                dictionary = myDictionary;
            collectSentence(dictionary,sentence,"");
        }else if(flag==3){
            //stage3
            Set<String> stringSet = new HashSet<>();
            if (dictionary!=null){
                for (String str:dictionary) {
                    stringSet.add(str);
                }
            }
            if(myDictionary!=null){
                for (String str:myDictionary) {
                    stringSet.add(str);
                }
            }
            //Set-->数组
            dictionary= stringSet.stream().toArray(String[]::new);
            collectSentence(dictionary,sentence,"");
        }
        System.out.println(list);
        list.clear();
    }
    private  void collectSentence(String[] dictionary,String sentence,String appendStr){
        if ("".equals(sentence)||sentence==null){
            list.add(appendStr);
            return;
        }
        int length = sentence.length();
        for (int i=length-1;i>=0;i--){

            for (String  dicStr:dictionary){
                if (sentence.substring(i).equals(dicStr)){
                    collectSentence(dictionary,sentence.substring(0,i),appendStr==""?dicStr: dicStr+" "+appendStr);
                }

            }

        }
    }

    public static void main(String[] args) {
        String[] dictionary = {"i","like","samsung","sam","sung","ice","cream","man","go","mobile"};
        String sentence = "ilikesamsungmobile";
//        findWordsInPubDic(dictionary,null ,sentence,1);
//        System.out.println(list);
        System.out.println(sentence.substring(0,0));
    }

}
