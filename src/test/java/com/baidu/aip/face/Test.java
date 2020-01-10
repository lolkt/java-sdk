package com.baidu.aip.face;

import com.baidu.aip.utils.Base64Util;
import com.baidu.aip.utils.FileUtil;
import com.baidu.aip.utils.GsonUtils;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.List;

public class Test {

    public static void main(String[] args) throws Exception {

        AipFace aipFace = new AipFace("18243176", "VtanZOh6EPcHj324HDKzrscD", "aIiDeGVpqajNa9qaaprXx9R7NWmgyKM9");
//        byte[] bytes = FileUtil.readFileByBytes("E:\\work2019\\java-sdk\\src\\webapp\\caiying\\1578534667097_80.jpg");
//        String encode = Base64Util.encode(bytes);
//        JSONObject jsonObject = aipFace.addUser(encode, "BASE64", "girls", "1", null);
//        System.out.println("===" + jsonObject.toString());

//        byte[] bytes2 = FileUtil.readFileByBytes("E:\\work2019\\java-sdk\\src\\webapp\\caiying\\1578534672083_82.jpg");
//        String encode2 = Base64Util.encode(bytes2);
//        JSONObject jsonObject2 = aipFace.addUser(encode2, "BASE64", "girls", "1", null);
//        System.out.println("===" + jsonObject2.toString());
//        if ("SUCCESS".equals(jsonObject2.optString("error_msg"))) {
//            AddUserReply userReply = GsonUtils.fromJson(jsonObject2.toString(), AddUserReply.class);
//            System.out.println("===" + userReply.getLog_id());
//        }


        byte[] bytesSearch = FileUtil.readFileByBytes("E:\\work2019\\java-sdk\\src\\webapp\\caiying\\1578565439018_498.jpg");
        String encodeSearch = Base64Util.encode(bytesSearch);

        HashMap<String, String> options=new HashMap<>();
        /**
         * 质量控制(质量不符合要求的人脸不会出现在返回结果中)
         * NONE: 不进行控制
         * LOW:较低的质量要求
         * NORMAL: 一般的质量要求
         * HIGH: 较高的质量要求
         * 默认NONE
         */
        options.put("quality_control","NONE");
        /**
         * 活体控制(活体分数不符合要求的人脸不会出现在返回结果中)
         * NONE: 不进行控制
         * LOW:较低的活体要求(高通过率 低攻击拒绝率)
         * NORMAL: 一般的活体要求(平衡的攻击拒绝率, 通过率)
         * HIGH: 较高的活体要求(高攻击拒绝率 低通过率)
         * 默认NONE
         */
        options.put("liveness_control","NONE");
        JSONObject jsonSearch = aipFace.search(encodeSearch, "BASE64", "girls", options);
        System.out.println("===" + jsonSearch.toString());
        if ("SUCCESS".equals(jsonSearch.optString("error_msg"))) {
            SearchUserReply userReply = GsonUtils.fromJson(jsonSearch.toString(), SearchUserReply.class);
            List<SearchUserReply.ResultBean.UserListBean> user_list = userReply.getResult().getUser_list();
            if(user_list!=null&&user_list.size()>0){
                SearchUserReply.ResultBean.UserListBean userListBean = user_list.get(0);
                double score = userListBean.getScore();

                System.out.println("score===" + score);
                if(score>80){
                    System.out.println("用户的匹配得分 "+score+"\n" +
                            "80分以上可以判断为同一人，此分值对应万分之一误识率" );
                }
            }

        }
    }
}
