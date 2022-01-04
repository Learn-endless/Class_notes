import java.io.BufferedReader;
import java.io.FileReader;
/**
 * 使用自定义邮件发送工具类实现群发消息
 */
public class Test {
    public static void main(String[] args) {
        String toFrom = "1983318249@qq.com";         //发件人
        String toFromPassWord = "xkfyejbensopeecc";  //发件人邮箱POP3/SMTP服务密码
        String theme = "这是一封测试邮件";              //邮件主题
        String content = "hello word!~~~";           //邮件具体内容
        try(
                FileReader fs = new FileReader("toUser.txt");//字符流
                BufferedReader br = new BufferedReader(fs);           //字符装饰流
                ){
            String ret = null;
            //循环读取,每次读一行
            while((ret = br.readLine())!=null){
                //发送成功提示一下
                if(SendMailTools.sendMail(ret,toFrom,toFromPassWord,theme,content)){
                    System.out.println("发送成功》》》");
                }else{
                    System.out.println("失败！！！");
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
