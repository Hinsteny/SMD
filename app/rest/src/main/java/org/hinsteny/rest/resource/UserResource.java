package org.hinsteny.rest.resource;

import org.hinsteny.rest.request.RegisterRequest;
import org.hinsteny.share.result.CommonResult;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author Hinsteny
 * @version $ID: UserResource 2018-04-03 20:28 All rights reserved.$
 */
@Produces({ MediaType.APPLICATION_JSON + "; " + MediaType.CHARSET_PARAMETER + "=UTF-8",
        MediaType.TEXT_XML + "; " + MediaType.CHARSET_PARAMETER + "=UTF-8" })
@Path("/users")
public interface UserResource {

    /**
     * 用户注册
     * @param registerRequest
     * @return
     */
    @POST
    @Path("/register")
    CommonResult<Boolean> register(RegisterRequest registerRequest);

}
