package insure.commission.utility;

import java.util.Locale;
import java.util.Objects;

public class OperatingSystemProducer {

    public static OperatingSystem getCurrent() {
        OperatingSystem returnValue;
        String osName;
        
        osName = Objects.requireNonNull(System.getProperty("os.name"));
        osName = osName.toLowerCase(Locale.ENGLISH);

        if (osName.contains("windows")) {
            returnValue = OperatingSystem.WINDOWS;
        } else if (osName.contains("linux")
            || osName.contains("mpe/ix")
            || osName.contains("freebsd")
            || osName.contains("irix")
            || osName.contains("digital unix")
            || osName.contains("unix")) {
            returnValue = OperatingSystem.UNIX;
        } else if (osName.contains("mac os")) {
            returnValue = OperatingSystem.MAC;
        } else if (osName.contains("sun os")
            || osName.contains("sunos")
            || osName.contains("solaris")) {
            returnValue = OperatingSystem.POSIX_UNIX;
        } else if (osName.contains("hp-ux")
            || osName.contains("aix")) {
            returnValue = OperatingSystem.POSIX_UNIX;
        } else {
            returnValue = OperatingSystem.OTHER;
        }
        
        return returnValue;
    }
}
