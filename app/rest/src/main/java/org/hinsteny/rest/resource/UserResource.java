package org.hinsteny.rest.resource;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.hinsteny.model.vos.UserInfo;
import org.hinsteny.rest.request.RegisterRequest;
import org.hinsteny.share.result.CommonResult;

/**
 * @author Hinsteny
 * @version $ID: UserResource 2018-04-03 20:28 All rights reserved.$
 */
@Path("/users")
@Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
public interface UserResource {

    /**
     * 用户注册
     * @param id
     * @return
     */
    @GET
    @Path("{id : \\d+}")
    CommonResult<UserInfo> getUser(@PathParam("id")Long id);

    /**
     * 用户注册
     * @param registerRequest
     * @return
     */
    @POST
    @Path("/register")
    CommonResult<Boolean> register(RegisterRequest registerRequest);

}
