package hello.spring.config;

import javax.servlet.Filter;

import org.springframework.web.filter.ShallowEtagHeaderFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import hello.servlet.util.DisableSessionFilter;

public class ServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
 
   @Override
   protected Class<?>[] getRootConfigClasses() {
      return new Class[] { AppConfig.class };
   }
 
   @Override
   protected Class<?>[] getServletConfigClasses() {
      return new Class[] { WebMvcConfig.class };
   }
 
   @Override
   protected String[] getServletMappings() {
      return new String[] { "/" };
   }
   
   @Override
   protected Filter[] getServletFilters() {
     return new Filter[] {new DisableSessionFilter(), new ShallowEtagHeaderFilter()};
   }
}