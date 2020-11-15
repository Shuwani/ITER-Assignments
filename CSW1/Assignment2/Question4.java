//4) WAP to read and display all the environment variable.
package pack2;
import java.util.Map;
public class Question4 {
	public static void main(String[] args) {
		Map <String,String>env=System.getenv();
		for(Map.Entry<String, String>entry:env.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}
}

/*OUTPUT
USERDOMAIN_ROAMINGPROFILE : DESKTOP-5KBCS2A
LOCALAPPDATA : C:\Users\Hp\AppData\Local
PROCESSOR_LEVEL : 21
USERDOMAIN : DESKTOP-5KBCS2A
FPS_BROWSER_APP_PROFILE_STRING : Internet Explorer
LOGONSERVER : \\DESKTOP-5KBCS2A
SESSIONNAME : Console
ALLUSERSPROFILE : C:\ProgramData
PROCESSOR_ARCHITECTURE : AMD64
PSModulePath : C:\Windows\system32\WindowsPowerShell\v1.0\Modules\
SystemDrive : C:
APPDATA : C:\Users\Hp\AppData\Roaming
USERNAME : Hp
ProgramFiles(x86) : C:\Program Files (x86)
CommonProgramFiles : C:\Program Files\Common Files
Path : C:/Users/Hp/.p2/pool/plugins/org.eclipse.justj.openjdk.hotspot.jre.full.win32.x86_64_14.0.2.v20200815-0932/jre/bin/server;C:/Users/Hp/.p2/pool/plugins/org.eclipse.justj.openjdk.hotspot.jre.full.win32.x86_64_14.0.2.v20200815-0932/jre/bin;C:\ProgramData\Oracle\Java\javapath;C:\Windows\system32;C:\Windows;C:\Windows\System32\Wbem;C:\Windows\System32\WindowsPowerShell\v1.0\;C:\Users\Hp\Desktop;
FPS_BROWSER_USER_PROFILE_STRING : Default
PATHEXT : .COM;.EXE;.BAT;.CMD;.VBS;.VBE;.JS;.JSE;.WSF;.WSH;.MSC
OS : Windows_NT
COMPUTERNAME : DESKTOP-5KBCS2A
PROCESSOR_REVISION : 7000
CommonProgramW6432 : C:\Program Files\Common Files
ComSpec : C:\Windows\system32\cmd.exe
ProgramData : C:\ProgramData
ProgramW6432 : C:\Program Files
HOMEPATH : \Users\Hp
SystemRoot : C:\Windows
TEMP : C:\Users\Hp\AppData\Local\Temp
HOMEDRIVE : C:
PROCESSOR_IDENTIFIER : AMD64 Family 21 Model 112 Stepping 0, AuthenticAMD
USERPROFILE : C:\Users\Hp
TMP : C:\Users\Hp\AppData\Local\Temp
CommonProgramFiles(x86) : C:\Program Files (x86)\Common Files
ProgramFiles : C:\Program Files
PUBLIC : C:\Users\Public
NUMBER_OF_PROCESSORS : 2
windir : C:\Windows
=:: : ::\
*/