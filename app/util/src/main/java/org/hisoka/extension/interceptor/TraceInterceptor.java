package org.hisoka.extension.interceptor;

import java.io.IOException;
import javax.annotation.Priority;
import javax.ws.rs.Priorities;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.ext.ReaderInterceptor;
import javax.ws.rs.ext.ReaderInterceptorContext;
import javax.ws.rs.ext.WriterInterceptor;
import javax.ws.rs.ext.WriterInterceptorContext;

/**
 *
 * @author Hinsteny
 * @version $ID: TraceInterceptor 2018-09-06 16:27 All rights reserved.$
 */
@Priority(Priorities.USER)
public class TraceInterceptor implements ReaderInterceptor, WriterInterceptor {

    @Override
    public Object aroundReadFrom(ReaderInterceptorContext readerInterceptorContext) throws IOException, WebApplicationException {
        System.out.println("Reader interceptor invoked");
        return readerInterceptorContext.proceed();
    }

    @Override
    public void aroundWriteTo(WriterInterceptorContext writerInterceptorContext) throws IOException, WebApplicationException {
        System.out.println("Writer interceptor invoked");
        writerInterceptorContext.proceed();
    }
}
