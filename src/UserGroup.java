import java.util.*;

public class UserGroup{

    private ArrayList<User> people;

    public UserGroup(){
        people = new ArrayList<User>();
    }

    public User getUser(int idx){
        return people.get(idx);
    }

    public void printUsernames(){
        for (User user: people){
            System.out.printf("%s %s\n", user.getUsername(), user.getUserType());
        }
    }
    public void loginToSite(User j){
        ListIterator<User> iterator = people.listIterator();
        while(iterator.hasNext()){
            User user1 = iterator.next();
            if(user1.getUsername().equals(j.getUsername())){
                if(user1.getPassword().equals(j.getPassword())){
                    System.out.println("Welecome to the site: ");
                }
            }
            else{
                System.out.println("Incorrect user information. Please try again: ");
            }
        }
    }

    public void removeUserName(String username) {
        Iterator<User> it = people.iterator();
        while(it.hasNext()) {
            if(it.next().getName().equals(username)) {
                it.remove(); break;
            }
        }
    }

    public void removeEmail(String userEmail){
        Iterator<User> it = people.iterator();
        while(it.hasNext()) {
            if(it.next().getUserEmail().equals(userEmail)) {
                it.remove(); break;
            }
        }
    }

    public void removeCreditCard(String userCreditCard){
        Iterator<User> it = people.iterator();
        while(it.hasNext()) {
            if(it.next().getUserCreditCard().equals(userCreditCard)) {
                it.remove(); break;
            }
        }
    }
}