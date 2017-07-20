package filters;

import java.io.IOException;
import java.util.HashSet;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebFilter("*") // url mapping 
public class CommonFilter implements Filter{
	HashSet<String> invalidExts = new HashSet<String>();

    @Override
    public void init(FilterConfig config) throws ServletException {
        invalidExts.add(".css");
        invalidExts.add(".js");
        invalidExts.add(".img");
        invalidExts.add(".png");
        invalidExts.add(".jpg");
        invalidExts.add(".jpeg");
        invalidExts.add(".gif");
        invalidExts.add(".woff");
        invalidExts.add(".woff2");
        invalidExts.add(".ttf");
        invalidExts.add(".eot");
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;

        String context = request.getContextPath();
        String uri = request.getRequestURI();
        String qStr = request.getQueryString();

        if (!uri.endsWith("/") && uri.length() > context.length() && isPage(uri)) {
            if (uri.endsWith(".jsp")) {
                String path = uri.substring(0, uri.lastIndexOf(".jsp"));
                if (qStr != null && qStr.length() > 0)
                    path += "?" + qStr;
                response.sendRedirect(path);
            } else {
                String path = uri.substring(context.length()).replace("-", "_");
                req.getRequestDispatcher(path + ".jsp").forward(req, res);
            }
        } else chain.doFilter(req, res);
    }

    @Override
    public void destroy() {
    }

    private boolean isPage(String uri) {
        boolean result = true;
        String ext = null;

        if (uri != null) {
            if (uri.contains("."))
                ext = uri.substring(uri.lastIndexOf("."));

            if (ext != null && invalidExts.contains(ext))
                result = false;
        }

        return result;
    }
}