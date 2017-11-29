package hello.servlet.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpSession;

public class HttpServletDisableSessionRequestWrapper extends HttpServletRequestWrapper {

    /**
     * Constructs a request object wrapping the given request.
     *
     * @param request HttpServletRequest
     * @throws IllegalArgumentException if the request is null
     */
    public HttpServletDisableSessionRequestWrapper(HttpServletRequest request) {
        super(request);
    }

    /**
     * Disable Http Session
     */
    @Override
    public HttpSession getSession() {
        //throw new UnsupportedOperationException("HttpSession is not allowed");
    	return null;
    }

    /**
     * Disable Http Session
     */
    @Override
    public HttpSession getSession(boolean create) {
        if (create) {
        	throw new UnsupportedOperationException("HttpSession is not allowed");
        }
    	return null;
    }

}