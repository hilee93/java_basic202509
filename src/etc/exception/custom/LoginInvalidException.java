package etc.exception.custom;

// extends Exception -> checked Exception: try/catch를 강제합니다.
// extends RuntimeException -> unchecked Exception: 예외처리를 강제하지 않음.

/**
 * @author hyeong-il
 * @since 2025.09.24
 * @version 1.0.0
 */
public class LoginInvalidException extends RuntimeException {
    // 나중에 예외 상황에 대한 추가 정보를 담기 위한 필드
    private String inputAccount;

    public LoginInvalidException(String message, String inputAccount) {
        super(message);
        this.inputAccount = inputAccount;
    }

    public String getInputAccount() {
        return inputAccount;
    }

}
