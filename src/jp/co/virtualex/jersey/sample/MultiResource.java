/**
 * 
 */
package jp.co.virtualex.jersey.sample;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * 1つのクラスで複数のサービスを提供する<br>
 * http://localhost:8080/jersey-sample/resource/multi -> Hello Jersey!<br>
 * http://localhost:8080/jersey-sample/resource/multi/multi2 -> Hello Jersey2!<br>
 * 「@Path」が付与されていないメソッドが複数あると起動時にエラーとなる
 * 
 * @author n-suzuki
 *
 */
@Path("/multi")
public class MultiResource {

	@GET
	public String hello() {
		return "Hello Jersey!";
	}
	
	@GET
	@Path("multi2")
	public String hello2() {
		return "Hello Jersey2!";
	}
}
