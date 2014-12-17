/**
 * 
 */
package jp.co.virtualex.jersey.sample;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 * URLでパラメータを受け取る<br>
 * http://localhost:8080/jersey-sample/resource/urlparam/ABC -> Hello ABC!
 * 
 * @author n-suzuki
 *
 */
@Path("/urlparam/{param}")
public class UrlParamResource {

	@GET
	public String hello(@PathParam("param") String param) {
		return "Hello " + param + "!";
	}
}
