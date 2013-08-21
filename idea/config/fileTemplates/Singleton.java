#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")
public class ${NAME}{
    private static volatile ${NAME} sInstance;
    
    private ${NAME}() {
        //
    }

    public static ${NAME} getInstance() {
        ${NAME} localInstance = sInstance;
        if (localInstance == null) {
            synchronized (${NAME}.class) {
                localInstance = sInstance;
                if (localInstance == null) {
                    sInstance = localInstance = new ${NAME}();
                }
            }
        }
        return localInstance;
    }
}
