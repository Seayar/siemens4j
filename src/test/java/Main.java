import tk.seayar.siemens4j.SiemensPLCS;
import tk.seayar.siemens4j.SiemensS7Net;
import tk.seayar.siemens4j.core.types.OperateResult;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        SiemesTest();
    }

    private static void SiemesTest() throws InterruptedException {
        SiemensS7Net siemens_net = new SiemensS7Net(SiemensPLCS.S200, "172.18.4.3");
        OperateResult connect = siemens_net.ConnectServer();
        if (connect.IsSuccess) {
            System.out.println("connect success!");
        } else {
            System.out.println("failed:" + connect.Message);
        }
//        siemens_net.ConnectClose();

        // 上面是初始化
//        siemens_net.Write("DB1.0",(byte) 1);

//        OperateResultExOne<byte[]> a = siemens_net.Read(new String[]{"C0", "V584"}, new short[]{2, 2});
        System.out.println(siemens_net.ReadInt16("C0").Content);
        System.out.println(siemens_net.ReadInt16("C2").Content);
        System.out.println(siemens_net.ReadInt16("C7").Content);
        System.out.println(siemens_net.ReadInt16("C6").Content);

        /*
        byte m100_byte = siemens_net.ReadByte("M100").Content;
        short m100_short = siemens_net.ReadInt16("M100").Content;
        int m100_int = siemens_net.ReadInt32("M100").Content;
        long m100_long = siemens_net.ReadInt64("M100").Content;
        float m100_float = siemens_net.ReadFloat("M100").Content;
        double m100_double = siemens_net.ReadDouble("M100").Content;
        String m100_string = siemens_net.ReadString("M100",(short) 10).Content;

        siemens_net.Write("M100",(short) 123);
        siemens_net.Write("M100",(int) 123);
        siemens_net.Write("M100",(long) 123);
        siemens_net.Write("M100", 123.456f);
        siemens_net.Write("M100", 123.456d);
        siemens_net.Write("M100","1234567890");

        OperateResultExOne<byte[]> read = siemens_net.Read( "M100", (short) 10 );
        {
            if(read.IsSuccess)
            {
                byte m100 = read.Content[0];
                byte m101 = read.Content[1];
                byte m102 = read.Content[2];
                byte m103 = read.Content[3];
                byte m104 = read.Content[4];
                byte m105 = read.Content[5];
                byte m106 = read.Content[6];
                byte m107 = read.Content[7];
                byte m108 = read.Content[8];
                byte m109 = read.Content[9];
            }
            else
            {
                // 发生了异常
            }
        }
*/
    }

}
