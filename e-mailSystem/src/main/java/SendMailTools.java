import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

/**
 * 邮件工具类
 */
public class SendMailTools {
    public static boolean sendMail(String toUser, String fromUser,
                                   String fromUserPassWord, String theme, String content){
        SimpleEmail email = new SimpleEmail();

        email.setSslSmtpPort("465");    //qq：qq邮件服务器的端口号
        email.setHostName("smtp.qq.com");
        email.setAuthentication(fromUser, fromUserPassWord);
        email.setCharset("UTF-8");
        try {
            email.addTo(toUser);
            email.setFrom(fromUser);
            email.setSubject(theme);
            email.setMsg(content);
            email.send();
            return true;
        } catch (EmailException e) {
            e.printStackTrace();
            return false;
        }
    }
}
