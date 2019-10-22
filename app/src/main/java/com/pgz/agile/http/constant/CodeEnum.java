package com.pgz.agile.http.constant;

/**
 * 错误码枚举类
 *
 * @author liquan@syxysoft.com
 * @date 2019-10-22
 */
public enum CodeEnum {

    ERROR("-1", "系统错误"),
    SUCCESS("0", "操作成功"),
    NOT_SUCCESS("1", "操作失败"),
    VALID_ERROR("1000", "校验失败"),
    USER_NOT_FIND("1001", "用户名不存在"),
    USER_ALREADY_FIND("1002", "该用户名已存在"),
    ILLEGAL_MEDIUM_TYPE("1003", "不合法的媒体文件类型"),
    ILLEGAL_FILE_TYPE("1004", "不合法的文件类型"),
    ILLEGAL_FILE_SIZE("1005", "不合法的文件大小"),
    ILLEGAL_MESSAGE_TYPE("1006", "不合法消息类型"),
    ILLEGAL_IMAGE_SIZE("1007", "不合法的图片文件大小"),
    ILLEGAL_AUDIO_SIZE("1008", "不合法的音频文件大小"),
    ILLEGAL_THUMBNAIL_SIZE("1009", "不合法的缩略图大小"),
    ILLEGAL_PARAM("1010", "不合法的参数"),
    ILLEGAL_REQUEST_FORMAT("1011", "不合法的请求格式"),
    ILLEGAL_URL_LENGTH("1012", "不合法的URL长度"),
    NONSUPPORT_IMAGE_TYPE("1013", "不支持的图片格式"),
    NONSUPPORT_VIDEO_TYPE("1014", "不支持的视频格式"),
    NEED_GET_REQUEST("1015", "需要GET请求"),
    NEED_POST_REQUEST("1016", "需要POST请求"),
    NEED_HTTPS_REQUEST("1017", "需要HTTPS请求"),
    NOT_FIND_POST_BODY("1018", "POST数据包为空"),
    NOT_FIND_IMAGE_MSG("1019", "图片消息内容为空"),
    NOT_FIND_TEXT_MSG("1020", "文本消息内容为空"),
    NOT_FIND_VIDEO_MSG("1021", "媒体消息内容为空"),
    TEXT_OVER_LIMIT("1022", "文本超过限制"),
    TITLE_OVER_LIMIT("1023", "标题超过限制"),
    JSON_ERROR("1024", "解析JSON内容错误"),
    XML_ERROR("1025", "解析XML内容错误"),
    INVALID_PARAMETER("1026", "参数错误"),
    SERVICE_DISABLED("1027", "服务端不可用"),
    UPLOAD_ERROR("1028", "上传失败"),
    ILLEGAL_TOKEN("1029", "无效的凭证"),
    NULL_TOKEN("1030", "凭证不存在"),
    UNABLE_TO_CONVERT_TABLE("1031", "导入Excel字段不一致"),
    FILE_DOWN_ERROR("1032", "文件下载失败"),
    NOT_FIND_FILE("1033", "文件不存在"),
    FILE_SAVE_ERROR("1034", "文件保存失败"),
    FILE_DELETE_ERROR("1035", "文件删除失败"),
    SERVER_CONNECTION_ERROR("1036", "服务器连接失败"),
    REGISTER_PEOPLE_EXCESS_LIMIT("1037", "今日注册人数已达上限"),
    LONG_IS_NOT("1038", "长度不能小于上次"),
    NOT_FIND_ENTERPRISE_TYPE("1039", "企业类型为空"),
    NOT_FIND_PASSWORD("1040", "密码为空"),
    REGISTER_FAILED("1041", "注册失败"),
    ACCOUNT_IS_FORBIDDEN("1042", "当前账号已被禁用无法登录，请联系管理员"),
    ACCOUNT_PASSWORD_NOT_CONSISTENT("1043", "用户名或密码不正确，请重试");


    private String code;
    private String msg;

    CodeEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
