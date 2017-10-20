package controller;

import dto.ResultTo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author anshipanov
 */
@RestController
public class AppController {

    @GetMapping("/app")
    public ResultTo get() {
        return new ResultTo(true);
    }
}
