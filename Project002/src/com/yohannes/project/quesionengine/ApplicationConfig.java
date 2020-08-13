package com.yohannes.project.quesionengine;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/*")
public class ApplicationConfig extends Application {
 @Override
public Set<Class<?>> getClasses() {
	 Set<Class<?>> s = new HashSet<Class<?>>();
     s.add(QuestionServer.class);
     s.add(SubjectServer.class);
     s.add(MenuServer.class);
     s.add(CategoryServer.class);
     return s;
}
}
