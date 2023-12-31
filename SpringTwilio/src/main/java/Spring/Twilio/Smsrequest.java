package Spring.Twilio;

public class Smsrequest {

    private String number;
    private String message;

    // Default constructor
    public Smsrequest() {
    }

    // Parameterized constructor
    public Smsrequest(String number, String message) {
        this.number = number;
        this.message = message;
    }

    // Getters and setters
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
