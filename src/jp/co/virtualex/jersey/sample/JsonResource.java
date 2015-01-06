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
 *     "name1": "EEE",
 *     "name2": "FFF",
 *     "name3": "GGG",
 *     "name4": "HHH"
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
		dto.setName1("EEE");
		dto.setName2("FFF");
		dto.setName3("GGG");
		dto.setName4("HHH");
		return dto;
	}
}
