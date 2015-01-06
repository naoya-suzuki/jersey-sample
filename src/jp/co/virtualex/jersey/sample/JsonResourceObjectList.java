/**
 * 
 */
package jp.co.virtualex.jersey.sample;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * オブジェクトのリストをテスト<br>
 * http://localhost:8080/jersey-sample/resource/jsonobjectlist
 * 
 * @author n-suzuki
 *
 */
@Path("/jsonobjectlist")
public class JsonResourceObjectList {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<JsonResultDto> hello() {
		
		List<JsonResultDto> dtoList = new ArrayList<JsonResultDto>();
		for (int i = 1; i <= 4; i++) {
			JsonResultDto dto = new JsonResultDto();
			dto.setName1(String.valueOf(i));
			dto.setName2(String.valueOf(i));
			dto.setName3(String.valueOf(i));
			dto.setName4(String.valueOf(i));
			dtoList.add(dto);
		}
		
		return dtoList;
	}
}
