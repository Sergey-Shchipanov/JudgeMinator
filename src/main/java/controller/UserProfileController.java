package controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import domain.UserProfile;
import dto.ResultTo;
import dto.UserProfileTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import service.UserProfileService;

/**
 * @author anshipanov
 */
@RestController
public class UserProfileController {

    @Autowired
    private UserProfileService userProfileService;

    @GetMapping("/user/{profileId}")
    public UserProfileTo find(@PathVariable long profileId) throws JsonProcessingException {
        System.out.println("invoked");
        return new UserProfileTo(userProfileService.find(profileId));
    }

    @GetMapping("user/insert/{profileId}")
    public ResultTo insert(@PathVariable long profileId) throws JsonProcessingException {
        userProfileService.insert(new UserProfile(
                profileId,
                "ЗАЛУПА",
                null,
                null,
                null
        ));
        return new ResultTo(true);
    }
}
