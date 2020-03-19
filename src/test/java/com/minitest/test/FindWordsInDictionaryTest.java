package com.minitest.test;

import com.minitest.coding.FindWordsInDictionary;
import org.junit.Test;

public class FindWordsInDictionaryTest {
    @Test
    public void miniTest(){
        String[] dictionary = {"i","like","samsung","sam","sung","ice","cream","man","go","mobile"};
        String[] myDictionary = {"i","like","sam","sung","ice","cream","man","go","mobile","mango"};
        String sentence1 = "ilikesamsungmobile";
        String sentence2 = "ilikeicecreammango";
        FindWordsInDictionary findWordsInDictionary = new FindWordsInDictionary();
        //STAGE1 TEST
        findWordsInDictionary.findWordsInPubDic(dictionary,null,sentence1,1);
        findWordsInDictionary.findWordsInPubDic(dictionary,null,sentence2,1);

        //STAGE1 TEST
        findWordsInDictionary.findWordsInPubDic(dictionary,myDictionary,sentence1,2);
        findWordsInDictionary.findWordsInPubDic(dictionary,myDictionary,sentence2,2);

        //STAGE3 TEST
        findWordsInDictionary.findWordsInPubDic(dictionary,myDictionary,sentence1,3);
        findWordsInDictionary.findWordsInPubDic(dictionary,myDictionary,sentence2,3);


    }

}
