/**
 * 
 */
package jp.co.virtualex.jersey.sample;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

/**
 * クエリ文字列でパラメータを受け取る<br>
 * http://localhost:8080/jersey-sample/resource/queryparam?param=ABC -> Hello ABC!
 * 
 * @author n-suzuki
 *
 */
@Path("/queryparam")
public class QueryParamResource {

	@GET
	public String hello(@QueryParam("param") String param) {
		return "Hello " + param + "!";
	}
}
