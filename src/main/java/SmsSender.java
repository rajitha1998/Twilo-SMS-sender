// Install the Java helper library from twilio.com/docs/libraries/java
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class SmsSender {
    // Find your Account Sid and Auth Token at twilio.com/console
    public static final String ACCOUNT_SID =
                            "AC7de383cf78aca970b777dfa56d1e66c3";
    public static final String AUTH_TOKEN =
            "db5bdc6775eecd93e0232e3414998426";

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message message = Message
                .creator(new PhoneNumber("+94715163193"), // to
                        new PhoneNumber("+16787374386"), // from
                        "Hi SMS Test successful -Rajitha-")
                .create();
        System.out.println("Successful");
        System.out.println(message.getSid());
    }
}

