/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tba.jdk.anno.dynamic;

/**
 * 消息状态码
 *
 * @author ZhangGaoFeng <zhanggaofeng@jd.com>
 * @date 2017-6-2 11:50:01
 */
public enum MessageCodeEnum {

    SUCCESS("0", "成功"),
    LOGIN_ST_FAILED("-1", "未注册"),
    GRANT_FAILED("-2", "权限不足"),
    ARG_ERROR("SPMKT_003", "参数错误"),
    SYSTEM_ERROR("SPMKT_004", "系统开小差，请稍后重试"),
    MEMBER_SYS_ERROR("SPMKT_005", "会员系统错误"),
    ORG_INFO_ERROR("SPMKT_006", "组织信息错误"),
    USER_INFO_ERROR("SPMKT_007", "用户信息错误"),
    ROLE_INFO_ERROR("SPMKT_008", "角色信息错误"),
    MEMBER_RULE_SYS_ERROR("SPMKT_009", "会员规则系统错误"),
    SHOP_CLASS_SYS_ERROR("SPMKT_010", "门店分类系统错误"),
    NO_MOBILE_SYS_ERROR("SPMKT_011", "没有手机号错误"),
    NO_REGISTER_SYS_ERROR("SPMKT_012", "请先注册会员"),
    ILLEGAL_CLI_SYS_ERROR("SPMKT_013", "非法客户端请求"),
    ILLEGAL_CODE_SYS_ERROR("SPMKT_014", "非法CODE请求"),
    LOGIN_ACCOUNT_STOP("SPMKT_015", "账号被停用"),
    SHOP_QUERY("SPMKT_016", "无此门店"),
    COUPON_QUERY("SPMKT_017", "无此优惠券"),
    ACTIVITY_QUERY("SPMKT_018", "购物中心无此活动"),
    BUY_CENTER_STOP("SPMKT_019", "购物中心已停用，请稍后重试"),
    SPREADCODE_QUERY("SPMKT_020", "无此推广码"),
    LOGIN_INDEX_ERROR("SPMKT_021", "登陆首页系统错误"),
    COUPON_SYS_ERROR("SPMKT_022", "优惠券处理错误"),
    COUPON_SYS_INVENTORY_ERROR("SPMKT_041", "优惠券更改库存只能增加"),
    RELEASE_DATE_SYS_ERROR("SPMKT_042", "发布日期与券的有效日期不符"),
    MARKETING_ACTIVITY_SYS_ERROR("SPMKT_023", "营销活动处理错误"),
    MEMBER_COUPON_SYS_ERROR("SPMKT_024", "会员领券处理错误"),
    MINI_PROGRAM_SYS_ERROR("SPMKT_025", "小程序首页列表处理错误"),
    OPERATOR_SYS_ERROR("SPMKT_026", "操作员系统错误"),
    SPREADCODE_INSERT_ERROR("SPMKT_027", "推广码插入错误"),
    SPREADCODE_DELECT_ERROR("SPMKT_028", "推广码删除错误"),
    SPREADCODE_EXPR("SPMKT_029", "推广码已过期"),
    COUPON_AMOUNT_ERROR("SPMKT_030","优惠券金额错误"),
    COUPON_INVENTORY_CLOCK_ERROR("SPMKT_031","不好意思没抢到"),

    ORDER_CREATE_ERROR("SPMKT_032","创建订单失败，请重新提交。"),
    ORDER_QUERY_ERROR("SPMKT_033","订单查询错误"),
    SPREADCODE_DOWDLOAD_ERROR("SPMKT_034", "推广码下载错误"),
    ROLE_RESOURCE_ERROR("SPMKT_035","权限资源错误"),
    TRADE_QUERY_ERROR("SPMKT_036","交易查询错误"),
    SHOP_QUERY_ERROR("SPMKT_037", "门店查询错误"),
    ORDER_REFUND_ERROR("SPMKT_038", "订单退款错误，请稍后重试"),
    USER_ALREADY_EXISTS("SPMKT_039", "账号已存在"),
    MEMBER_RULE_SYS_EXISTS_ERROR("SPMKT_040", "该门店会员规则已存在"),
    COUPON_BUSY_ERROR("SPMKT_041","优惠券系统繁忙，请稍后重试。"),
    CENTERNO_BUSY_ERROR("SPMKT_042","无此购物中心，请稍后重试。"),
    LOGIN_ACC_EXIST_FAILED("SPMKT_043", "登陆账号已存在"),
    PARKING_RECORD_QUERY_FAIL("SPMKT43","停车记录查询失败"),
    CAR_MANAGE_RECORD_QUERY_FAIL("SMPT44", "会员车辆管理记录查询失败"),
    CAR_MANAGE_RECORD_ADD_FAIL("SMPT45","会员车辆管理记录添加失败"),
    CAR_MANAGE_RECORD_REMOVE_FAIL("SMPT46","会员车辆管理记录移除失败"),
    CAR_MANAGE_RECORD_OPEN_FREE_PASSWORD_FAIL("SMPT47","会员车辆管理记录打开免密支付失败"),
    CAR_MANAGE_RECORD_CLOSE_FREE_PASSWORD_FAIL("SMPT48","会员车辆管理记录关闭免密支付失败"),
    CAR_MANAGE_RECORD_HANDLE_FREQUENTLY("SMPT49", "车辆管理操作频繁，请稍后重试。"),
    PARKING_SYS_ERROR("SPMKT_050", "停车场数据处理错误"),
    SHOP_MERNO_NO_BIND_FAILED("SPMKT_51", "请先配置门店收款商户号"),
    SHOP_EXIST_IN_CLASS_ERROR("SPMKT_052", "类目已被门店使用"),
    COUPON_ACTIVITY_ERROR("SMPKT_53","该优惠券属于活动券，活动id非法。"),
    LOGIN_ACC_NOT_USEED_FAILED("SPMKT_054", "账号不可用"),
    MEMBER_INFO_NOT_COMPLETE_ERROR("SMPKT_55","会员信息未完善"),
    MEMBER_INFO_ERROR("SPMKT_056", "会员信息不一致，请联系客服"),
    MERCHANT_NOT_SUPPORT_COUPON("SPMKT_057", "商户不支持订单营销"),
    INDEX_PAGE_QUERY_ERROR("SPMKT_058", "首页查询失败"),
    INVITE_CODE_INVALID("SPMKT_059", "邀请码失效"),
    SHOP_AREA_SYS_ERROR("SPMKT_060", "门店区域系统错误"),
    MERCHANT_NO_VERIFY_ACCOUNT_SYS_ERROR("SPMKT_061", "券售价金额大于0，请入驻京东平台开通相关业务"),

    POS_ORDER_SYS_FAILED("POS_001", "系统繁忙，请稍后重试"),
    POS_NOT_FOUND_ORDER_FAILED("POS_002", "无此订单信息"),
    POS_PAY_RESULT_CLOSE("POS_PAY_RESULT_CLOSE", "支付单关闭"),
    POS_ACC_PWD_ERROR("POS_004", "帐号或密码错误"),
    POS_CHECK_IN_ERROR("POS_005", "请先申请入住或稍后重试"),
    POS_NEED_LOGIN_ERROR("POS_007", "请先登陆"),
    POS_ORDER_STATUS_REFUND("POS_008", "订单已退款"),
    POS_ORDER_STATUS_CANCEL("POS_009", "订单已取消"),
    POS_ORDER_STATUS_FINISH("POS_010", "订单已支付"),
    POS_ORDER_STATUS_INIT("POS_011", "订单已创建"),
    POS_ORDER_REFUND_PROCESSING("POS_REFUND_PROCESSING", "退款受理成功，预计1-3天内到账。若有问题，可联系客服进行处理。"),

    COUPON_BUYER_STOCK_NOT_ENOUGH("AGGT6000109","您获取此优惠券数量已达上限"),
    ACTIVITY_BUYER_STOCK_NOT_ENOUGH("AGGT6000110", "您获取此优惠券数量已达上限"),

    CAR_MANAGE_RECORD_FREE_PASSWORD_NONE("NONESIGN","会员未开通免密签约"),
    COUPON_TOTAL_STOCK_NOT_ENOUGH("AGGT6000108", "优惠券剩余库存不足"),
    SHOP_NO_PARK("PARK0001", "门店没有对应停车场"),
    PLATE_NO_MER("PARK0002", "车牌没有对应车辆管理记录"),
    PLATE_NO_AUTOPAY("PARK0003", "车牌没有开通免密"),
    CAR_IN_ERROR("PARK0004", "车辆入场通知异常"),
    CAR_OUT_ERROR("PARK0005", "车辆出场通知异常"),
    PLATE_GETAMT_ERROR("PARK0006", "车费获取异常"),
    PARK_REFUND_ERROR("PARK0007", "退款异常"),
    PARK_DEALING_ERROR("PARK9999", "正在处理"),

    REQ_H5_TYPE_NO_SUPPORT("H5_00001", "请求类型不支持"),
    REQ_H5_REQU_SEND_CODE_ERROR("H5_00002", "需要发送验证码"),
    REQ_H5_CHECK_CODE_ERROR("H5_00003", "验证码不正确"),
    REQ_H5_SEND_CODE_ERROR("H5_00004", "发送短信失败"),
    ;
    private final String code;
    private final String msg;

    MessageCodeEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public static MessageCodeEnum getCouponForGettingResultEnum(String code) {
        for (MessageCodeEnum c : MessageCodeEnum.values()) {
            if (c.getCode().equalsIgnoreCase(code)) {
                return c;
            }
        }
        return null;
    }
}
