package cart.ui;

import cart.application.PointService;
import cart.domain.Member;
import cart.dto.point.PointResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/point")
public class PointApiController {

    private final PointService pointService;

    public PointApiController(PointService pointService) {
        this.pointService = pointService;
    }

    @GetMapping
    public ResponseEntity<PointResponse> findPoint(Member member) {
        return ResponseEntity.ok(pointService.findPointByMember(member));
    }
}
