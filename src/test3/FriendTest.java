package test3;

public class FriendTest {
    public static void main(String[] args) {
        Friend friend = new Friend();
        BoyFriend boyfriend = new BoyFriend();
        Friend girlfriend = new Girl2Friend();

        friend.friendName();
        boyfriend.friendName();
        girlfriend.friendName();
    }
}
