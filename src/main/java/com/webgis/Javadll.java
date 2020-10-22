package com.webgis;

/**
 * @BelongProject:webgis
 * @BelongPackage:com.webgis
 * @Author:cc
 * @CreateTime:2020-10-21-10-40
 * @Description:正反解析edp的函数
 */
public class Javadll {
    static {
        System.loadLibrary("CryptFile_forjava");
    }

    public Javadll() {
    }

    public native boolean sCompressFile(String ZipFile, String ExtractDir);

    public native boolean sUnCompressFile(String ZipFile, String ExtractDir);

    public native void EncryptFileEx(String var1, String var2, String var3);

    public native void DecryptFileEx(String var1, String var2);

}
