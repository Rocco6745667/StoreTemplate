public class User{
    public enum UserType{
        ADMIN,
        CUSTOMER;
    }

    private String userId;
    private UserType userPermissions;
    private String actualName;
    private String userEmail;
    private String userCreditCard;
    private String password;

    public User(String username, UserType userType, String name, String email, String creditCard, String password){
        this.userId = username;
        this.userPermissions = userType;
        this.actualName= name;
        this.userEmail = email;
        this.userCreditCard = creditCard;
        this.password = password;
    }

    public void setUserId(String username){
        this.userId = username;
    }

    public String getUsername(){
        return userId;
    }

    public void setUserPermissions(UserType userType){
        this.userPermissions = userType;
    }
    public UserType getUserType(){
        return userPermissions;
    }

    public void setActualName(String actualName) {
        this.actualName = actualName;
    }

    public String getName(){
        return actualName;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserEmail(){
        return userEmail;
    }

    public void setUserCreditCard(String userCreditCard) {
        this.userCreditCard = userCreditCard;
    }

    public String getUserCreditCard(){
        return userCreditCard;
    }

    public void setUserType(UserType input){
        userPermissions = input;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword(){
        return password;
    }
}