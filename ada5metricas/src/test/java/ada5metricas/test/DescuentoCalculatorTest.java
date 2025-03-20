package ada5metricas.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import ada5metricas.DescuentoCalculator;

public class DescuentoCalculatorTest {
    // Pruebas
     
    @Test 
    public void testCategoriaA() { 
        assertEquals("0.9", DescuentoCalculator.calcularDescuento(1, "A")); 
    } 
     
    @Test 
    public void testCategoriaB() { 
        assertEquals("255.21", DescuentoCalculator.calcularDescuento(300.25, "B")); 
    } 
 
    @Test 
    public void testCategoriaC() { 
        assertEquals("800.0", DescuentoCalculator.calcularDescuento(1000, "C")); 
    } 
 
    @Test 
    public void testPrecioInvalido() { 
        assertEquals("Error: Precio inválido", DescuentoCalculator.calcularDescuento(0, 
"B")); 
    } 
    @Test 
    public void testPrecioInvalido2() { 
        assertEquals("Error: Precio inválido", DescuentoCalculator.calcularDescuento(-20, 
"A")); 
    } 
    @Test 
    public void testCategoriaInvalida() { 
        assertEquals("Error: Categoría inválida", 
DescuentoCalculator.calcularDescuento(50, "D")); 
    } 
    @Test
    public void testCategoriaInvalida2() {
        assertEquals("Error: Precio inválido", DescuentoCalculator.calcularDescuento('b', "A"));
    }
    @Test
    public void testLimites() {
        assertEquals(9.0E+16
        , DescuentoCalculator.calcularDescuento(1.0E+17, "A"));
    }
} 