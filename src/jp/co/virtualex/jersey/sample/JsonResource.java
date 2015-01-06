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
 *     "name1": "III",
 *     "name2": "JJJ",
 *     "name3": "KKK",
 *     "name4": "LLL"
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
		dto.setName1("III");
		dto.setName2("JJJ");
		dto.setName3("KKK");
		dto.setName4("LLL");
		return dto;
	}
}
