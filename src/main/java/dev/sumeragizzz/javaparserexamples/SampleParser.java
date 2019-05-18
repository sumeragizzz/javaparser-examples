package dev.sumeragizzz.javaparserexamples;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;

public class SampleParser {

	public static void main(String[] args) throws URISyntaxException, IOException {
		SampleParser parser = new SampleParser();
		parser.run();
	}

	public SampleParser() {
	}

	public void run() throws URISyntaxException, IOException {
		URL resource = getClass().getResource("Target.java");
		URI uri = resource.toURI();
		Path path = Paths.get(uri );
		CompilationUnit unit = StaticJavaParser.parse(path);

		unit.walk(node -> System.out.println(node));

		unit.getPackageDeclaration().ifPresent(declaration -> System.out.println(declaration));
	}
}
