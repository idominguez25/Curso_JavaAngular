package test;

import static org.junit.Assert.*;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import JUnit.Junit09_Geometria.dto.Geometria;

class GeometriaTest {

	//Argumentos para comprobar el área del cuadrado.
	private static Stream<Arguments> argumentosCuadrado(){
		return Stream.of(
				Arguments.of(5, 25),
				Arguments.of(6, 36),
				Arguments.of(3, 9));
	}
	
	//Test para comprobar el área del cuadrado.
	@ParameterizedTest
	@MethodSource("argumentosCuadrado")
	public void testAreaCuadrado(int c, int r) {
		int resultado = Geometria.areacuadrado(c);
		assertEquals(r, resultado);
	}
	
	//Argumentos para comprobar el área del círculo.
	private static Stream<Arguments> argumentosCirculo(){
		return Stream.of(
				Arguments.of(4, 50.24),
				Arguments.of(2, 12.56),
				Arguments.of(5, 78.5));
	}
	
	//Test para comprobar el área del círculo.
	@ParameterizedTest
	@MethodSource("argumentosCirculo")
	public void testAreaCirculo(int r, double result) {
		double resultado = Geometria.areacirculo(r);
		assertEquals(result, resultado, 1);
	}
	
	//Argumentos para comprobar el área del triángulo.
	private static Stream<Arguments> argumentosTriangulo(){
		return Stream.of(
				Arguments.of(8, 6, 24),
				Arguments.of(2, 4, 4),
				Arguments.of(6, 5, 15));
	}
	
	//Test para comprobar el área del triángulo.
	@ParameterizedTest
	@MethodSource("argumentosTriangulo")
	public void testAreaTriangulo(int b, int a, int r) {
		int resultado = Geometria.areatriangulo(b, a);
		assertEquals(r, resultado);
	}
	
	//Argumentos para comprobar el área del rectángulo.
	private static Stream<Arguments> argumentosRectangulo(){
		return Stream.of(
				Arguments.of(10, 5, 50),
				Arguments.of(7, 2, 14),
				Arguments.of(9, 3, 27));
	}
	
	//Test para comprobar el área del rectángulo.
	@ParameterizedTest
	@MethodSource("argumentosRectangulo")
	public void testAreaRectangulo(int b, int a, int r) {
		int resultado = Geometria.arearectangulo(b, a);
		assertEquals(r, resultado);
	}
	
	//Argumentos para comprobar el área del pentágono.
	private static Stream<Arguments> argumentosPentagono(){
		return Stream.of(
				Arguments.of(30, 4, 60),
				Arguments.of(20, 3, 30),
				Arguments.of(35, 5, 87.5));
	}
	
	//Test para comprobar el área del pentágono.
	@ParameterizedTest
	@MethodSource("argumentosPentagono")
	public void testAreaPentagono(int p, int a, double r) {
		int resultado = Geometria.areapentagono(p, a);
		assertEquals(r, resultado, 1);
	}
	
	//Argumentos para comprobar el área del rombo.
	private static Stream<Arguments> argumentosRombo(){
		return Stream.of(
				Arguments.of(15, 5, 37.5),
				Arguments.of(20, 13, 130),
				Arguments.of(10, 6, 30));
	}
	
	//Test para comprobar el área del rombo.
	@ParameterizedTest
	@MethodSource("argumentosRombo")
	public void testAreaRombo(int D, int d, double r) {
		double resultado = Geometria.arearombo(D, d);
		assertEquals(r, resultado, 1);
	}
	
	//Argumentos para comprobar el área del romboide.
	private static Stream<Arguments> argumentosRomboide(){
		return Stream.of(
				Arguments.of(11, 7, 77),
				Arguments.of(6, 2, 12),
				Arguments.of(9, 5, 45));
	}
	
	//Test para comprobar el área del romboide.
	@ParameterizedTest
	@MethodSource("argumentosRomboide")
	public void testAreaRomboide(int b, int h, int r) {
		int resultado = Geometria.arearomboide(b, h);
		assertEquals(r, resultado);
	}
	
	//Argumentos para comprobar el área del trapecio.
	private static Stream<Arguments> argumentosTrapecio(){
		return Stream.of(
				Arguments.of(20, 14, 5, 85),
				Arguments.of(12, 6, 4, 36),
				Arguments.of(19, 15, 7, 119));
	}
	
	//Test para comprobar el área del trapecio.
	@ParameterizedTest
	@MethodSource("argumentosTrapecio")
	public void testAreaTrapecio(int B, int b, int h, int r) {
		int resultado = Geometria.areatrapecio(B, b, h);
		assertEquals(r, resultado);
	}
	
	//Test para comprobar que si no le pasamos parámetros al constructor, coge el ID 9.
	@Test
	public void testConstructorVacio() {
		Geometria gm = new Geometria();
		assertEquals(Geometria.getId(), 9);
	}
	
	//TESTS PARA COMPROBAR SI EL ID ESTÁ BIEN RELACIONADO CON EL NOMBRE.
	@Test
	public void testConstructor1() {
		Geometria gm = new Geometria(1);
		assertEquals(Geometria.getNom(), "Cuadrado");
	}
	
	@Test
	public void testConstructor2() {
		Geometria gm = new Geometria(2);
		assertEquals(Geometria.getNom(), "Circulo");
	}
	@Test
	public void testConstructor3() {
		Geometria gm = new Geometria(3);
		assertEquals(Geometria.getNom(), "Triangulo");
	}
	@Test
	public void testConstructor4() {
		Geometria gm = new Geometria(4);
		assertEquals(Geometria.getNom(), "Rectangulo");
	}
	@Test
	public void testConstructor5() {
		Geometria gm = new Geometria(5);
		assertEquals(Geometria.getNom(), "Pentagono");
	}
	@Test
	public void testConstructor6() {
		Geometria gm = new Geometria(6);
		assertEquals(Geometria.getNom(), "Rombo");
	}
	@Test
	public void testConstructor7() {
		Geometria gm = new Geometria(7);
		assertEquals(Geometria.getNom(), "Romboide");
	}
	@Test
	public void testConstructor8() {
		Geometria gm = new Geometria(8);
		assertEquals(Geometria.getNom(), "Trapecio");
	}
	@Test
	public void testConstructor9() {
		Geometria gm = new Geometria(9);
		assertEquals(Geometria.getNom(), "Default");
	}

	//GETTERS Y SETTERS
	@Test
	public void testSetID() {
		Geometria gm = new Geometria(4);
		gm.setId(1);
		assertEquals(Geometria.getId(), 1);
	}
	
	@Test
	public void testSetNom() {
		Geometria gm = new Geometria(2);
		gm.setNom("Default");
		assertEquals(Geometria.getNom(), "Default");
	}
	
	@Test
	public void testGetArea() {
		Geometria gm = new Geometria(1);
		gm.setArea(25);
		assertEquals(Geometria.getArea(), 25, 1);
	}
	
	//Método para comprobar el toString.
	@Test
	public void testToString() {
	Geometria gm = new Geometria (3);
	double areaTriangulo = Geometria.areatriangulo(5, 10);
	gm.setArea(areaTriangulo);
	String testToString = "Geometria [id=" + 3 + ", nom=" + "Triangulo" + ", area=" + 25.0 + "]";

	assertEquals(gm.toString(), testToString);
	}
}
