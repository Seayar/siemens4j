package xyz.seayar.siemens4j.core.imessage;

public class FetchWriteMessage implements INetMessage
{

    /**
     * 消息头的指令长度
     */
    @Override
    public int ProtocolHeadBytesLength(){
        return 16;
    }


    /**
     * 从当前的头子节文件中提取出接下来需要接收的数据长度
     * @return 返回接下来的数据内容长度
     */
    @Override
    public int GetContentLengthByHeadBytes() {
        if (HeadBytes == null) {
            return 0;
        }

        if (SendBytes == null) {
            return 16;
        }

        if (HeadBytes[5] == 0x04) {
            return 0;
        } else {
            return (HeadBytes[12] & 0xff) * 256 + (HeadBytes[13] & 0xff);
        }
    }


    /**
     * 检查头子节的合法性
     * @param token 特殊的令牌，有些特殊消息的验证
     * @return 是否合法的验证
     */
    @Override
    public boolean CheckHeadBytesLegal(byte[] token)
    {
        if (HeadBytes == null) {
            return false;
        }
        return HeadBytes[0] == 0x53 && HeadBytes[1] == 0x35;
    }


    /**
     * 获取头子节里的消息标识
     * @return
     */
    @Override
    public int GetHeadBytesIdentity(){

        return HeadBytes[3];
    }


    /**
     * 获取消息头字节
     *
     * @return
     */
    @Override
    public byte[] getHeadBytes() {
        return HeadBytes;
    }

    /**
     * 获取消息内容字节
     *
     * @return
     */
    @Override
    public byte[] getContentBytes() {
        return ContentBytes;
    }

    /**
     * 获取发送的消息
     *
     * @return
     */
    @Override
    public byte[] getSendBytes() {
        return SendBytes;
    }

    /**
     * 设置消息头子节
     * @param headBytes 字节数据
     */
    @Override
    public void setHeadBytes(byte[] headBytes){
        HeadBytes = headBytes;
    }




    /**
     * 设置消息内容字节
     * @param contentBytes 内容字节
     */
    @Override
    public void setContentBytes(byte[] contentBytes){
        ContentBytes = contentBytes;
    }



    /**
     * 设置发送的字节信息
     * @param sendBytes 发送的字节信息
     */
    @Override
    public void setSendBytes(byte[] sendBytes){
        SendBytes = sendBytes;
    }


    private byte[] HeadBytes = null;

    private byte[] ContentBytes = null;

    private byte[] SendBytes = null;
}
