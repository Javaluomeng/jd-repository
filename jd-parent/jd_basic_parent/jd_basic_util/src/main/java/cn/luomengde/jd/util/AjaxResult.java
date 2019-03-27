package cn.luomengde.jd.util;

/**
 * @User: lm
 * @Desc: 返回给前台的数据
 * @Date: 2019/3/26 17:24
 **/
public class AjaxResult {

    /**
     * 操作是否成功
     */
    private Boolean success = true;

    /**
     * 操作成功或者是失败返回的信息
     */
    private String msg = "操作成功";

    /**
     * 返回给前台的数据
     */
    private Object object = null;

    private AjaxResult() {

    }

    public static AjaxResult me() {
        return new AjaxResult();
    }

    public Boolean getSuccess() {
        return success;
    }

    public AjaxResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public AjaxResult setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public Object getObject() {
        return object;
    }

    public AjaxResult setObject(Object object) {
        this.object = object;
        return this;
    }
}
