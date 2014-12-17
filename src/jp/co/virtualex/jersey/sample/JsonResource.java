/**
 * 
 */
package jp.co.virtualex.jersey.sample;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * 結果をJSONで返す<br>
 * http://localhost:8080/jersey-sample/resource/json ->
 * 
 * <pre>
 * {
 *     "name1": "AAA",
 *     "name2": "BBB",
 *     "name3": "CCC",
 *     "name4": "DDD"
 * }
 * </pre>
 * 
 * @author n-suzuki
 *
 */
@Path("/json")
public class JsonResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public JsonResultDto hello() {
		JsonResultDto dto = new JsonResultDto();
		dto.setName1("AAA");
		dto.setName2("BBB");
		dto.setName3("CCC");
		dto.setName4("DDD");
		return dto;
	}
}
