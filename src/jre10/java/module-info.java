module com.jwebmp.plugins.jqruler {
	exports com.jwebmp.plugins.jqruler;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;

	opens com.jwebmp.plugins.jqruler to com.fasterxml.jackson.databind,com.jwebmp.core;
}
