// 10) WAP to print all system properties.

package pack2;
import java.lang.*;
import java.util.Properties;
public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties jvm=System.getProperties();
		jvm.list(System.out);
	}

}

/*OUTPUT
 * -- listing properties --
user.script=
java.specification.version=14
sun.management.compiler=HotSpot 64-Bit Tiered Compilers
sun.cpu.isalist=amd64
sun.jnu.encoding=Cp1252
java.runtime.version=14.0.2+12-46
java.class.path=C:\Users\Hp\Documents\csw\Assignment2...
user.name=Hp
java.vm.vendor=Oracle Corporation
path.separator=;
sun.arch.data.model=64
os.version=10.0
user.variant=
java.runtime.name=OpenJDK Runtime Environment
java.vendor.url=https://java.oracle.com/
file.encoding=Cp1252
java.vm.specification.version=14
os.name=Windows 10
java.vm.name=OpenJDK 64-Bit Server VM
sun.java.launcher=SUN_STANDARD
user.country=US
sun.boot.library.path=C:\Users\Hp\.p2\pool\plugins\org.ecli...
sun.java.command=pack2.Question10
java.vendor.url.bug=https://bugreport.java.com/bugreport/
java.io.tmpdir=C:\Users\Hp\AppData\Local\Temp\
jdk.debug=release
sun.cpu.endian=little
java.version=14.0.2
user.home=C:\Users\Hp
user.dir=C:\Users\Hp\Documents\csw\Assignment2
user.language=en
os.arch=amd64
java.specification.vendor=Oracle Corporation
java.vm.specification.name=Java Virtual Machine Specification
java.version.date=2020-07-14
java.home=C:\Users\Hp\.p2\pool\plugins\org.ecli...
sun.os.patch.level=
file.separator=\
java.vm.compressedOopsMode=32-bit
line.separator=

java.library.path=C:\Users\Hp\.p2\pool\plugins\org.ecli...
java.vm.specification.vendor=Oracle Corporation
java.specification.name=Java Platform API Specification
java.vm.info=mixed mode
java.vendor=Oracle Corporation
java.vm.version=14.0.2+12-46
sun.io.unicode.encoding=UnicodeLittle
java.class.version=58.0
*/
