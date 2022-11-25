package utils;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class LoadDynamicallyJarFile {

    public static void main(String[] args) {
        File jarFile = new File("C:\\Users\\berna\\Desktop\\TestProjectForHowToGetSuffsFromJarFile-1.0-SNAPSHOT.jar");
        String className = "com.nasobokcisla.NasobokCisla";

        try {
            URL fileURL = jarFile.toURI().toURL();
            String jarURL = "jar:" + fileURL + "!/";
            URL[] urls = {new URL(jarURL)};
//            URLClassLoader ucl = new URLClassLoader(urls);

            ClassLoader classLoader = new URLClassLoader(urls);
            Class<?> cls = classLoader.loadClass(className);
            Method method = cls.getDeclaredMethod("main", String[].class);
            cls.getDeclaredConstructor().newInstance();
            method.invoke(null, (Object) args);


//            Object m = Class.forName(className, true, ucl).newInstance();
        } catch (MalformedURLException | InstantiationException | IllegalAccessException | ClassNotFoundException | InvocationTargetException | NoSuchMethodException ex) {
            ex.printStackTrace();
        }

    }
}
