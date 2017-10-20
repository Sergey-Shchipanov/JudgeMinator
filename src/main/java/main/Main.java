package main;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.FilterHolder;
import org.eclipse.jetty.servlet.ServletHolder;
import org.eclipse.jetty.webapp.WebAppContext;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.DelegatingFilterProxy;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.DispatcherType;
import java.io.InputStream;
import java.util.EnumSet;
import java.util.Properties;

/**
 * @author anshipanov
 */
public class Main {

    public static void main(String... args) throws Exception {
        AnnotationConfigWebApplicationContext webContext = new AnnotationConfigWebApplicationContext();
        webContext.register(WebContext.class);

        // определяем стандартный сервлет Spring MVC
        ServletHolder servletHolder = new ServletHolder("test-dispatcher", new DispatcherServlet(webContext));
        servletHolder.setAsyncSupported(true);
        servletHolder.setInitOrder(1);

        // определяем стандартный фильтр Spring Security
        FilterHolder filterHolder = new FilterHolder(new DelegatingFilterProxy("springSecurityFilterChain"));
        filterHolder.setAsyncSupported(true);

        // определяем веб-контекст Jetty
        WebAppContext webAppContext = new WebAppContext();
        // указываем класс контекста приложения
        webAppContext.setInitParameter("contextConfigLocation", ApplicationContext.class.getName());
        // базовая папка проекта, где находится WEB-INF
        webAppContext.setResourceBase("resource");
        // назначаем стандартного слушателя, Context Path, созданные сервлет и фильтр
        webAppContext.addEventListener(new ContextLoaderListener(webContext));
        webAppContext.addServlet(servletHolder, "/");
        webAppContext.addFilter(filterHolder, "/*", EnumSet.of(DispatcherType.REQUEST, DispatcherType.ERROR));

        // запускаем сервер
        Server server = new Server(8080);
        server.setHandler(webAppContext);
        server.start();
        server.join();
    }
}
