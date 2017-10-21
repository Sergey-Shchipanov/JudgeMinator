package service;

import dao.UserProfileDao;
import domain.UserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author anshipanov
 */
@Service
public class UserProfileService {

    @Autowired
    private UserProfileDao userProfileDao;

    public UserProfile find(long id) {
        return userProfileDao.find(id);
    }

    public void insert(UserProfile profile) {
        userProfileDao.create(profile);
    }
}
