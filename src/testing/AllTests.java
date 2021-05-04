package testing;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;


@RunWith(JUnitPlatform.class)

//Forma 1:

//@SelectPackages("testing")
//@SelectPackages({"paquete1","paquete2"}) 

//@IncludePackages("paquete1")
//@ExcludePackages("paquete2")

//Forma 2:
//@SelectClasses( CalculadoraTest.class )
//@SelectClasses( { CalculadoraTest.class, PersonaTest.class} )


//Forma 3
@SelectPackages("testing")
@IncludeTags("Produccion")
public class AllTests {

}
