/**
 * 
 */
package jp.co.virtualex.jersey.sample;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * 単純なリソースクラス<br>
 * http://localhost:8080/jersey-sample/resource/simple -> Hello Jersey!
 * 
 * @author n-suzuki
 *
 */
@Path("/simple")
public class SimpleResource {

	@GET
	public String hello() {
		return "Hello Jersey!";
	}
}
