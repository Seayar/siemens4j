package xyz.seayar.siemens4j.message;

public class MessageString {

    /***********************************************************************************
     *
     *    一般的错误信息
     *
     ************************************************************************************/

    public static String ConnectedFailed (){ return "连接失败："; }
    public static String UnknownError (){ return "未知错误"; }
    public static String ErrorCode (){ return "错误代号"; }
    public static String TextDescription (){ return "文本描述"; }
    public static String ExceptionMessage (){ return "错误信息："; }
    public static String ExceptionSourse (){ return "错误源："; }
    public static String ExceptionType (){ return "错误类型："; }
    public static String ExceptionStackTrace (){ return "错误堆栈："; }
    public static String ExceptopnTargetSite (){ return "错误方法："; }
    public static String ExceprionCustomer (){ return "用户自定义方法出错："; }
    public static String SuccessText (){ return "成功"; }
    public static String TwoParametersLengthIsNotSame (){ return "两个参数的个数不一致"; }
    public static String NotSupportedDataType (){ return "输入的类型不支持，请重新输入"; }
    public static String DataLengthIsNotEnough (){ return "接收的数据长度不足，应该值:{0},实际值:{1}"; }
    public static String ReceiveDataTimeout (){ return "接收数据超时："; }
    public static String ReceiveDataLengthTooShort (){ return "接收的数据长度太短："; }
    public static String MessageTip (){ return "消息提示："; }
    public static String Close (){ return "关闭"; }
    public static String Time (){ return "时间："; }
    public static String SoftWare (){ return "软件："; }
    public static String BugSubmit (){ return "Bug提交"; }
    public static String MailServerCenter (){ return "邮件发送系统"; }
    public static String MailSendTail (){ return "邮件服务系统自动发出，请勿回复！"; }
    public static String IpAddresError (){ return "Ip地址输入异常，格式不正确"; }
    public static String Send (){ return "发送";}
    public static String Receive(){ return "接收";}

    /***********************************************************************************
     *
     *    系统相关的错误信息
     *
     ************************************************************************************/

    public static String SystemInstallOperater (){ return "安装新系统：IP为"; }
    public static String SystemUpdateOperater (){ return "更新新系统：IP为"; }


    /***********************************************************************************
     *
     *    套接字相关的信息描述
     *
     ************************************************************************************/

    public static String SocketIOException (){ return "套接字传送数据异常："; }
    public static String SocketSendException (){ return "同步数据发送异常："; }
    public static String SocketHeadReceiveException (){ return "指令头接收异常："; }
    public static String SocketContentReceiveException (){ return "内容数据接收异常："; }
    public static String SocketContentRemoteReceiveException (){ return "对方内容数据接收异常："; }
    public static String SocketAcceptCallbackException (){ return "异步接受传入的连接尝试"; }
    public static String SocketReAcceptCallbackException (){ return "重新异步接受传入的连接尝试"; }
    public static String SocketSendAsyncException (){ return "异步数据发送出错:"; }
    public static String SocketEndSendException (){ return "异步数据结束挂起发送出错"; }
    public static String SocketReceiveException (){ return "异步数据发送出错:"; }
    public static String SocketEndReceiveException (){ return "异步数据结束接收指令头出错"; }
    public static String SocketRemoteCloseException (){ return "远程主机强迫关闭了一个现有的连接"; }


    /***********************************************************************************
     *
     *    服务器的引擎相关数据
     *
     ************************************************************************************/

    public static String TokenCheckFailed (){ return "接收验证令牌不一致"; }
    public static String TokenCheckTimeout (){ return "接收验证超时:"; }
    public static String CommandHeadCodeCheckFailed (){ return "命令头校验失败"; }
    public static String CommandLengthCheckFailed (){ return "命令长度检查失败"; }
    public static String NetClientAliasFailed (){ return "客户端的别名接收失败："; }
    public static String NetEngineStart (){ return "启动引擎"; }
    public static String NetEngineClose (){ return "关闭引擎"; }
    public static String NetClientOnline (){ return "上线"; }
    public static String NetClientOffline (){ return "下线"; }
    public static String NetClientBreak (){ return "异常掉线"; }
    public static String NetClientFull (){ return "服务器承载上限，收到超出的请求连接。"; }
    public static String NetClientLoginFailed (){ return "客户端登录中错误："; }
    public static String NetHeartCheckFailed (){ return "心跳验证异常："; }
    public static String NetHeartCheckTimeout (){ return "心跳验证超时，强制下线："; }
    public static String DataSourseFormatError (){ return "数据源格式不正确"; }
    public static String ServerFileCheckFailed (){ return "服务器确认文件失败，请重新上传"; }
    public static String ClientOnlineInfo (){ return "客户端 [ {0} ] 上线"; }
    public static String ClientOfflineInfo (){ return "客户端 [ {0} ] 下线"; }
    public static String ClientDisableLogin (){ return "客户端 [ {0} ] 不被信任，禁止登录"; }



    /***********************************************************************************
     *
     *    Siemens PLC 相关
     *
     ************************************************************************************/

    public static String SiemensDBAddressNotAllowedLargerThan255 (){ return "DB块数据无法大于255"; }
    public static String SiemensReadLengthMustBeEvenNumber (){ return "读取的数据长度必须为偶数"; }
    public static String SiemensWriteError (){ return "写入数据异常，代号为："; }
    public static String SiemensReadLengthCannotLargerThan19 (){ return "读取的数组数量不允许大于19"; }
    public static String SiemensDataLengthCheckFailed (){ return "数据块长度校验失败，请检查是否开启put/get以及关闭db块优化"; }
    public static String SiemensFWError (){ return "发生了异常，具体信息查找Fetch/Write协议文档"; }

}
