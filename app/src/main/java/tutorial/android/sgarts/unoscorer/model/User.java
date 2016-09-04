package tutorial.android.sgarts.unoscorer.model;

import tutorial.android.sgarts.unoscorer.database.DroidModel;

/**
 * Created by ganesh on 9/4/2016.
 */
public class User extends DroidModel {

    @DroidModel.Key(type = "PrimaryKey")
    public String userId;
    @DroidModel.Key(type = "String")
    public String userName;
    @DroidModel.Key(type = "String")
    public String userProfilePic;
    @DroidModel.Key(type = "String")
    public String userWinCount;
    @DroidModel.Key(type = "String")
    public String userLoseCount;
    @DroidModel.Key(type = "String")
    public String userWinPerCent;

    /**
     * Initialize database tables
     */
    public User() {
        super(User.class);
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserProfilePic() {
        return userProfilePic;
    }

    public void setUserProfilePic(String userProfilePic) {
        this.userProfilePic = userProfilePic;
    }

    public String getUserWinCount() {
        return userWinCount;
    }

    public void setUserWinCount(String userWinCount) {
        this.userWinCount = userWinCount;
    }

    public String getUserLoseCount() {
        return userLoseCount;
    }

    public void setUserLoseCount(String userLoseCount) {
        this.userLoseCount = userLoseCount;
    }

    public String getUserWinPerCent() {
        return userWinPerCent;
    }

    public void setUserWinPerCent(String userWinPerCent) {
        this.userWinPerCent = userWinPerCent;
    }
}
