package cz.mvlach.mvc;

import cz.mvlach.dto.JsonResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by mvlach on 30.06.16.
 */
@RestController
public class IndexController {

	@RequestMapping("/")
	public JsonResponse response() {
		return JsonResponse.builder()
				.success(true)
				.payload(new Date())
				.build();
	}
}
