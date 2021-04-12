package nextstep.subway;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    private static final Logger logger = LoggerFactory.getLogger(HealthCheckController.class);

    @GetMapping("/api/v1")
    public String check() {
        logger.info("api UP");
        logger.error("api UP");
        logger.debug("api UP");
        return "{status:\"UP\"}";
    }
}
