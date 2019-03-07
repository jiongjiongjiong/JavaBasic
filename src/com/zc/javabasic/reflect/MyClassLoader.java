package com.zc.javabasic.reflect;





import java.io.*;

/**
 * @description:
 * @author: Zhangc
 * @date: 2019-03-04
 */

public class MyClassLoader extends ClassLoader{
    private String path;
    private String classLoaderName;

    public MyClassLoader(String path, String classLoaderName) {
        this.path = path;
        this.classLoaderName = classLoaderName;
    }

    @Override
    public Class findClass(String name){
        byte[] b = loadClassData(name);
        return defineClass(name, b, 0, b.length);
    }

    private byte[] loadClassData(String name)  {
        name = path + name + ".class";
        InputStream in = null;
        System.out.println(name);
        ByteArrayOutputStream out = null;
        try {
            in = new FileInputStream(new File(name));
            out = new ByteArrayOutputStream();
            int i = 0;
            while ((i = in.read()) != -1){
                out.write(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return out.toByteArray();
    }
}
