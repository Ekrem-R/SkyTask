package testData;

import java.util.HashMap;
import java.util.Map;

public class Sky_Sports_House_Test_Data {
    public Map<String,Object> imageDataSetUp(){
        Map<String,Object> imageData= new HashMap<>();
        imageData.put("url","https://imgur.com");
        imageData.put("fileType",".png");
        return imageData;
    }
    public Map<String,Object> expectedDataSetUp(){
        Map<String,Object> expected=new HashMap<>();
        expected.put("createdAt","2020-10-28T07:45:21.526Z");
        expected.put("title","title 24");
        expected.put("sensitive",false);
        expected.put("topics",null);
        expected.put("imageDataSetUp", imageDataSetUp());
        expected.put("priority",5);
        return expected;
    }
}
