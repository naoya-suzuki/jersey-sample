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
 * @author j-nakashima
 *
 */
@Path("/simpleArray")
public class SimpleArrayResource {

	@GET
	public String hello() {
		return "Hello Jersey!";
	}
}
