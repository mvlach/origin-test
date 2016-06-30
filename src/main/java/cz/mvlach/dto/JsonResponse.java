package cz.mvlach.dto;

import lombok.*;

/**
 * Created by mvlach on 30.06.16.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class JsonResponse {
	boolean success;
	Object payload;
	String errorMessage;
}
