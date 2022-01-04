import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
/**
 * 自定义发送邮件工具类
 */
public class SendMailTools {
    /**
     *
     * @param toUser    收件邮箱
     * @param fromUser  发件邮箱
     * @param fromUserPassWord  发件邮箱的POP3/SMTP服务密码
     * @param theme     邮件主题
     * @param content   邮件内容
     * @return    返回一个提示，是否发送成功（true/false）
     */
    public static boolean sendMail(String toUser, String fromUser,
                                   String fromUserPassWord, String theme, String content){
        //实例化邮件资源
        SimpleEmail email = new SimpleEmail();
        //设置qq邮件服务器的端口号
        email.setSslSmtpPort("465");
        //使用QQ邮箱的固定写法
        email.setHostName("smtp.qq.com");
        //设置发件人的账户和POP3/SMTP服务密码
        email.setAuthentication(fromUser, fromUserPassWord);
        //编码方式
        email.setCharset("UTF-8");
        try {
            //收件人
            email.addTo(toUser);
            //发件人
            email.setFrom(fromUser);
            //邮件主题
            email.setSubject(theme);
            //邮件内容
            email.setMsg(content);
            //发送
            email.send();
            return true;
        } catch (EmailException e) {
            e.printStackTrace();
            return false;
        }
    }
}
