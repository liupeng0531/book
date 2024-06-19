package com.example.springboot.common;

import lombok.Data;

/**
 *让前端收到统⼀的数据，⽅便处理
 * {
 *   Code:200 //400
 *   Msg:"成功、失败",
 *   Total:10
 *   Data:[] {}
 * }
 */

//返给前端数据的封装
@Data
public class Result {
    private int code;//编码 200/400
    private String msg;//成功/失败
    private Long total;//总记录数
    private Object data;//数据

// 设置一个方法，使用数据
    private static Result result(int code,String msg,Long total,Object data){
        Result res = new Result();
        res.setData(data);
        res.setMsg(msg);
        res.setCode(code);
        res.setTotal(total);
        return res;
    }
//    失败
    public static Result fail(){
        return result(400,"失败",0L,null);
    }
//    成功，无参数
    public static Result suc(){
        return result(200,"成功",0L,null);
    }
//   成功，有参数
    public static Result suc(Object data){
        return result(200,"成功",0L,data);
    }
//    成功，列表，既有数据又有total
    public static Result suc(Object data,Long total){
        return result(200,"成功",total,data);
    }

}
