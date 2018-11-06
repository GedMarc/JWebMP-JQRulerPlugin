import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;

module com.jwebmp.plugins.jqruler {
	exports com.jwebmp.plugins.jqruler;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;
	requires com.jwebmp.guicedinjection;

	provides IGuiceScanJarExclusions with com.jwebmp.plugins.jqruler.implementations.JQRulerExclusionsModule;
	provides IGuiceScanModuleExclusions with com.jwebmp.plugins.jqruler.implementations.JQRulerExclusionsModule;

	opens com.jwebmp.plugins.jqruler to com.fasterxml.jackson.databind, com.jwebmp.core;
}
